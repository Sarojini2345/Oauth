package com.ld.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ld.dao.LoginRepository;
import com.ld.entity.LoginEntity;

@RestController
public class LoginController {
	    @Autowired
	    private LoginRepository userRepository;

	    @GetMapping("/user")
	    public Authentication getUser(@AuthenticationPrincipal OAuth2User principal) {
	    	Authentication auth=SecurityContextHolder.getContext().getAuthentication();
			return auth;
//	        String email = principal.getAttribute("email");
//	        LoginEntity existingUser = userRepository.findByEmail(email);
//	        if (existingUser != null) {
//	            return existingUser;
//	        } else {
//	            // Create a new user if not exists
//	        	LoginEntity newUser = new LoginEntity();
//	            newUser.setEmail(email);
//	            newUser.setUsername(principal.getAttribute("name"));
//	            return userRepository.save(newUser);
//	        }
	    }
	   
}
