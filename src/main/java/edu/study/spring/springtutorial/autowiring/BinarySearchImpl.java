package edu.study.spring.springtutorial.autowiring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BinarySearchImpl {

	private static final Logger LOGGER = LoggerFactory.getLogger(BinarySearchImpl.class);

	@Autowired
	private SortAlgorithm sortAlgorithm;

	public int searchNumber(int[] numbers, int numberTosearch) {
		System.out.println("Inside Binary Search Impl!!");

		numbers = sortAlgorithm.sort(numbers);

		return 3;
	}

	public void postConstruct() {
		LOGGER.info("/*******************************************************************************/");
		LOGGER.info("Inside Post Contruct Method ");
		LOGGER.info("/*******************************************************************************/");
	}

	public void prDestroy() {
		LOGGER.info("/*******************************************************************************/");
		LOGGER.info("Inside Pre Destroy Method ");
		LOGGER.info("/*******************************************************************************/");

	}

}
