package it.corsospring.web.controller;


import java.awt.PageAttributes.MediaType;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")  // si puoi mappare anche a livello di classe
public class WelcomeRestController
{
	@RequestMapping(
			path ="/welcome",
			produces = org.springframework.http.MediaType.APPLICATION_JSON_VALUE ,
			//oppure produces = "application/json"	
			consumes =  org.springframework.http.MediaType.APPLICATION_JSON_VALUE // per dire di leggere il json nel body della request
			)
	public String welcome()
	{
		return "{message:\"welcome\" }";
	}

}
