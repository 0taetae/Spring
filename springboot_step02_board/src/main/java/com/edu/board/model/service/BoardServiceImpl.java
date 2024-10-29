package com.edu.board.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edu.board.model.Board;
import com.edu.board.model.dao.BoardDao;

@Service
public class BoardServiceImpl implements BoardService {
	@Autowired
	private BoardDao boardDao;
	

	@Override
	public boolean insertPost(Board ob) {
		return boardDao.insertPost(ob);
	}

	@Override
	public List<Board> listPost() {
		return boardDao.listPost();
	}

	@Override
	public Board readPost(int pid) {
		return boardDao.readPost(pid);
	}

	@Override
	public int updatePost(Board ob) throws Exception {
		return boardDao.updatePost(ob);

	}

	@Override
	public int deletePost(Board ob) throws Exception {
		return boardDao.deletePost(ob);
	}
	

	@Override
	public void updateHit(int articleNo) throws Exception {
		boardDao.updateHit(articleNo);
	}

}
