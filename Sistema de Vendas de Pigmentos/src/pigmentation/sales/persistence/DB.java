package pigmentation.sales.persistence;

public class DB {
	private static final String INSERT = 
			"INSERT INTO CONTA(nome, saldo, tipo) " +
			"VALUES(?, ?, ?)";
	
	private static final String SELECT = 
			"SELECT nome, saldo, tipo FROM CONTA " +
			"WHERE nome = ?";
	
	private static final String UPDATE_CONTA = 
			"UPDATE CONTA " + 
			"SET saldo = ? " +
			"WHERE nome = ?";
	
	private static final String SELECT_ALL = 
			"SELECT nome, saldo, tipo FROM CONTA";
	
	
}
