package edu.study.spring.springtutorial.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PropertyFilleReader {

	@Value("${db.url}")
	private String url;

	

	public String getUrl() {
		return url;
	}

}
