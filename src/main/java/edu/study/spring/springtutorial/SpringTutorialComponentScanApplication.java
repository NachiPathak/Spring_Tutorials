package edu.study.spring.springtutorial;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import edu.study.spring.componentscan.ComponentDAO;

@ComponentScan
public class SpringTutorialComponentScanApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringTutorialComponentScanApplication.class);

	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				SpringTutorialComponentScanApplication.class);

		ComponentDAO componentDAO = applicationContext.getBean(ComponentDAO.class);
		ComponentDAO componentDAO2 = applicationContext.getBean(ComponentDAO.class);

		LOGGER.info("{}", componentDAO);
		LOGGER.info("{}", componentDAO.getComponentJDBC());

		LOGGER.info("{}", componentDAO2);
		LOGGER.info("{}", componentDAO2.getComponentJDBC());

		applicationContext.close();
	}
}
