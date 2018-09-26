package com.dafy.web.service.impl;

import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

/**
 * @Auther: admin
 * @Date: 2018/9/21 14:16
 * @Description:
 */
@Component
public class UserDetailServiceImpl implements UserDetailsService {
    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        // 封装用户信息，并返回。参数分别是：用户名，密码，用户权限
        User user = new User(s, new BCryptPasswordEncoder().encode("123456"),
                AuthorityUtils.commaSeparatedStringToAuthorityList("admin"));
        return user;
    }
}
