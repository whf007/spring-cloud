package com.xue.springservice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/my")
public class MyController {
	@RequestMapping("/hello")
	public String hello(){
		
		return "backindex";
	}
}
