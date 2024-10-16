package com.ssafy.hello.di8.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.ssafy.hello.di8.dao.HelloDao;

//@Component
@Service
public class HelloServiceImpl implements HelloService {
	
	private final HelloDao helloDao;
	
//	@Autowired
	public HelloServiceImpl(HelloDao helloDao) {
		this.helloDao = helloDao;
	}

	@Override
	public String hello(String name) {
		return helloDao.greeting()+ name + "님";
	}

}
