package pigmentation.sales.persistence;

import java.sql.SQLException;
import java.sql.PreparedStatement;

import pigmentation.sales.exceptions.CorInexistenteException;
import pigmentation.sales.model.Pigmento;


public class PigmentoDAO extends AbstractDAO{
	private static final String INSERT = 
			"INSERT INTO PIGMENTO(id, preco, nome, quantity) " +
			"VALUES(?, ?, ?, ?)";
	
	private static final String SELECT_ID = 
			"SELECT id FROM PIGMENTO " +
			"WHERE nome = ?";
	
	private static final String UPDATE_CONTA = 
			"UPDATE PIGMENTO " + 
			"SET preco = ? " +
			"WHERE nome = ?";
	
	private static final String SELECT_ALL = 
			"SELECT nome, preco, quantity, id FROM PIGMENTO";
	
	
	PreparedStatement st = null;
	public void save(Pigmento pigmento) throws IllegalAccessException, ClassNotFoundException, SQLException {
		try {
			st = this.getConnection().prepareStatement(INSERT);
			st.setString(1, pigmento.getId());
			st.setDouble(2, pigmento.getPreco());
			st.setString(3, pigmento.getNomeCor());
			st.setInt(4, pigmento.getQtdEstoque());
			
		} catch(InstantiationException e) {
			e.printStackTrace();
		} finally {
			st.close();
		}
	}
}
