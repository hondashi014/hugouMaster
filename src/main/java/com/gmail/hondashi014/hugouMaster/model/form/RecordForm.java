package com.gmail.hondashi014.hugouMaster.model.form;

import java.io.Serializable;

public class RecordForm implements Serializable{
	
	private int userId;
	private long userRecord;
	private int mode;

	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public long getUserRecord() {
		return userRecord;
	}
	public void setUserRecord(long userRecord) {
		this.userRecord = userRecord;
	}
	public int getMode() {
		return mode;
	}
	public void setMode(int mode) {
		this.mode = mode;
	}

}
