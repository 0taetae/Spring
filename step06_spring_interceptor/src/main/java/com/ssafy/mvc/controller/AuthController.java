package com.ssafy.mvc.controller;

import java.sql.SQLException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ssafy.mvc.dto.Member;
import com.ssafy.mvc.model.service.MemberService;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/auth")
public class AuthController {
	private final MemberService memberService;
	public AuthController(MemberService memberService) {
		this.memberService = memberService;
	}
	
	// 로그인 페이지 이동 요청 
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
	// 로그인 요청 
	@PostMapping("/login")
	public String login(@ModelAttribute Member member, HttpSession session) throws SQLException {
		
		// DB에서 사용자 정보 조회
		Member loginInfo = memberService.findByIdAndPassword(member);
		// 세션에 사용자 정보 추가
		session.setAttribute("userInfo", loginInfo);
		
		// 현재 요청을 처리한 후 사용자를 다른 URL로 Redirect함
		// 새로고침(F5) 등을 눌러도 이전에 실행된 로그인 처리가 다시 반복되지 않음
		//PRG(Post/Redirect/Get) 패턴을 사용해 중복된 POST 요청을 방지
		return "redirect:/";
		
		// return "redirect:/logout" -> servlet을 통해 다시 logout 호출
	}
	
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		
		return "redirect:/";
	}
	

}
