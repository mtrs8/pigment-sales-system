package pigmentation.sales.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Driver;

public class AbstractDAO {
	private static final String JDBC_DRIVER = "jdbc:mysql://localhost:3306/pigmentationsystem";//altere p/ seu endereco do banco
	private static final String URI = "jdbc:mysql://localhost:3306/";
	private static final String USER = "root";
	private static final String PWD = "1234567";
	
	/*String url = "jdbc:mysql://" +       
            "localhost:" +               
            "3306/" +                   
            "pigmentationsystem?" +            
            "useSSL=false&" +           
            "user=root&" +             
            "password=1234567"; 
	*/
	
	
	public Connection getConnection() throws SQLException, InstantiationException, IllegalAccessException, ClassNotFoundException {
		DriverManager.registerDriver((Driver)(Class.forName(AbstractDAO.JDBC_DRIVER).newInstance()));
		return DriverManager.getConnection(AbstractDAO.URI, AbstractDAO.USER , AbstractDAO.PWD);
	}
}
