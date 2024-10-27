package com.ssafy.exam.controller;

import java.sql.SQLException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ssafy.exam.dto.MemberDto;
import com.ssafy.exam.service.MemberService;

import jakarta.servlet.http.HttpSession;

@Controller
public class MemberController {

	MemberService service;

	public MemberController(MemberService service) {
		this.service = service;
	}
	
	// 처음 화면 
	@RequestMapping({"/","index"})
	public String index() {
		return "index";
	}
	
	// 로그인 
	@PostMapping("/login")
	public String login(@RequestParam("userId") String userId, @RequestParam("password") String password, HttpSession session, Model model) throws Exception {
		System.out.println(userId+" "+ password);
		MemberDto user = service.login(userId, password);
		System.out.println(user);
		if (user != null && user.getName() != null) {
			session.setAttribute("memberInfo", user);
			return "redirect:/";
		}
		throw new Exception("로그인 도중 에러가 발생하였습니다.");
	}
	
	// 회원가입 페이지로 이동 
	@GetMapping("/join")
	public String join() {
		return "join";
	}
	
	// 회원가입 
	@PostMapping("/join")
	public String join(MemberDto user, Model model) {
		try {
			//System.out.println(user);
			service.join(user);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return "redirect:/";
	}
	
	// 로그아웃 
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "index";
	}

}
