package edu.study.spring.componentscan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ComponentDAO {

	@Autowired
	ComponentJDBC componentJDBC;

	public ComponentDAO() {
		super();
	}

	public ComponentDAO(ComponentJDBC componentJDBC) {
		super();
		this.componentJDBC = componentJDBC;
	}

	public ComponentJDBC getComponentJDBC() {
		return componentJDBC;
	}

	public void setComponentJDBC(ComponentJDBC componentJDBC) {
		this.componentJDBC = componentJDBC;
	}

}
