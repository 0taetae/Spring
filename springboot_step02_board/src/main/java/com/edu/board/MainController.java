package com.edu.board;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class MainController {
	
	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@GetMapping("/insert")
	public String insertPost() {
		return "board/insert";
	}
	@GetMapping("/list")
	public String listPost() {
		return "board/list";
	}
	@GetMapping("/list/{id}")
	public String readPost(@PathVariable("id") int id, Model model) {
		return "board/read";
	}
	@GetMapping("/update/{id}")
	public String updatePost(@PathVariable("id") int id, Model model) {
		return "board/update";
	}
	
}


