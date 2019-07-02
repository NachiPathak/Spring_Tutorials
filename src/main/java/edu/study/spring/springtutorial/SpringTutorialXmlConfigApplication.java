package edu.study.spring.springtutorial;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.study.spring.springtutorial.xml.XmlPersonDAO;

public class SpringTutorialXmlConfigApplication {

//	private static Logger LOGGER = LoggerFactory.getLogger(SpringTutorialXmlConfigApplication.class);

	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		XmlPersonDAO personDAO = (XmlPersonDAO) applicationContext.getBean("xmlPersonDAO");

		String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
		
		System.out.println("Defined Beans are: ");
		for (String bean : beanDefinitionNames) {
			System.out.println(bean);
		}
//		System.out.println(personDAO);
//		System.out.println(personDAO.getJdbcConnection());

	}
}
