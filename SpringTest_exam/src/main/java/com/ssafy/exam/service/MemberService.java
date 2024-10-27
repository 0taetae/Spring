package com.ssafy.exam.service;

import java.sql.SQLException;

import com.ssafy.exam.dto.MemberDto;

public interface MemberService {
	MemberDto login(String userId, String password);
	void join(MemberDto user) throws SQLException;
}
