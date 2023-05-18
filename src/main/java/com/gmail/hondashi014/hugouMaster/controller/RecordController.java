package com.gmail.hondashi014.hugouMaster.controller;

import java.sql.Time;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gmail.hondashi014.hugouMaster.model.form.RecordForm;
import com.gmail.hondashi014.hugouMaster.model.mapper.TblRecordMapper;

@Controller
@RequestMapping("/hugouMaster/record")
public class RecordController {

	@Autowired
	TblRecordMapper recordMapper;

	@PostMapping("/new")
	public String record(RecordForm form) {

		Time userRecord = new Time(form.getUserRecord());
		
		recordMapper.insert(form.getUserId(), userRecord, form.getMode());

		return "redirect:/hugouMaster/";
	}
}
