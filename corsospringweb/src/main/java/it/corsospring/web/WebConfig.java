package it.corsospring.web;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceView;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

//classe che gestisce la configurazione della applicazione web

@Configuration
@EnableWebMvc //abilita la configurazione predefinita si spring, si può sovrascrivere questa interfaccia per cambiare comportamenti
@ComponentScan(basePackages = "it.corsospring.web.controller")  //quando la app web parte il container spring verifica tuttte le clasi in questo package, li gestisce come bean mvc
public class WebConfig
{
	//questo metodo ritorna il view resolver
	//view resolver è una interfaccia.
	//solo un resolver per applicazione
	
	@Bean   //stiamo definedno un Bean
	public ViewResolver defineResolver()
	{
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		
		resolver.setPrefix("/WEB-INF/view/");  //path di dove sono le view, creo cartelle
		resolver.setSuffix(".jsp");  // suffisso che dice il tipo di view
		
		return resolver;
	}

}
