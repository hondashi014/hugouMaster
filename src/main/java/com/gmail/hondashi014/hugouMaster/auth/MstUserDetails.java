package com.gmail.hondashi014.hugouMaster.auth;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.gmail.hondashi014.hugouMaster.model.domain.MstUser;


public class MstUserDetails implements UserDetails{
	private final MstUser user;

	public MstUserDetails(MstUser user) {
		this.user = user;
	}
	
	public MstUser getUser() {
		return user;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return null;
	}
	
	@Override
	public String getPassword() {
		return user.getPassword();
	}
	
	@Override
	public String getUsername() {
		return user.getUserId();
	}
	
	public int getId() {
		return user.getId();
	}

	public String getUserNickName() {
		return user.getUserName();
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO 自動生成されたメソッド・スタブ
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO 自動生成されたメソッド・スタブ
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO 自動生成されたメソッド・スタブ
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO 自動生成されたメソッド・スタブ
		return true;
	}
}
