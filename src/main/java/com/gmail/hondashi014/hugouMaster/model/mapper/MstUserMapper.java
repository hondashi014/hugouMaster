package com.gmail.hondashi014.hugouMaster.model.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import com.gmail.hondashi014.hugouMaster.model.domain.MstUser;

@Mapper
public interface MstUserMapper {

	@Select("select * from mst_user")
	List<MstUser> findAll();
	
	@Select("select * from mst_user where user_id = #{userId}")
	MstUser findByUserId(String userId);
	
	@Insert("insert into mst_user (user_id, user_name, password) values (#{userId}, #{userName}, #{password})")
	@Options(useGeneratedKeys = true, keyProperty = "id") //auto_incrementでidが作成されている場合
	int insert(MstUser user);
}
