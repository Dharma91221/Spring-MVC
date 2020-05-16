package com.home.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/sis")
public class SisController {
	
	@ResponseBody
	@RequestMapping("/makeup")
	public String getMakeup() {
		return "take ur make up kit";
	}
	@ResponseBody
	@RequestMapping("/Mathbook")
	public String getBooks() {
		return "Math book";
	}
}
