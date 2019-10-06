package persistence.sql;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Driver;

public abstract class ConnectionDAO {
	private static final String JDBC_DRIVER = "org.hsqldb.jdbcDriver"; //jdbc:hsqldb:hsql://localhost/
	private static final String URI = "jdbc:hsqldb:hsql://localhost/";//org.hsqldb.jdbcDriver
	private static final String USER = "SA";//SA
	private static final String PWD = "";//""
	
	@SuppressWarnings("deprecation")
	public Connection getConnection() throws SQLException, InstantiationException, IllegalAccessException, ClassNotFoundException {
		DriverManager.registerDriver((Driver)(Class.forName(ConnectionDAO.JDBC_DRIVER).newInstance()));
		return DriverManager.getConnection(ConnectionDAO.URI, ConnectionDAO.USER , ConnectionDAO.PWD);
	}
}
