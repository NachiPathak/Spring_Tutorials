package edu.study.spring.componentscan;

import org.springframework.stereotype.Component;

@Component
public class ComponentJDBC {

	public void componentMessage() {
		System.out.println("Inside ComponentJDBC's componentMessage Method!!!");
	}
}
