<<<<<<< HEAD:Sistema de Vendas de Pigmentos/src/persistence/sql/ConnectionDAO.java
package persistence.sql;
=======
package pigmentation.sales.persistence;
>>>>>>> 4e9935fe55a5bc9cdce9b93a2a5e1c0ff618f6aa:Sistema de Vendas de Pigmentos/src/pigmentation/sales/persistence/AbstractDAO.java

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

<<<<<<< HEAD:Sistema de Vendas de Pigmentos/src/persistence/sql/ConnectionDAO.java
public abstract class ConnectionDAO {
	private static final String JDBC_DRIVER = "jdbc:mysql://127.0.0.1:3306/estoque";
	private static final String URI = "jdbc:mysql://127.0.0.1:3306/";
=======
import java.sql.Driver;

public class AbstractDAO {
	private static final String JDBC_DRIVER = "jdbc:mysql://localhost:3306/pigmentationsystem";//altere p/ seu endereco do banco
	private static final String URI = "jdbc:mysql://localhost:3306/";
>>>>>>> 4e9935fe55a5bc9cdce9b93a2a5e1c0ff618f6aa:Sistema de Vendas de Pigmentos/src/pigmentation/sales/persistence/AbstractDAO.java
	private static final String USER = "root";
	private static final String PWD = "i14!$santos97(&";
	
	/*String url = "jdbc:mysql://" +       
            "localhost:" +               
            "3306/" +                   
            "pigmentationsystem?" +            
            "useSSL=false&" +           
            "user=root&" +             
            "password=1234567"; 
	*/
	
	
	public Connection getConnection() throws SQLException, InstantiationException, IllegalAccessException,
										ClassNotFoundException {
<<<<<<< HEAD:Sistema de Vendas de Pigmentos/src/persistence/sql/ConnectionDAO.java
		DriverManager.registerDriver((new com.mysql.jdbc.Driver()) (Class.forName(ConnectionDAO.JDBC_DRIVER).newInstance()));
		return DriverManager.getConnection(ConnectionDAO.URI, ConnectionDAO.USER , ConnectionDAO.PWD);
=======
		DriverManager.registerDriver((java.sql.Driver) (Class.forName(AbstractDAO.JDBC_DRIVER).newInstance()));
		return DriverManager.getConnection(AbstractDAO.URI, AbstractDAO.USER , AbstractDAO.PWD);
>>>>>>> 4e9935fe55a5bc9cdce9b93a2a5e1c0ff618f6aa:Sistema de Vendas de Pigmentos/src/pigmentation/sales/persistence/AbstractDAO.java
	}

	
}
