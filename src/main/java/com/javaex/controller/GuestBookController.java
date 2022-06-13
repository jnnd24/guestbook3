package com.javaex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class GuestBookController {
	
	//addList
	@RequestMapping(value= "addList", method= {RequestMethod.GET, RequestMethod.POST})
	public String addList() {
		
		System.out.println("addList 진입");
		
		
		return "";
	}

}
