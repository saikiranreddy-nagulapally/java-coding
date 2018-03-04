package com.luv2code.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloWorldController 
{
	//need a controller method to show html form
	@RequestMapping("/showForm")
	public String showForm()
	{
		return "helloworld-form";
	}
	//need a controller method to view page for html form
	@RequestMapping("/processForm")
	public String processForm()
	{
		return "helloworld";
	}

	@RequestMapping("/procesFormVersionThree")
	public String procesFormVersionThree(@RequestParam("studentName")String theName,Model model)
	{
		
		theName= theName.toUpperCase();
		String result="hey my friend v3!"+theName;
		model.addAttribute("message", result);
		
		
		return "helloworld";
	}
}
