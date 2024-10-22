package com.ssafy.emp.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ssafy.emp.model.Emp;
import com.ssafy.emp.model.service.EmpService;

@Controller
public class MainController {
	private static final Logger logger = LoggerFactory.getLogger(MainController.class);
	
	@Autowired
	private EmpService empService;
	
	//처음화면---------------------------------------------------------------------------
	@GetMapping("/")
	public String index() {
		return "index";
	}
	//추가하기---------------------------------------------------------------------------
	@PostMapping("/insert")
	public String insert(@ModelAttribute Emp emp) {
		if(empService.insertEmp(emp)) {
			return "redirect:list";
		}else {
			return "index";
		}
	}
	//전체보기--------------------------------------------------------------------------
	@GetMapping("/list")
	public String list(Model model) {
		List<Emp> list=empService.listEmp();
		model.addAttribute("list", list); // request.setAttriute("list", list);   와 동일
		return "list";
	}
	// 검색하기(조건: 사번 10이하, 부서는 '발'을 포함)------------------------------------------
	@GetMapping("/searchEmp")
	public String listSearchEmp(Model model) {
		// Map객체에 각각 필드의 key와 value를 저장
		Map<String,String> map=new HashMap<>();
		map.put("eno", "10");
		map.put("dept", "%"+ "발" + "%");
		List<Emp> list=empService.getEmpByEnoAndDept(map);
		model.addAttribute("list", list);
		return "list";
	}
	// 검색하기(조건: eno로 찾기)--------------------------------------------------------
	@GetMapping("/searchNo")
	public String searchNo(@RequestParam("eno") int eno, Model model) {
		//System.out.println(eno);
		Emp emp=empService.searchNo(eno);
		model.addAttribute("emp",emp);
		return "searchNo";
	}
	// 수정하기(화면)---------------------------------------------------
	@PostMapping("/updateEmp")
	public String update(@ModelAttribute Emp emp) {
		return "updateEmp";
	}
		
	// 수정하기---------------------------------------------------------
	@PostMapping("/update")
	public String updateProc(@ModelAttribute Emp emp) {
		if(empService.updateEmp(emp)) {
			return "redirect:/list";
		}else {
			return "updateEmp";
		}
	}
	// 삭제하기------------------------------------------------------	
	@GetMapping("/deleteEmp")
	public String delete(@RequestParam("eno") int eno) {
		empService.deleteEmp(eno);
		return "redirect:/list";
	}
}












