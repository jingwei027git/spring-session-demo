package com.softpower.demo.springsession.domain.user.service;

import com.softpower.demo.springsession.core.annotation.transactional.NonTx;
import com.softpower.demo.springsession.core.annotation.transactional.TxRead;
import com.softpower.demo.springsession.domain.user.jpa.UserJpa;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@TxRead
@Service
public class UserServiceImpl implements UserService {

    @Getter(onMethod = @__({@NonTx}))
    @Autowired
    private UserJpa jpa;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return jpa.findByUsername(username).orElse(null);
    }

}
