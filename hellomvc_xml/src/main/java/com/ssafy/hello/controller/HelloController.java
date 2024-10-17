package com.ssafy.hello.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	
	public HelloController() {
		System.out.println("HelloController 객체 생성");
	}
	
//	@RequestMapping(value="/", method=RequestMethod.GET)
	@GetMapping("/")
	public ModelAndView index() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("index");  // index.jsp
		mav.addObject("name", "이름 ");
		
		return mav;
	}
	
//	@RequestMapping(value="/", method=RequestMethod.POST)
	@PostMapping("/")
	public ModelAndView index2() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("index");  // index.jsp
		mav.addObject("name", "이름 ");
		
		return mav;
	}

}
