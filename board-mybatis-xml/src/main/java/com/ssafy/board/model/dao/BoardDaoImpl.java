package com.ssafy.board.model.dao;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.ssafy.board.model.BoardDto;
import com.ssafy.configuration.SqlMapConfig;

public class BoardDaoImpl implements BoardDao {

	@Override
	public int writeArticle(BoardDto boardDto) throws SQLException {
		try(SqlSession sqlSession = SqlMapConfig.getSqlSession()){
			int cnt = sqlSession.insert("", boardDto);
			sqlSession.commit();
			return cnt;
		}
		
	}

	@Override
	public List<BoardDto> listArticle(Map<String, String> map) throws SQLException {
		return null;
	}

	@Override
	public int totalArticleCount(Map<String, String> map) throws SQLException {
		return 0;
	}

	@Override
	public BoardDto getArticle(int articleNo) throws SQLException {
		return null;
	}

	@Override
	public void updateHit(int articleNo) throws SQLException {

	}

	@Override
	public void modifyArticle(BoardDto boardDto) throws SQLException {

	}

	@Override
	public void deleteArticle(int articleNo) throws SQLException {

	}

}
