package com.ssafy.exam.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ssafy.exam.dto.MemberDto;
import com.ssafy.exam.dto.ProductDto;
import com.ssafy.exam.service.ProductService;

import jakarta.servlet.http.HttpSession;

@Controller
public class ProductController {

	private final ProductService productService;

	public ProductController(ProductService productService) {
		super();
		this.productService = productService;
	}

	// 상품목록 페이지로 이동
	@GetMapping("/list")
	public String list(HttpSession session, Model model) {
		MemberDto member = (MemberDto) session.getAttribute("memberInfo");
		List<ProductDto> product = productService.getUserResources(member.getId());
		model.addAttribute("product", product);
		return "list";
	}

	// 상품등록 페이지로 이동
	@GetMapping("/regist")
	public String showRegist() {
		return "regist";
	}

	// 상품등록
	@PostMapping("/regist")
	public String makeRegist(ProductDto productDto, Model model) {
		productService.makeProduct(productDto);
		//model.addAttribute("message", "성공적으로 저장이 완료되었습니다");
		return "redirect:/";
	}
	
	// 선택한 상품 삭제
	@PostMapping("/delete")
	public String deleteProduct(@RequestParam("productIds") List<String> productIds, Model model) {
		productService.deleteProduct(productIds);
		//model.addAttribute("message", "선택한 상품이 삭제되었습니다");
		return "redirect:/list";
	}
	

}
