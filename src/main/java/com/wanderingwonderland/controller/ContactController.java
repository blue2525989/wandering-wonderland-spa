package com.wanderingwonderland.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.wanderingwonderland.service.EmailService;

@Controller
public class ContactController {
	
	@Autowired
	private EmailService emailService;
	
	@RequestMapping(value="/contact", method=RequestMethod.GET)
	public String home(Model model) {
		List<String> content = emailService.emailPageContent();
		model.addAttribute("content", content.iterator().next());
		return "pages/contact";
	}

}
