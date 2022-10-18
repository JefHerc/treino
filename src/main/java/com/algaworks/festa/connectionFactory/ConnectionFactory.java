package com.algaworks.festa.connectionFactory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
	private Connection connection;
	
	public ConnectionFactory() {
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost/festa?useTimezone=true&serverTimezone=UTC","root", "root");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public Connection getConnection() {
		return connection;
	}
}
