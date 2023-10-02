package org.java;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControllerMain {
	
	@GetMapping("/")
	public String homepage(Model model) {
		
		final String name = "Marco";
		
		model.addAttribute("name", name);
		
		return "index";
	}
}
