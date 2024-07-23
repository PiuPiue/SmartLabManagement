//package com.hao.lzlglab.service.security;
//
//import com.hao.lzlglab.dao.SysUserDao;
//import com.hao.lzlglab.entity.SysUserExample;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//@Service
//public class UserDetailServiceImpl implements UserDetailsService {
//
//    @Autowired
//    private SysUserDao sysUserDao;
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        SysUserExample example = new SysUserExample();
//        example.createCriteria().andUsernameEqualTo(username);
//        if (sysUserDao.selectByExample(example).size() > 0) {
//            return sysUserDao.selectByExample(example).get(0);
//        }
//        return null;
//    }
//}
