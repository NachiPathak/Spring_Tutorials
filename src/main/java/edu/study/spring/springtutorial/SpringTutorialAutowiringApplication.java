package edu.study.spring.springtutorial;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import edu.study.spring.springtutorial.autowiring.BinarySearchImpl;

@ComponentScan
public class SpringTutorialAutowiringApplication {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				SpringTutorialAutowiringApplication.class);
		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
		BinarySearchImpl binarySearch1 = applicationContext.getBean(BinarySearchImpl.class);

		System.out.println("/****************Bean Scope Differentiation****************/");
		System.out.println("Scope Prototype");
		System.out.println(binarySearch.hashCode());
		System.out.println(binarySearch1.hashCode());
		System.out.println("/**********************************************************/");

		int[] nums = { 0, 1, 2, 3, 4 };

		int index = binarySearch.searchNumber(nums, 3);

		System.out.println("Number found at " + index + " Position");

		applicationContext.close();
	}

}
