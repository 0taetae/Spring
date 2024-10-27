package com.ssafy.exam.controller;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.ssafy.exam.dto.ProductDto;
import com.ssafy.exam.service.ProductService;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private ProductService productService;

    // 전체 내역 조회
    @GetMapping("/listfull")
    public String viewProducts(Model model) {
        List<ProductDto> products = productService.getAllResources();
        System.out.println(products);
        model.addAttribute("products", products);
        return "listfull";
    }
    
	// 관리자 권한 상품 삭제
    @PostMapping("/delProduct")
    public String deleteProduct(@RequestParam("productId") List<String> productId, Model model) {
    	System.out.println(productId);
//    	List<String> productIds = new ArrayList<>();
//    	productIds.add(productId);
    	productService.deleteProduct(productId);
        model.addAttribute("message", "선택한 상품이 삭제되었습니다.");
        List<ProductDto> products = productService.getAllResources();
        model.addAttribute("products", products);
        return "listfull";
    }
    
    // 날짜 검색
    @PostMapping("/searchByDateAdmin")
    public String searchByDateAdmin(@RequestParam("searchDate") Date regist_date, Model model) {
    	System.out.println("searchByDateAdmin : "+ regist_date.toString());
    	List<ProductDto> products = productService.searchByDateAdmin(regist_date.toString());
    	model.addAttribute("products", products);
        return "listfull";
    }
}
