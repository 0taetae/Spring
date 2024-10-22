package com.ssafy.mvc.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.stereotype.Repository;

import com.ssafy.mvc.dto.Member;

@Repository
public class MemberDaoImpl implements MemberDao{
	private DataSource ds;
	public MemberDaoImpl(DataSource ds) {
		this.ds = ds;
	}

	//id, password로 사용자 정보 조회
	
	public Member findByIdAndPassword(Member member) throws SQLException {
		//1. sql 작성
		String sql = "select id, name "
				+ "from member "
				+ "where id=? and password=?";
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			//2. DB 연결
			conn = ds.getConnection();
			
			//3. sql실행
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, member.getId());
			pstmt.setString(2,  member.getPassword());
			rs = pstmt.executeQuery();
			
			//3. 결과 파싱
			if(rs.next()) {
				String id = rs.getString("id");
				String name = rs.getString("name");
				Member loginInfo = new Member();
				loginInfo.setId(id);
				loginInfo.setName(name);
				return loginInfo;
			}
			return null;
		} finally {
			//4. 자원 반납
			if(rs!=null) rs.close();
			if(pstmt!=null)pstmt.close();
			if(conn!=null)conn.close();
		}
	}
}
