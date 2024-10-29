package com.ssafy.hello.service;

import org.springframework.stereotype.Service;

@Service
public class HelloService {
	public String hello() {
		return "HelloService message";
	}
}
