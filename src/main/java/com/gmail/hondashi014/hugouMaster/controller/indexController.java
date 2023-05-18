package com.gmail.hondashi014.hugouMaster.controller;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gmail.hondashi014.hugouMaster.auth.MstUserDetailsService;
import com.gmail.hondashi014.hugouMaster.model.domain.MstUser;
import com.gmail.hondashi014.hugouMaster.model.mapper.MstUserMapper;
import com.gmail.hondashi014.hugouMaster.service.MstUserServiceImpl;


@Controller
@RequestMapping("/hugouMaster")
public class indexController {

	@Autowired
	MstUserMapper userMapper;
	
	@Autowired
	MstUserServiceImpl userServiceImpl;

	@Autowired
	MstUserDetailsService userDetailsService;

	@GetMapping("/")
	public String index(Principal principal, Model model) {
		MstUser loginUser = userServiceImpl.getLoginUser(principal);
		List<MstUser> users = userMapper.findAll();
		model.addAttribute("users", users);
		model.addAttribute("loginUser", loginUser);
		return "index";
	}
	
	@GetMapping("/test")
	public String test() {
		return "test";
	}
	

}
