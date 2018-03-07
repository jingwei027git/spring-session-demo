package com.softpower.demo.springsession;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@SpringBootApplication
public class SpringSessionApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSessionApplication.class, args);
	}

	@GetMapping("/")
    public String toIndex() {
	    return "index";
    }

    @GetMapping("/login")
    public String toLogin() {
        return "login";
    }

}
