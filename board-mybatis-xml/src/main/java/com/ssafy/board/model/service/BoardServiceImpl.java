package com.ssafy.board.model.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.ssafy.board.model.BoardDto;
import com.ssafy.board.model.dao.BoardDao;
import com.ssafy.board.model.dao.BoardDaoImpl;
import com.ssafy.util.SizeConstant;

public class BoardServiceImpl implements BoardService {
	
	private BoardDao boardDao;

	public BoardServiceImpl() {
		super();
		this.boardDao = new BoardDaoImpl();
	}

	@Override
	public int writeArticle(BoardDto boardDto) throws Exception {
		return boardDao.writeArticle(boardDto);
	}

	@Override
	public List<BoardDto> listArticle(Map<String, String> map) throws Exception {
		int pgNo = Integer.parseInt(map.get("pgno"));
		int end = pgNo * SizeConstant.LIST_SIZE;
		int start = end - SizeConstant.LIST_SIZE;
		
		Map<String, Object> param = new HashMap<>();
		param.put("key", map.get("key"));
		param.put("word", map.get("word"));
		param.put("start", start);
		param.put("end", end);
		return boardDao.listArticle(param);
	}

	@Override
	public BoardDto getArticle(int articleNo) throws Exception {
		return boardDao.getArticle(articleNo);
	}

	@Override
	public void updateHit(int articleNo) throws Exception {
		boardDao.updateHit(articleNo);
	}

	@Override
	public void modifyArticle(BoardDto boardDto) throws Exception {
		boardDao.modifyArticle(boardDto);
	}

	@Override
	public void deleteArticle(int articleNo) throws Exception {
		boardDao.deleteArticle(articleNo);
	}

}