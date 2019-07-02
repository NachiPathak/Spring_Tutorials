package edu.study.spring.springtutorial;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.stereotype.Component;

import edu.study.spring.springtutorial.properties.PropertyFilleReader;

@Component
@ComponentScan

@PropertySource("classpath:app.properties")
public class SpringTutorialPropertiesApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringTutorialPropertiesApplication.class);

	public static void main(String[] args) {
		

		
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				PropertyFilleReader.class);
		
		
		PropertyFilleReader fileReader = applicationContext.getBean(PropertyFilleReader.class);

		System.out.println(fileReader.getUrl());

		applicationContext.close();
	}
}
