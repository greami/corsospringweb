package it.corsospring.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/login")
public class LoginController
{
	@ResponseBody
	@RequestMapping("/execute")
	public String login()
	{
		return "benvenuto login";
	}

}
