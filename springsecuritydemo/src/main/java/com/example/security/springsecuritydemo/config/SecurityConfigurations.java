package com.example.security.springsecuritydemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfigurations {
	@Bean
	public SecurityFilterChain customSecurityFilterChain(HttpSecurity http) throws Exception {
		http.authorizeHttpRequests(
				requests ->requests
				.requestMatchers("/bank/info").permitAll()
				.requestMatchers("/bank/update", "/bank/delete","/bank/admin").hasRole("admin")
				.requestMatchers("/bank/balance").hasAnyRole("user","admin")
				.requestMatchers("/bank/user").hasRole("user")
				.requestMatchers("/").hasAnyRole("user","admin")
				.anyRequest()
				//.requestMatchers("/bank/update", "/bank/delete","/bank/user","/bank/admin")
				.authenticated());
				
		http.formLogin(Customizer.withDefaults());
		http.httpBasic(Customizer.withDefaults());
		return http.build();
	}
	@Bean
	public InMemoryUserDetailsManager userDetailsService() {
		UserDetails user1 = User.withUsername("satish")
				  				.password("kumar")
				  				.roles("admin")
				  				.build();
 
		UserDetails user2 = User.withUsername("praveen")
								 .password("kumar")
								 .roles("user")
								 .build();
		
		return new InMemoryUserDetailsManager(user1,user2);
 
	}
	@Bean
	public PasswordEncoder encoder() {
	    return NoOpPasswordEncoder.getInstance();
	}
	
	
}
