package com.edu.customer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.edu.customer.model.Customer;
import com.edu.customer.model.service.CustomerService;

@Controller
public class MainController {

	@Autowired
	private CustomerService customerService;

	// 처음 화면
	@GetMapping("/")
	public String index() {
		return "index";
	}

	// 고객 리스트
	@GetMapping("/list")
	public String list(Model model) {
		List<Customer> list = customerService.listCustomer();
		model.addAttribute("list", list);
		return "list";
	}
	
	// 고객 등록 화면 이동
	@GetMapping("/insert")
	public String moveInsert() {
		return "insert";
	}
	
	// 고객 아이디 체크
	@GetMapping("/idCheck")
	public String idCheck(@RequestParam("id") String id, Model model) {
		Customer customer = customerService.searchCustomer(id);
		model.addAttribute("id", customer);
		return "msg";
	}
	

	// 고객 등록
	@PostMapping("/insertCustomer")
	public String insert(@ModelAttribute Customer customer) {
		// 새로운 직원 정보 추가 성공하면, "/list"로 redirect
		if (customerService.insertCustomer(customer)) {
			return "result";
		} else {
			return "index";
		}
	}
	
	// 고객 검색 화면 이동
	@GetMapping("/search")
	public String moveSearch() {
		return "search";
	}
	

	// 고객 검색 -> 결과 view 화면으로 
	@PostMapping("/searchCustomer")
	public String searchId(@RequestParam("id") String id, Model model) {
		Customer customer = customerService.searchCustomer(id);
		model.addAttribute("customer", customer);
		return "view";
	}

}
