
package com.wanderingwonderland.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.wanderingwonderland.service.HomeService;

@Controller
public class HomeController {

	@Autowired
	private HomeService homePageService;
	
	@RequestMapping(value="/home", method=RequestMethod.GET)
	public String home(Model model) {
		List<String> content = homePageService.homeContent();
		model.addAttribute("content", content.iterator().next());
		return "pages/home";
	}
}
