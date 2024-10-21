package com.ssafy.hello.model.service;

import org.springframework.stereotype.Service;

import com.ssafy.hello.model.dao.HelloDao;

@Service
public class HelloServiceImpl implements HelloService {
	
	private final HelloDao helloDao;
	
	public HelloServiceImpl(HelloDao helloDao) {
		this.helloDao = helloDao;
	}

	@Override
	public void greeting() {
		helloDao.greeting();
		System.out.println("HelloService greeting() 호출 !!");
	}

}
