package com.ssafy.mvc.model.service;

import java.sql.SQLException;

import org.springframework.stereotype.Service;

import com.ssafy.mvc.dto.Member;
import com.ssafy.mvc.model.dao.MemberDao;

@Service
public class MemberServiceImpl implements MemberService{
	private final MemberDao memberDao;
	public MemberServiceImpl(MemberDao memberDao) {
		this.memberDao = memberDao;
	}

	//id, password로 사용자 정보 조회
	
	public Member findByIdAndPassword(Member member) throws SQLException {
		return memberDao.findByIdAndPassword(member);
	}
}
