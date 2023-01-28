package it.corsospring.web;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.FrameworkServlet;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/*
 * DISPATCHER-SERVLET
 * gestisce i path per le richieste in arrivo
 */
public class Initializer extends AbstractAnnotationConfigDispatcherServletInitializer
{

	@Override
	protected Class<?>[] getRootConfigClasses()
	{
		// TODO Auto-generated method stub
		return null;
	}

	
	/*
	 * dice quale e' la classe che devo utilizzare per 
	 * accedere a tutte le configurazioni della applicazione web 
	 *
	 */
	@Override
	protected Class<?>[] getServletConfigClasses()
	{
		// TODO Auto-generated method stub
		//return null;
		
		return new Class<?>[]{WebConfig.class};
	}

	
	/*
	 * quali path deve intercettre la dispatcer servel
	 */
	@Override
	protected String[] getServletMappings()
	{
		// TODO Auto-generated method stub
		// in questo caso dico che tutto quell oche arriva nella dispatcher servelet viene gestito da questo dispatcer		
		return new String[] {"/"}; 
	}


	@Override
	protected FrameworkServlet createDispatcherServlet(WebApplicationContext servletAppContext)
	{
		DispatcherServlet ds = new DispatcherServlet(servletAppContext);
		ds.setThrowExceptionIfNoHandlerFound(true);
		
		// TODO Auto-generated method stub
		return ds;
	}
	
	

}
