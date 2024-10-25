package com.ssafy.exam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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
}
