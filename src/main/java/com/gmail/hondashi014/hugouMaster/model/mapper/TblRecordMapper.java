package com.gmail.hondashi014.hugouMaster.model.mapper;

import java.sql.Time;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TblRecordMapper {

	int insert(int userId, Time userRecord, int mode);
}
