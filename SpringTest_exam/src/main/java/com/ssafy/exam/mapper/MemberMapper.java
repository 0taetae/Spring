package com.ssafy.exam.mapper;

import java.sql.SQLException;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.ssafy.exam.dto.MemberDto;

@Mapper
public interface MemberMapper {

	MemberDto login(@Param("id") String userId,@Param("password") String password);
	void join(MemberDto user) throws SQLException;
	
}
