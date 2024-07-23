//package com.hao.lzlglab.filter;
//
//
//import com.hao.lzlglab.utils.JwtUtils;
//import io.jsonwebtoken.ExpiredJwtException;
//import io.jsonwebtoken.MalformedJwtException;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.util.StringUtils;
//import org.springframework.web.filter.OncePerRequestFilter;
//
//import javax.servlet.FilterChain;
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//
//public class JwtValidationFilter extends OncePerRequestFilter{
//
//	@Autowired
//	private UserDetailsService userDetailService;
//
//	public JwtValidationFilter() {
//		System.out.println("创建JwtValidationFilter...................");
//	}
//
//
//	@Override
//	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
//			throws ServletException, IOException {
//			System.out.println("jwt校验。。。。。。。。。。。。。。。。。"+request.getRequestURI());
//			String token = request.getHeader("Authorization");
//			System.out.println("token: "+token);
//			if(!StringUtils.hasLength(token)) {
//				token = request.getParameter("Authorization");
//			}
////			if(!StringUtils.hasLength(token)) {
////				response.setContentType("application/json;charset=UTF-8");
////				PrintWriter pw = response.getWriter();
////				Response<String> r = Response.error(ResponseCodeEnum.LOGIN_ERROR,"请登录！");
////				ObjectMapper mapper = new ObjectMapper();
////				mapper.writeValue(pw, r);
////				pw.close();
////				return ;
////			}
//			try {
//				if(StringUtils.hasText(token)) {
//					String username = JwtUtils.getUsername(token);
//					UserDetails user = userDetailService.loadUserByUsername(username);
//					JwtAuthenticationToken auth = new JwtAuthenticationToken(user);
//					SecurityContextHolder.getContext().setAuthentication(auth);
//				}
//			}catch (MalformedJwtException e) {
//				throw new UsernameNotFoundException("token无效，请重新登录！");
//			}catch (ExpiredJwtException e) {
//				throw new UsernameNotFoundException("token过期，请重新登录！");
//			}catch (RuntimeException e) {
//				e.printStackTrace();
//				throw new UsernameNotFoundException("未验证，请重新登录！");
//			}
//			filterChain.doFilter(request, response);
//	}
//}
