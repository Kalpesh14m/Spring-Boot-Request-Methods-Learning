package com.kalpesh.demospring.hello;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {

		auth.inMemoryAuthentication().withUser("kalpesh").password("kalpesh.1").roles("USER").and().withUser("bunny")
				.password("bunny.1").roles("ADMIN");
	}

	@Bean
	public PasswordEncoder getPassEncoder() {
		return NoOpPasswordEncoder.getInstance();
	}
}
