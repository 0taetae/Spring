package com.ssafy.hello.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.servlet.ModelAndView;

import com.ssafy.hello.model.HelloDto;
import com.ssafy.hello.model.service.HelloService;

@Controller
public class HelloController {
	
	private final HelloService helloService;
	
	public HelloController(HelloService helloService ) {
		this.helloService = helloService;
		System.out.println("HelloController 객체 생성");
	}
	
//	@RequestMapping(value="/", method=RequestMethod.GET)
	@GetMapping("/")
	public ModelAndView index() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("index");  // index.jsp
		mav.addObject("name", "이름 ");
		
		return mav;
	}
	
//	@RequestMapping(value="/", method=RequestMethod.POST)
	@PostMapping("/")
	public ModelAndView index2() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("index");  // index.jsp
		mav.addObject("name", "이름 ");
		
		return mav;
	}
	
	// ModelAndView가 return type이면 model 정보 및 view 정보를 담고 있음
//	@GetMapping("/parameter")
//	public ModelAndView param() {
//		ModelAndView mav = new ModelAndView();
//		mav.setViewName("param/parameter");
//		return mav;
//	}
	
	// return type이 String이면 view 이름을 반환
	@GetMapping("/parameter")
	public String param() {
		return "param/parameter";
	}
	
//	@PostMapping("/parameter")
//	public String param(@RequestParam(value="userName",required=true) String name, 
//			@RequestParam(value="userAge", required=false, defaultValue="25") int age, 
//			@RequestParam("fruit") String[] fruits, Model model) {
//		System.out.println(name+"\t"+age+"\t"+fruits);
//		String userInfo = name+"("+age+")";
//		model.addAttribute("userInfo", userInfo);
//		model.addAttribute("fruits", fruits);
//		return "param/parameter";
//	}
	
	@PostMapping("/parameter")
	public String param(@RequestParam(value="userName",required=true) String name, 
			@RequestParam(value="userAge", required=false, defaultValue="25") int age, 
			@RequestParam("fruit") String[] fruits, Map<String, Object> model) {
		System.out.println(name+"\t"+age+"\t"+fruits);
		String userInfo = name+"("+age+")";
		model.put("userInfo", userInfo);
		model.put("fruits", fruits);
		return "param/parameter";
	}
	
//	@PostMapping("/paramdto")
//	public String param(HelloDto helloDto, Model model) {
//		System.out.println(helloDto);
//		model.addAttribute("result", helloDto);
//		return "param/result_dto";
//	}
	
	@PostMapping("/paramdto")
	public String param(@RequestParam Map<String, Object> params, Model model) {
		System.out.println("Map "+params);
		model.addAttribute("result ", params);
		return "param/result_dto";
	}
	
	@GetMapping("/model")
	public String model() {
		helloService.greeting();
		return "/";
	}

}
