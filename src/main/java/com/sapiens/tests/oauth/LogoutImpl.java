package com.sapiens.tests.oauth;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.web.authentication.logout.LogoutSuccessHandler;

public class LogoutImpl implements LogoutSuccessHandler {

	private TokenStore tokenstore;
	
	public TokenStore getTokenstore() {
		return tokenstore;
	}
	
	public void setTokenstore(TokenStore tokenstore) {
		this.tokenstore = tokenstore;
	}
	
	@Override
	public void onLogoutSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication)
			throws IOException, ServletException {
		System.out.println("logout success");
	}

}
