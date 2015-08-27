package br.com.caelum.cap1;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
	public Connection getConnection() {
		try {
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost/banco", "root", "123");
			return c;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}
