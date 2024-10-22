package com.ssafy.mvc.model.service;

import java.sql.SQLException;

import com.ssafy.mvc.dto.Member;

public interface MemberService {
	//id, password로 사용자 정보 조회
	Member findByIdAndPassword(Member member) throws SQLException;
}
