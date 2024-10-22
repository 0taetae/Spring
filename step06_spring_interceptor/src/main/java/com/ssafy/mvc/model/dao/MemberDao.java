package com.ssafy.mvc.model.dao;

import java.sql.SQLException;

import com.ssafy.mvc.dto.Member;

public interface MemberDao {
	//id, password로 사용자 정보 조회
	
	Member findByIdAndPassword(Member member) throws SQLException;
}
