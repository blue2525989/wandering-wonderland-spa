package com.wanderingwonderland.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.wanderingwonderland.service.AboutService;

@Controller
public class AboutController {

	@Autowired
	private AboutService aboutService;
	
	@RequestMapping(value="/about", method=RequestMethod.GET)
	public String home(Model model) {
		List<String> content = aboutService.aboutPageContent();
		model.addAttribute("content", content.iterator().next());
		return "pages/about";
	}
}
