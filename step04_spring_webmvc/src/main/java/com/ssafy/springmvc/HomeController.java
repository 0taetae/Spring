package com.ssafy.springmvc;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ssafy.springmvc.model.HelloDto;
import com.ssafy.springmvc.model.service.HelloService;

@Controller
public class HomeController {

	@Autowired
	private HelloService helloService;

	// 방법1
//	@RequestMapping(value="/", method=RequestMethod.GET)
//	@GetMapping("/")
//	public String home() {
//		// return "WEB-INF/views/index.jsp";
//		return "index";
//	}
	
	// 방법2
	@RequestMapping(value="/", method=RequestMethod.GET)
	public ModelAndView home() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("index");
		return mav;
	}

//	@RequestMapping(value="/hellomvc1", method=RequestMethod.GET)
	@GetMapping("/hellomvc1")
	public String hellomvc1(Model model) {
		HelloDto helloDto = helloService.greeting();
		model.addAttribute("str", helloDto.getMessage());
		return "result/hello";
	}
	
	@GetMapping("/hellomvc2")
	public String hellomvc2(Map map) {
		map.put("msg","Hello Map");
		return "result/hello";
	}

}
