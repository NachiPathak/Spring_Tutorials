package edu.study.spring.springtutorial.xml;

public class XmlPersonDAO {

	XmlJDBCConnection jdbcConnection;

	public XmlPersonDAO() {
		super();
	}

	public XmlJDBCConnection getJdbcConnection() {
		return jdbcConnection;
	}

	public void setJdbcConnection(XmlJDBCConnection jdbcConnection) {
		this.jdbcConnection = jdbcConnection;
	}

}
