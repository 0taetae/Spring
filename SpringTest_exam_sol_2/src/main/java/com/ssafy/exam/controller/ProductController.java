package com.ssafy.exam.controller;

import java.sql.Date;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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
	
	// 상품등록 페이지로 이동
	@GetMapping("/regist")
	public String showRegist() {
		return "regist";
	}
	
	// 상품등록
	@PostMapping("/regist")
	public String makeRegist(@ModelAttribute ProductDto productDto, Model model) {
		System.out.println(productDto);
		productService.makeProduct(productDto);
		model.addAttribute("message", "성공적으로 저장이 완료되었습니다.");
		return "index";
	}
	
	// 상품 상세 정보
	@GetMapping("/detail")
	public String getDetail(@RequestParam("productId") String productId, Model model) {
		System.out.println(productId);
		model.addAttribute("product", productService.getDetail(productId));
		return "detail";
	}
	
	// 상품목록 페이지로 이동
	@RequestMapping("/list")
	public String list(HttpSession session, Model model) {
		MemberDto member = (MemberDto) session.getAttribute("memberInfo");
        List<ProductDto> product = productService.getUserResources(member.getId());
        model.addAttribute("product", product);
        return "list";
	}
	
	// 선택한 상품 삭제
    @PostMapping("/delete")
    public String deleteProduct(HttpSession session, @RequestParam("productIds") List<String> productIds, Model model) {
        productService.deleteProduct(productIds);
        model.addAttribute("message", "선택한 상품이 삭제되었습니다.");
        MemberDto member = (MemberDto) session.getAttribute("memberInfo");
        List<ProductDto> product = productService.getUserResources(member.getId());
        model.addAttribute("product", product);
        return "list";
    }
    
    // 날짜 검색
	@PostMapping("/searchByDate")
	public String searchByDate(@RequestParam(value = "searchDate", required = false) @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate searchDate, HttpSession session, Model model) {
		MemberDto member = (MemberDto) session.getAttribute("memberInfo");
		List<ProductDto> product;

		if (searchDate != null) {
			// 날짜가 존재하는 경우 해당 날짜로 검색
			Map<String, Object> map = new HashMap<>();
			map.put("userId", member.getId());
			map.put("registDate", java.sql.Date.valueOf(searchDate)); // LocalDate를 java.sql.Date로 변환

			if ("admin".equals(member.getId())) {
				product = productService.searchByDateAdmin(searchDate.toString()); // admin은 전체 목록 조회
			} else {
				product = productService.searchByDate(map); // 일반 사용자는 자신의 목록만 조회
			}
		} else {
			// 날짜가 비어 있는 경우
			if ("admin".equals(member.getId())) {
				product = productService.getAllResources(); // admin은 전체 목록 조회
			} else {
				product = productService.getUserResources(member.getId()); // 일반 사용자는 자신의 목록만 조회
			}
		}

		model.addAttribute("product", product);
		return "list";
	}

	// 수정 페이지로 이동
	@GetMapping("/update")
	public String showUpdatePage(@RequestParam("productId") String productId, Model model) {
		ProductDto product = productService.getDetail(productId);
		model.addAttribute("product", product);
		return "update";
	}

	// 수정 완료 처리
	@PostMapping("/updateProduct")
	public String updateProduct(ProductDto productDto, Model model) {
		productService.updateProduct(productDto);
		model.addAttribute("message", "상품이 성공적으로 수정되었습니다.");
		return "redirect:/detail?productId=" + productDto.getCode();
	}
}
