package com.gmail.hondashi014.hugouMaster.auth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.gmail.hondashi014.hugouMaster.model.domain.MstUser;
import com.gmail.hondashi014.hugouMaster.model.mapper.MstUserMapper;

@Service
public class MstUserDetailsService implements UserDetailsService{

	@Autowired
	MstUserMapper userMapper;

	@Override
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
		MstUser user = userMapper.findByUserId(userName);
		if(user == null) {
			throw new UsernameNotFoundException("not found : " + userName);
		}

		return user;
	}
}
