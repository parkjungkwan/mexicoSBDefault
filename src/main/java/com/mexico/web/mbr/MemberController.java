package com.mexico.web.mbr;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberController {
	@Autowired MemberService service;
	@GetMapping
	@RequestMapping("/")
    public String displayStartPage(Model model){
		System.out.println("====  1  ====");
		String num = service.countAll();
        model.addAttribute("msg", "총회원수는 "+num+" 이다");
        return "index";
    }
}