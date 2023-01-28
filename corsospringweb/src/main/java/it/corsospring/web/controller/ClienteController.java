package it.corsospring.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import it.corsospring.web.model.Cliente;

@Controller
@RequestMapping(path = "/cliente")
public class ClienteController
{
	
	
	@GetMapping(path="/nuovo")
	public ModelAndView nuovoCliente()   //ritorna oggetto di tipo ModelAndView
	{
		return new ModelAndView("nuovoCliente", "datiCliente", new Cliente());   //vieName, modelAttribute in view, new modelObject
	}
	
	
//	@PostMapping(path="/aggiungi") //action del form	
//	public ModelAndView aggiungiCliente(@ModelAttribute("datiCliente")  Cliente cliente) // model attribute dfinito nella jsp nel form
//	{
//		
//		System.out.println(cliente.getNome());
//		System.out.println(cliente.getCognome());
//		System.out.println(cliente.getCodiceFiscale());
//		System.out.println(cliente.getTelefono());
//		System.out.println(cliente.getEmail());
//		
//		return new ModelAndView("nuovoCliente", "datiCliente", cliente);		
//	}
//	
	
	@PostMapping(path="/aggiungi") //action del form	
	public ModelAndView aggiungiCliente(@ModelAttribute("datiCliente")  Cliente cliente) // model attribute dfinito nella jsp nel form
	{
		
		System.out.println(cliente.getNome());
		System.out.println(cliente.getCognome());
		System.out.println(cliente.getCodiceFiscale());
		System.out.println(cliente.getTelefono());
		System.out.println(cliente.getEmail());
		
		
		return new ModelAndView("visualizzaCliente", "datiCliente", cliente);		
	}

	
	@GetMapping("/welcome")
	public String welcome(ModelMap model)
	{
		model.addAttribute("username", "paolo");  //attributeName, valore attributo
		model.addAttribute("messagginum", "10"); 
		
		return "welcome";
	}
	

}
