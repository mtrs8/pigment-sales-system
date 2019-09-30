package persistence.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public abstract class ConnectionDAO {
	private static final String JDBC_DRIVER = "jdbc:mysql://127.0.0.1:3306/estoque";
	private static final String URI = "jdbc:mysql://127.0.0.1:3306/";
	private static final String USER = "root";
	private static final String PWD = "i14!$santos97(&";
	
	public Connection getConnection() throws SQLException, InstantiationException, IllegalAccessException,
										ClassNotFoundException {
		DriverManager.registerDriver((new com.mysql.jdbc.Driver()) (Class.forName(ConnectionDAO.JDBC_DRIVER).newInstance()));
		return DriverManager.getConnection(ConnectionDAO.URI, ConnectionDAO.USER , ConnectionDAO.PWD);
	}

	
}
