package com.mexico.web.chart;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ChartCtrl {
	@GetMapping
	@RequestMapping("/jewelry")
    public String jewelry(Model model){
		System.out.println("====  jewelry  ====");
        return "chart/jewelry";
    }
	@GetMapping
	@RequestMapping("/worldcloud")
    public String worldcloud(Model model){
		System.out.println("====  worldcloud  ====");
        return "tm/worldcloud";
    }

}
