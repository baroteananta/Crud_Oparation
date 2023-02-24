package com.codeicons.main.Contoller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HomeController 
{
	@RequestMapping("/")
	public String logIn()
	{
		return "login";
	}
}
