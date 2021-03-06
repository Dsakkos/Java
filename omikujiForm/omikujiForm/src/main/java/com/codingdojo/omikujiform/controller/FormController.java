package com.codingdojo.omikujiform.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FormController {
	
	@GetMapping("/")
	public String index() {
		return "redirect:/omikuji";
	}
	
	@GetMapping("/omikuji")
	public String form() {
		return "form.jsp";
	}
	
	@GetMapping("/omikuji/show")
		public String showform(HttpSession session, Model model) {
			
			String formOmikuji = (String) session.getAttribute("formOmikuji");
			model.addAttribute("formOmikuji", formOmikuji);
			
		return "showForm.jsp";
	}
	
	@PostMapping("/submitForm")
	public String submitform(
			@RequestParam("number") int number,
			@RequestParam("city") String city,
			@RequestParam("person") String person,
			@RequestParam("hobby") String hobby,
			@RequestParam("livingThing") String livingThing,
			@RequestParam("message") String message,
			HttpSession session
			) {
		
		String formOmikuji = String.format(
				"In %s years you will live in %s with %s as your roommate, %s. The next time you see a %s, you will have good luck. Also, %s.",
				number, city, person, hobby, livingThing, message);
		
		session.setAttribute("formOmikuji", formOmikuji);
		
		return "redirect:/omikuji/show";
		}
}

