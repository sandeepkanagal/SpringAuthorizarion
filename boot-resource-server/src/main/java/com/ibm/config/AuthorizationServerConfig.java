package com.ibm.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;

@Configuration
@EnableAuthorizationServer
public class AuthorizationServerConfig extends AuthorizationServerConfigurerAdapter {
	
	@Value("${user.authorization.clientid}")
    private String clientId;

	@Value("${user.authorization.secret}")
    private String clientPwd;
	
	@Value("${user.authorization.authorizedGrantTypes}")
    private String grantsType;
	
	@Value("${user.authorization.scopes}")
    private String scopes;
	
	@Value("${user.authorization.authorities}")
    private String authorities;

    @Override
    public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
        clients.inMemory().withClient(this.clientId).secret(this.clientPwd).authorizedGrantTypes(this.grantsType)
            .scopes(this.scopes).authorities(this.authorities);
    }
}