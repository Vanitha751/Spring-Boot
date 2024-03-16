package com.xworkz.carvonors.configuration;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebInit extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("This is the class of getRootConfigClasses in WebInit Method");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("This is the class of getServletConfigClasses in WebInit Method");
		return new Class<?>[] { WebConfiguration.class };
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("This is the class of getServletMappings in WebInit Method");
		return new String[] {"./"};
	}
@Override
public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
	System.out.println("This is the class of configureDefaultServletHandling in WebInit Method");
	configurer.enable();
}

}