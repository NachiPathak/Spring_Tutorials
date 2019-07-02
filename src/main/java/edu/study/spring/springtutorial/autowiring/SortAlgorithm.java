package edu.study.spring.springtutorial.autowiring;

import org.springframework.stereotype.Component;

@Component
public interface SortAlgorithm {
	
	public int[] sort(int[] nums);

}
