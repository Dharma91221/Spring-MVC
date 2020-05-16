package com.home.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller   //create object and place it in container
public class MomController {
	
	@ResponseBody
	@RequestMapping("/sugar")
	public String sugar() {
		return "Here is your sugar";
	}
}
