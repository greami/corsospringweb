package it.corsospring.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttribute;

@Controller
public class WelcomeController
{

	@RequestMapping("/")	
	@ResponseBody  // dice che returiosco il testo all'utente ma non una view
	public String welcome()
	{
		return "benvenuto";
	}
	
	@RequestMapping( 
			path = {"/v1", "/v2"},
			//method = {RequestMethod.GET, RequestMethod.POST}
			method = RequestMethod.GET,
			params = {"nome=MyApp", "version=1.0"}  //funziona da filtro, se non specificati non va nel metodo
			)
	@ResponseBody  
	public String versions()
	{
		return "Version v1 || v2";
	}
	
	@ResponseBody //non restituisce una view
	@GetMapping(path = {"/hello"})  //notation alternativa di spring
	public String hello()
	{
		return "hello";
	}
	
	//posso passare in input oggetti tipo request and response e lavorare a livello di richiesta
	@ResponseBody //non restituisce una view
	@GetMapping(path = {"/hello2"})  //notation alternativa di spring
	public String hello2(HttpServletRequest req, HttpServletResponse resp)
	{
		return "hello";
	}
	
	@ResponseBody
	@GetMapping(path= "/saluto")
	public String saluto(HttpServletRequest request)
	{
		
		if(request.getParameter("name") != null)
		{
		return "ciao da saluto "+ request.getParameter("name");
		}
		else
		{
			return "non ti conosco";			
		}
	}
	
	@ResponseBody
	@GetMapping(path= "/saluto2")
	public String saluto2(HttpSession session)
	{
		if(session.getAttribute("name") == null)
		{
			session.setAttribute("name", "Paolo");
			return "Ciao non ti conosco";
		} 
		else
		{
			return "ciao " + session.getAttribute("name").toString();
		}		
	}
	
	
	//http://localhost:8080/corsospringweb/saluto3?name=Paolo
	@ResponseBody
	@GetMapping(path= "/saluto3")	
	public String saluto3(@RequestParam("name") String nome)  //spring mappa il parametro name sulla variabile nome automaticamente
	{
		return "ciao " + nome;
	}
	
	@ResponseBody
	@GetMapping(path="/saluto4")	
	public String saluto4(@RequestHeader("User-Agent")  String userAgent)
	{
		return "ciao stai usando " + userAgent;
	}
	
	
	//metodo per prendere un coockie
	@ResponseBody
	@GetMapping(path="/saluto5")	
	public String saluto4(@RequestHeader("User-Agent")  String userAgent, @CookieValue("JSESSIONID")  String languageID )
	{
		return "ciao stai usando " + userAgent + " - cookie  JSESSIONID " +  languageID;
	}
	
	
	@GetMapping(path= "/1")
	public String metodo1(HttpServletRequest request)
	{
		if(request.getParameter("nome") != null && !request.getParameter("nome").trim().equals("") )
		{
			request.setAttribute("messaggio", "Ciao " + request.getParameter("nome"));
		}
		else
		{
			request.setAttribute("messaggio", "ciao piacere di conoscerti anonimo");
		}
		return "forward:/2";
	}
	
	@ResponseBody
	@GetMapping(path= "/2")
	public String metodo2( @RequestAttribute("messaggio") String saluto)
	{
		return saluto;
	}
	
	
	
	
	@GetMapping(path= "/3")
	public String metodo3(HttpServletRequest request)
	{
		if(request.getParameter("nome") != null && !request.getParameter("nome").trim().equals("") )
		{
			request.setAttribute("messaggio", "Ciao " + request.getParameter("nome"));
		}
		else
		{
			request.getSession().setAttribute("messaggio", "ciao piacere di conoscerti anonimo 3");
		}
		return "forward:/4";
	}
	
	@ResponseBody
	@GetMapping(path= "/4")
	public String metodo4( @SessionAttribute("messaggio") String saluto)  //annotazione di atttributo sessione sessione
	{
		return saluto;
	}
	
	//redirect
	@GetMapping(path= "/redirect")
	public String goToNewPage()
	{
		return "redirect:/hello";	  //notare i :
	}
	
	//forward
	@GetMapping(path= "/forward")
	public String forwardToNewPage()
	{
		return "forward:/hello";	 //notare i :
	}
	
	
	@RequestMapping(path="/testview")
	public String testView()
	{
		return "Test";  //nome della view senza path e senza estensione file
	}
	
}
