package com.gmail.hondashi014.hugouMaster.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.gmail.hondashi014.hugouMaster.model.domain.MstUser;
import com.gmail.hondashi014.hugouMaster.model.form.signUpForm;
import com.gmail.hondashi014.hugouMaster.model.mapper.MstUserMapper;

@Controller
public class UserController {

	@Autowired
	MstUserMapper userMapper;
	
	@Autowired
	PasswordEncoder passwordEncoder;
	
	@GetMapping("/signUp")
	public String signUp() {
		return "signUp";
	}
	
	@PostMapping("/signUp")
	public String newUser(signUpForm form) { 
		MstUser user = new MstUser();
		user.setUserId(form.getUserId());
		user.setUserName(form.getUserName());
		user.setPassword(passwordEncoder.encode(form.getPassword()));
		userMapper.insert(user);
		
		return "redirect:/hugouMaster/";
	}
}
