package com.mexico.web;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class HomeController {
	@GetMapping
	@RequestMapping("/")
    String getView(Model model) {
		System.out.println("====  1  ====");
        model.addAttribute("msg", "Hello there, This message has been injected from the controller method");
        return "index";
    }
}
