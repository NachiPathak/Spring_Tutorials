package edu.study.spring.springtutorial.autowiring;

import org.springframework.stereotype.Component;

@Component
public class BubbleSortAlgorithm implements SortAlgorithm {

	public int[] sort(int[] nums) {
		return nums;
	}

}