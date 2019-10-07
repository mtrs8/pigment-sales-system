package persistence.sql;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import model.Pigmento;
import model.PigmentoCMYK;
import model.PigmentoRGB;
import persistence.EstoqueDAO;

public class EstoqueSQLDAO extends ConnectionDAO implements EstoqueDAO {
	
	private static final String SELECT_PIGMENTO_RGB = 
			"SELECT id, nome, qtdNoEstoque, preco, red, green, blue FROM pigmentorgb WHERE qtdNoEstoque >= ?";
	
	private static final String SELECT_PIGMENTO_CMYK = 
			"SELECT id, nome, qtdNoEstoque, preco, cianno, magenta, yellow, keyblack  FROM pigmentocmyk WHERE qtdNoEstoque >= ?";
	
	private static final String SELECT_INFO_PIGMENTORGB = 
			"SELECT id, nome, qtdNoEstoque, preco FROM pigmentorgb WHERE id = ?";
	
	private static final String SELECT_INFO_PIGMENTOCMYK = 
			"SELECT id, nome, qtdNoEstoque, preco FROM pigmentoCMYK WHERE id = ?";
	
	private static final String UPDATE_QTD_NO_ESTOQUE_PIGMENTORGB = 
			"UPDATE pigmentoRGB SET qtdNoEstoque = ? WHERE id = ?";
	
	private static final String UPDATE_QTD_NO_ESTOQUE_PIGMENTOCMYK = 
			"UPDATE pigmentoCMYK SET qtdNoEstoque = ? WHERE id = ?";
	
	
	
	@Override
	public Collection<PigmentoRGB> pesquisarPigmentoRGBDisponiveis(double qtdSolicitada) throws ClassNotFoundException{
		List<PigmentoRGB> listaDePigmentosRGBDisponiveis = new ArrayList<PigmentoRGB>();
		try {
			PreparedStatement stmt = this.getConnection().prepareStatement(EstoqueSQLDAO.SELECT_PIGMENTO_RGB);
			stmt.setDouble(1, qtdSolicitada);
			ResultSet rSet = stmt.executeQuery();
			while(rSet.next()) {
				PigmentoRGB pigRGB = new PigmentoRGB();
				pigRGB.setId((rSet.getString("id")));
				pigRGB.setNome(rSet.getString("nome"));
				pigRGB.setPreco(rSet.getDouble("preco"));
				pigRGB.setQtdNoEstoque(rSet.getDouble("qtdNoEstoque"));
				pigRGB.setRed(rSet.getInt("red"));
				pigRGB.setGreen(rSet.getInt("green"));
				pigRGB.setBlue(rSet.getInt("blue"));
				listaDePigmentosRGBDisponiveis.add(pigRGB);
			}		
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listaDePigmentosRGBDisponiveis;
}


	@Override
	public void debitar(String id, double qtd){
		PreparedStatement stmtRGB = null;
		PreparedStatement stmtCMYK = null;
		try{
			stmtRGB = this.getConnection().prepareStatement(EstoqueSQLDAO.UPDATE_QTD_NO_ESTOQUE_PIGMENTORGB);
			stmtRGB.setDouble(1, qtd);
			stmtRGB.setString(2, id);
			int resultSet = stmtRGB.executeUpdate();
			stmtRGB.close();
			if(resultSet == 0) {
				stmtCMYK = this.getConnection().prepareStatement(EstoqueSQLDAO.UPDATE_QTD_NO_ESTOQUE_PIGMENTOCMYK);
				stmtCMYK.setDouble(1, qtd);
				stmtCMYK.setString(2, id);
				resultSet = stmtRGB.executeUpdate();
				stmtCMYK.close();
			}
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public Pigmento getInfoPigmento(String idDoPigmento) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		PigmentoRGB pgRGB = new PigmentoRGB();
		PigmentoCMYK pgCMYK = new PigmentoCMYK();
		PreparedStatement stmtRGB = this.getConnection().prepareStatement(EstoqueSQLDAO.SELECT_INFO_PIGMENTORGB);
		stmtRGB.setString(1, idDoPigmento);
		ResultSet resultSet = stmtRGB.executeQuery();
		
		if(resultSet.next()) {
			pgRGB.setId((resultSet.getString("id")));
			pgRGB.setNome(resultSet.getString("nome"));
			pgRGB.setPreco(resultSet.getDouble("preco"));
			pgRGB.setQtdNoEstoque(resultSet.getDouble("qtdNoEstoque"));
			return pgRGB;
		}else {
		
			PreparedStatement stmtCMYK = this.getConnection().prepareStatement(EstoqueSQLDAO.SELECT_INFO_PIGMENTOCMYK);
			stmtCMYK.setString(1, idDoPigmento);
			resultSet = stmtCMYK.executeQuery();
			
			if(resultSet.next()) {
				pgCMYK.setId((resultSet.getString("id")));
				pgCMYK.setNome(resultSet.getString("nome"));
				pgCMYK.setPreco(resultSet.getDouble("preco"));
				pgCMYK.setQtdNoEstoque(resultSet.getDouble("qtdNoEstoque"));
				return pgCMYK;
			}
		}
		
		return null;
	}


	@Override
	public Collection<PigmentoCMYK> pesquisarPigmentoCMYKDisponiveis(double qtdSolicitada)
			throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		List<PigmentoCMYK> listaDePigmentosCMYKDisponiveis = new ArrayList<PigmentoCMYK>();
		try {
			PreparedStatement stmt = this.getConnection().prepareStatement(EstoqueSQLDAO.SELECT_PIGMENTO_CMYK);
			stmt.setDouble(1, qtdSolicitada);
			ResultSet rSet = stmt.executeQuery();
			while(rSet.next()) {
				PigmentoCMYK pigCMYK = new PigmentoCMYK();
				pigCMYK.setId((rSet.getString("id")));
				pigCMYK.setNome(rSet.getString("nome"));
				pigCMYK.setPreco(rSet.getDouble("preco"));
				pigCMYK.setQtdNoEstoque(rSet.getDouble("qtdNoEstoque"));
				pigCMYK.setCyan(rSet.getInt("cianno"));
				pigCMYK.setMagenta(rSet.getInt("magenta"));
				pigCMYK.setYellow(rSet.getInt("yellow"));
				pigCMYK.setKeyBlack(rSet.getInt("keyblack"));
				listaDePigmentosCMYKDisponiveis.add(pigCMYK);
			}		
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			
		}
		return listaDePigmentosCMYKDisponiveis;
	}
	
	
	
	 
}
