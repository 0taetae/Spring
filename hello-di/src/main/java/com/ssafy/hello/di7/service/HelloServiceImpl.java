package com.ssafy.hello.di7.service;

import com.ssafy.hello.di7.dao.HelloDao;

public class HelloServiceImpl implements HelloService {
	
	private HelloDao helloDao;
	
//	public HelloServiceImpl(HelloDao helloDao) {
//		this.helloDao = helloDao;
//	}
	
	public void setHelloDao(HelloDao helloDao) {
		this.helloDao = helloDao;
	}

	@Override
	public String hello(String name) {
		return helloDao.greeting()+ name + "님";
	}

}
