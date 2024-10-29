package com.ssafy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.hello.model.HelloDto;

@RestController
public class HelloRestController {
	@GetMapping("/rest")
	public HelloDto hello() {
		HelloDto helloDto = new HelloDto();
		helloDto.setName("내이름");
		helloDto.setMsg("안녕하세요");
		
		return helloDto;
	}
}
