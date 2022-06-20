package org.deep.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class SpringMVCBaseWebAppInitializer extends
		AbstractAnnotationConfigDispatcherServletInitializer {

	  @Override
	  protected String[] getServletMappings() {
	    return new String[] { "/web/*" };  // Standard: Map dispatcher to URLs with /content
	  }
	  
	  @Override
	  protected Class<?>[] getRootConfigClasses() {
	    return new Class<?>[] { Configuracion.class };
	  }

	  @Override
	    protected Class<?>[] getServletConfigClasses() {
	  return new Class<?>[] { WebConfig.class };
	  }
}