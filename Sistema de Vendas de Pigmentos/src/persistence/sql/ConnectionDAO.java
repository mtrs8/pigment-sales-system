package persistence.sql;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Driver;

public abstract class ConnectionDAO{
	private static final String JDBC_DRIVER = "jdbc:mysql://localhost:3306/testePigmentos?zeroDateTimeBehavior=convertToNull"; //jdbc:hsqldb:hsql://localhost/
	private static final String URI = "jdbc:mysql://localhost";//org.hsqldb.jdbcDriver
	private static final String USER = "root";//SA
	private static final String PWD = "1234567";//""
	
	@SuppressWarnings("deprecation")
	public Connection getConnection() throws SQLException, InstantiationException, IllegalAccessException, ClassNotFoundException {
		DriverManager.registerDriver((Driver)(Class.forName(ConnectionDAO.JDBC_DRIVER).newInstance()));
		return DriverManager.getConnection(ConnectionDAO.URI, ConnectionDAO.USER , ConnectionDAO.PWD);
	}
}
