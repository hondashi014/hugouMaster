package com.gmail.hondashi014.hugouMaster.model.form;

import java.io.Serializable;

public class signUpForm implements Serializable{

	private String userId;
	private String userName;
	private String password;

	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
