package edu.study.spring.springtutorial.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PersonDAO {

	@Autowired
	JDBCConnection jdbcConnection;

	public PersonDAO() {
		super();
	}

	public PersonDAO(JDBCConnection jdbcConnection) {
		super();
		this.jdbcConnection = jdbcConnection;
	}

	public JDBCConnection getJdbcConnection() {
		return jdbcConnection;
	}

	public void setJdbcConnection(JDBCConnection jdbcConnection) {
		this.jdbcConnection = jdbcConnection;
	}

}
