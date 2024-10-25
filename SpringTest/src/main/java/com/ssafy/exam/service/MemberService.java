package com.ssafy.exam.service;

import java.sql.SQLException;

import org.apache.ibatis.annotations.Param;

import com.ssafy.exam.dto.MemberDto;

public interface MemberService {
	MemberDto login(@Param("id") String userId, @Param("password") String password);
	void join(MemberDto user) throws SQLException;
}
