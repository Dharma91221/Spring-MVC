package com.home.MyCafeController;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyCafeControllers {
	
	@RequestMapping("/cafe")
	public String showWelcomePage(Model model) {
		
		//sending data to view (jsp page)
		/*
		 * String myname="Abilash"; model.addAttribute("myNameValue",myname);
		 */
		return "welcome-page";
	}
	
	@RequestMapping("/processOrder")
	public String processOrder(HttpServletRequest request,Model model) {
		
		String userEnteredValue=request.getParameter("foodtype");
		 model.addAttribute("userInput",userEnteredValue);
		return "process-order";
	}
}
