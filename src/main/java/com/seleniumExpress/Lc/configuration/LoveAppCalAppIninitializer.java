package com.seleniumExpress.Lc.configuration;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class LoveAppCalAppIninitializer extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
	Class arr[]= {LcAppConfig.class};
		return arr;
	}

	@Override
	protected String[] getServletMappings() {
		String str[]= {"/"};
		return str;
	}
 
}
