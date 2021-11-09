package com.utility;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/*
 * this class is primarily designed to 
 * configure security setting for my login functionality
 * 
 * 
 */


@Configuration
@EnableWebSecurity
public class SpringSecurityConfiguration extends WebSecurityConfigurerAdapter{
	
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.csrf().
			disable()
			
			//allows restricting access based on httpServletRequest
				.authorizeRequests()
			//allows me to define layers of defense
				.antMatchers(HttpMethod.OPTIONS, "/**")
			//all requests are allowed on this path
				.permitAll()
			//requests must be authenticated
				.anyRequest()
				.authenticated()
			//provides http basic authentication defaults
				.and()
				.httpBasic();
		
	}
	

}
