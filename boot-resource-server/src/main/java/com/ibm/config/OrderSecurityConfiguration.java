package com.ibm.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class OrderSecurityConfiguration extends WebSecurityConfigurerAdapter {
	
	@Value("${user.security.role}")
    private String userSecurityRole;

	@Value("${user.security.authorities}")
    private String userSecurityAuth;
	
	@Value("${user.security.user}")
    private String userName;
	
	@Value("${user.security.pwd}")
    private String userPwd;

    @Override
    public void configure(WebSecurity web) throws Exception {
        web.ignoring().antMatchers("/resources/**").and().ignoring().antMatchers("/h2-console/**");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests().antMatchers("/").permitAll().antMatchers("/user/getOrderList")
            .hasAnyRole(this.userSecurityRole).anyRequest().authenticated().and().formLogin()
            .permitAll().and().logout().permitAll();

        http.csrf().disable();
    }

    @Override
    public void configure(AuthenticationManagerBuilder authenticationMgr) throws Exception {
        authenticationMgr.inMemoryAuthentication().withUser(this.userName).password(this.userPwd)
            .authorities(this.userSecurityAuth);
    }
}
