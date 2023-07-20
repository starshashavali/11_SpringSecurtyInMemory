package com.tcs.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeHttpRequests().
		antMatchers("/ministatements").authenticated().
		antMatchers("/balance").authenticated().
		antMatchers("/contact").permitAll().
		antMatchers("/home").permitAll()
		.and().formLogin()
		.and().httpBasic();
	}
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
auth.inMemoryAuthentication()
.withUser("shasha").password("root").authorities("admin").and()
.withUser("Ashok").password("root").authorities("read").and()
.withUser("Subbu").password("root").authorities("read").and()
.passwordEncoder(NoOpPasswordEncoder.getInstance());

		super.configure(auth);
	}
}
