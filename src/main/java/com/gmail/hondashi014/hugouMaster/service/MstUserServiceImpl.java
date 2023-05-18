package com.gmail.hondashi014.hugouMaster.service;

import java.security.Principal;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

import com.gmail.hondashi014.hugouMaster.model.domain.MstUser;

@Service
public class MstUserServiceImpl implements MstUserService{

	public MstUser getLoginUser(Principal principal) {
		MstUser loginUser = new MstUser("ゲスト");
		if(principal != null) {
			Authentication authentication = (Authentication) principal;
			loginUser = (MstUser) authentication.getPrincipal();
		}

		return loginUser;
	
	};
}
