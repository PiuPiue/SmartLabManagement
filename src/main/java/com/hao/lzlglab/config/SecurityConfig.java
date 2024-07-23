package com.hao.lzlglab.config;

import com.fasterxml.jackson.databind.ObjectMapper;
//import com.hao.lzlglab.filter.JwtValidationFilter;
import com.hao.lzlglab.dao.SysUserDao;
import com.hao.lzlglab.entity.SysUserExample;
import com.hao.lzlglab.filter.JwtValidationFilter;
import com.hao.lzlglab.utils.JwtUtils;
import com.hao.lzlglab.utils.Result;
import com.hao.lzlglab.utils.ResultCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.SecurityBuilder;
import org.springframework.security.config.annotation.SecurityConfigurerAdapter;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import java.io.PrintWriter;
import java.util.Properties;

@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private UserDetailsService userDetailsService;

    @Autowired
    private SysUserDao sysUserDao;


    @Bean
    @Override
    public AuthenticationManager authenticationManagerBean() throws Exception {
        return super.authenticationManagerBean();
    }

    @Override
    public void configure(AuthenticationManagerBuilder auth) throws Exception {
        //配置校验方法密码方法
        auth.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder());
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.cors().and().csrf().disable().authorizeRequests()
                .antMatchers("/login", "/v2/api-docs", "/swagger-ui.html", "/webjars/**", "/swagger-resources/**")
                .permitAll().antMatchers(HttpMethod.OPTIONS).permitAll().anyRequest().authenticated()
                .and().sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);

        http.formLogin().loginProcessingUrl("/login").successHandler((req,resp,auth)->{
            System.out.println("登录成功后返回。。。。"+auth);
            resp.setContentType("application/json;charset=UTF-8");
            PrintWriter pw = resp.getWriter();
            SysUserExample sysUserExample = new SysUserExample();
            sysUserExample.createCriteria().andUsernameEqualTo(auth.getName());
            String token = JwtUtils.generateJwtStr(sysUserDao.selectByExample(sysUserExample).get(0));
            Properties prop = new Properties();
            prop.setProperty("token", token);
            Result<Properties> r = Result.success(prop);
            ObjectMapper mapper = new ObjectMapper();
            mapper.writeValue(pw, r);
            pw.close();
        }).failureHandler((req,resp,auth)->{
            System.out.println("登录失败:"+auth);
            resp.setContentType("application/json;charset=UTF-8");
            PrintWriter pw = resp.getWriter();
            Result<String> r = Result.error(ResultCode.USERNAME_EXIST);//需要修改
            ObjectMapper mapper = new ObjectMapper();
            mapper.writeValue(pw, r);
            pw.close();
        }).and().logout().logoutUrl("/logout").logoutSuccessHandler((req,resp,auth)->{
            System.out.println("登出成功！:"+auth);
            String token = req.getHeader("Authorization");
            String username = JwtUtils.getUsername(token);
            resp.setContentType("application/json;charset=UTF-8");
            PrintWriter pw = resp.getWriter();
            Result<String> r = Result.success(username+"注销成功！");
            ObjectMapper mapper = new ObjectMapper();
            mapper.writeValue(pw, r);
            pw.close();
        }).clearAuthentication(true).invalidateHttpSession(true);

        // 如果是返回页面，那么可以自定义页面，用AccessDeniedHandler进行处理。这样就会在你定义的失败页面中显示出来如果权限不够，访问拒绝的页面内容。
        http.exceptionHandling().authenticationEntryPoint((req, resp, accessDeniedException) -> {
            resp.setContentType("application/json;charset=UTF-8");
            PrintWriter pw = resp.getWriter();
            Result<String> r = Result.error(ResultCode.USERNAME_EXIST);
            ObjectMapper mapper = new ObjectMapper();
            mapper.writeValue(pw, r);
            pw.close();
        });
        HttpSecurity.RequestMatcherConfigurer rmc = http.requestMatchers();
       http.addFilterBefore(jwtFilter(), UsernamePasswordAuthenticationFilter.class);
    }

    @Bean
    @Order(0)
    public JwtValidationFilter jwtFilter() {
        return new JwtValidationFilter();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return  NoOpPasswordEncoder.getInstance();
    }


}
