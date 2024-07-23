package com.hao.lzlglab.filter;

import org.springframework.security.authentication.AbstractAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;

public class JwtAuthenticationToken extends AbstractAuthenticationToken{
	private static final long serialVersionUID = 1L;
	private String credentials;
	private String principal;
	public JwtAuthenticationToken(UserDetails user) {
		super(user.getAuthorities());
		System.out.println("JwtAuthenticationToken有用吗？");
		super.setAuthenticated(true);
		super.setDetails(user);
		this.credentials = user.getPassword();
		this.principal = user.getUsername();
	}
	public JwtAuthenticationToken(Collection<? extends GrantedAuthority> authorities) {
		super(authorities);
	}

	@Override
	public Object getCredentials() {
		// TODO Auto-generated method stub
		return credentials;
	}

	@Override
	public Object getPrincipal() {
		// TODO Auto-generated method stub
		return principal;
	}

}
