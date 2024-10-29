package com.edu.board.model;

import lombok.Data;

@Data
public class Board {
	private int num;
    private String writer;
    private String title;
    private String content;
    private String pwd;
    private int hit;
    private String regdate;
}
