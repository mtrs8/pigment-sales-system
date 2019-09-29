package persistence.sql;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import java.sql.Driver;

public abstract class ConnectionDAO {
	private static final String JDBC_DRIVER = "jdbc:mysql://localhost:3306/pigmentationsystem";//altere p/ seu endereco do banco
	private static final String URI = "jdbc:mysql://localhost:3306/";
	private static final String USER = "root";
	private static final String PWD = "1234567";
	
	public Connection getConnection() throws SQLException, InstantiationException, IllegalAccessException,
										ClassNotFoundException {
		DriverManager.registerDriver((java.sql.Driver) (Class.forName(ConnectionDAO.JDBC_DRIVER).newInstance()));
		return DriverManager.getConnection(ConnectionDAO.URI, ConnectionDAO.USER , ConnectionDAO.PWD);
	}
}
