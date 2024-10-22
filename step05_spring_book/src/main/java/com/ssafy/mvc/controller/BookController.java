package com.ssafy.mvc.controller;

import java.sql.SQLException;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ssafy.mvc.dto.Book;
import com.ssafy.mvc.model.service.BookService;


@Controller
@RequestMapping("/books")
public class BookController  {
	
	private final BookService bookService;
	public BookController(BookService bookService) {
		System.out.println("BookController 객체 생성");
		this.bookService = bookService;
	} 
	
	//전체 조회
	@GetMapping("/list")
	public String list(Model model) throws SQLException {
		//1. DB로부터 목록데이터 조회
		List<Book> list = bookService.selectAll();
		
		//2. View로 넘김
		model.addAttribute("list", list);
		return "book/list";
	}

	//상세 조회
	@GetMapping("/detail")
	public ModelAndView detail(/* 1. id 추출 */@RequestParam("id") int id) throws SQLException {
		ModelAndView mv = new ModelAndView();
		System.out.println("상세 조회 id:"+id);
		
		//2. DB로부터 책 정보 조회
		Book book  = bookService.findById(id);
		
		//3. 뷰 반환
		mv.addObject("book", book);
		mv.setViewName("book/detail");
		return mv;
	}
	
	//등록 화면 요청
	@GetMapping("/add")
	public String add() {
		return "book/regist";
	}
	
	//등록 요청
	@PostMapping("/add")
	public String add(/* 1.파라미터 추출 */@ModelAttribute Book book) throws SQLException {
		System.out.println("파라미터 정보 : "+book);
		
		//2. DB에 등록
		bookService.insert(book);
		
//		//3. 목록 페이지 반환
		return "redirect:/books/list";
	}

	
	//삭제 요청
	@GetMapping("/delete")
	public String del(@RequestParam("id") int id) throws SQLException {
		int cnt = bookService.deleteById(id);
		System.out.println("삭제된 행 개수 : "+cnt);
		
		return "redirect:/books/list";
	}
}
