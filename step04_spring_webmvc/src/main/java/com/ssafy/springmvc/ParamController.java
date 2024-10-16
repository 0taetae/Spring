package com.ssafy.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ssafy.springmvc.model.MultiDto;

@Controller
@RequestMapping("/param")
public class ParamController {
	
	//@GetMapping("/param/single")
	@GetMapping("/single")
	public String single() {
		return "result/single";
	}
	
	//@GetMapping("/param/multi")
	@GetMapping("/multi")
	public String multi() {
		return "result/multi";
	}
	
	
	@PostMapping("/single")
	public String single(@RequestParam("userid") String userId, 
						 @RequestParam("username") String username, 
						 @RequestParam(value = "area", required = false, defaultValue = "100") int area) {
		
		System.out.println(userId + "\t" + username + "\t" + area);
		return "result/single";
	}
	
	
	@PostMapping("/multi")
	public String multi(@ModelAttribute("info") MultiDto multiDto) {
		System.out.println(multiDto);
		return "result/hello";
	}
}
