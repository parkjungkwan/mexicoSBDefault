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
	@RequestMapping("/wordcloud")
    public String wordcloud(Model model){
		System.out.println("====  wordcloud  ====");
        return "tm/wordcloud";
    }
	@GetMapping
	@RequestMapping("/gmap")
    public String gmap(Model model){
		System.out.println("====  gmap  ====");
        return "chart/gmap";
    }
	@GetMapping
	@RequestMapping("/initMap")
    public String initMap(Model model){
		System.out.println("====  initMap  ====");
        return "chart/initMap";
    }

}
