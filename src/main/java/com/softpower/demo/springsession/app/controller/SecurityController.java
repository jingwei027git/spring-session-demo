package com.softpower.demo.springsession.app.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.softpower.demo.springsession.app.dto.SecurityDto;

@RequestMapping("/security")
@RestController
public class SecurityController {

    @Autowired
    protected HttpServletRequest request;


    @GetMapping("/currentUser")
    public ResponseEntity<SecurityDto> readCurrentUser() {
        final SecurityDto dto = new SecurityDto();
        dto.setUsername(SecurityContextHolder.getContext().getAuthentication().getName());

        return new ResponseEntity<>(dto, HttpStatus.OK);
    }

}

