package com.orange.ihm_eclipse.GENOS.web.controller;

import org.springframework.context.annotation.Configuration;  
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;  
import org.springframework.security.config.annotation.web.builders.HttpSecurity;  
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;  
@Configuration  

public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
	
	public void configure(HttpSecurity http) throws Exception {  
        http  
            .authorizeRequests()  
            .anyRequest().authenticated()  
            .and()  
            .httpBasic();  
	}
	
	  protected void configure(AuthenticationManagerBuilder auth) throws Exception {  
	        ((Object) auth.inMemoryAuthentication())  
	            .withUser("user")  
	            .password("{noop}pass") // Spring Security 5 requires specifying the password storage format  
	            .roles("USER");  
	    }  
}
