package com.edu.board.model.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.edu.board.model.Board;

@Mapper
public interface BoardDao {
	public boolean insertPost(Board ob);
	public List<Board> listPost();
	public Board readPost(int id);
	public int updatePost(Board ob) throws Exception;
	public int deletePost(Board ob) throws Exception;
	public void updateHit(int articleNo) throws Exception;
}
