package com.edu.board.model.service;

import java.util.List;

import com.edu.board.model.Board;

public interface BoardService {
	public boolean insertPost(Board ob);

	public List<Board> listPost();

	public Board readPost(int pid);

	public int updatePost(Board ob) throws Exception;
	public int deletePost(Board ob) throws Exception;
	public void updateHit(int num) throws Exception;
}