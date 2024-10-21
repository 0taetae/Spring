package com.ssafy.hello.model.dao;

import javax.sql.DataSource;

import org.springframework.stereotype.Repository;

@Repository
public class HelloDaoImpl implements HelloDao{
	
	private final DataSource dataSource;
	
	public HelloDaoImpl(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	@Override
	public void greeting() {
		
		System.out.println("HelloDao greeting() "+dataSource);
	}
	
	
	

}
