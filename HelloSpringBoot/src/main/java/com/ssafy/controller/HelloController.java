package com.ssafy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.ssafy.hello.service.HelloService;
import com.ssafy.service.GoodService;

@Controller
public class HelloController {
	
	private HelloService helloService;
	private GoodService goodService;
	
	
	
	public HelloController(HelloService helloService, GoodService goodService) {
		super();
		this.helloService = helloService;
		this.goodService = goodService;
	}
	
	@GetMapping("/")
	public String hello(Model model) {
		model.addAttribute("msg1","Hello Spring Boot");
		model.addAttribute("msg2", "안녕 스프링 부트");
		model.addAttribute("msg3", helloService.hello());
		model.addAttribute("msg2",  goodService.good());
		return "index";
	}
}
