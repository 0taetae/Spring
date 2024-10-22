package com.ssafy.board.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.NoHandlerFoundException;

import com.ssafy.member.controller.MemberController;

@ControllerAdvice
// Controller에서만 하고 싶을 때
//@ControllerAdvice(basePackages = {"com.ssafy.board, com.ssafy.member"})
//@ControllerAdvice(assignableTypes = {BoardController.class, MemberController.class})
// @RestControllerAdvice -> jsp가 아닌 JSON으로 받아낼 수 있음
public class ExceptionControllerAdvice {

	private final Logger logger = LoggerFactory.getLogger(ExceptionControllerAdvice.class);
	
	public ExceptionControllerAdvice() {
		logger.debug("ExceptionControllerAdvice 생성자 호출");
	}
	
	// 모든 Controller에서 Exception이 발생했을때 사용할 수 있음
	@ExceptionHandler(Exception.class)
	public String handleException(Exception ex, Model model) {
		logger.error("Exception 발생 : {}", ex.getMessage());
		model.addAttribute("msg", "처리중 에러 발생!!!");
		return "error/error";
	}

	@ExceptionHandler(NoHandlerFoundException.class)
	@ResponseStatus(value = HttpStatus.NOT_FOUND)
	public String handle404(NoHandlerFoundException ex, Model model) {
		logger.error("404 발생 : {}", "404 page not found");
		model.addAttribute("msg", "해당 페이지를 찾을 수 없습니다!!!");
		return "error/error";
	}

}
