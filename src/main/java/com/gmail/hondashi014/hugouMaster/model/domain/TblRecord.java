package com.gmail.hondashi014.hugouMaster.model.domain;

import java.sql.Time;
import java.sql.Timestamp;

public class TblRecord {

	private int id;
	private int userId;
	private Time userRecord;
	private int mode;
	private Timestamp createdAt;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public Time getUserRecord() {
		return userRecord;
	}
	public void setUserRecord(Time userRecord) {
		this.userRecord = userRecord;
	}
	public int getMode() {
		return mode;
	}
	public void setMode(int mode) {
		this.mode = mode;
	}
	public Timestamp getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}
}
