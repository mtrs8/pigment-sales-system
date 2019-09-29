package persistence.sql;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import ConnectionDAO;
import Estoque;
import Pigmento;
import PigmentoRGB;
import persistence.EstoqueDAO;

public class EstoqueSQLDAO extends ConnectionDAO implements EstoqueDAO {
	
	private static final String SELECT_PIGMENTO_RGB = 
			"SELECT nome, idPigmento, qtdNoEstoque, preco, r, g, b FROM PIGMENTORGB WHERE qtdNoEstoque >= ?";
	
	private static final String SELECT_PIGMENTO_CMYK = 
			"SELECT nome, idPigmento, qtdNoEstoque, preco,  FROM PIGMENTOCMYK WHERE qtdNoEstoque >= ?";
	
	private Estoque estoque = new Estoque();
	
	@Override
	public void debitar(Pigmento pigmentoEscolhido) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void pesquisarPigmentoRGBDisponiveis(String codigoHexadecimal) {
		try {
			PreparedStatement stmt = this.getConnection().prepareStatement(EstoqueSQLDAO.SELECT_PIGMENTO_RGB);
			ResultSet rSet = stmt.executeQuery();
			while(rSet.next()) {
				PigmentoRGB pigRGB = new PigmentoRGB();
				pigRGB.setId((rSet.getString("idPigmento")));
				pigRGB.setNome(rSet.getString("nome"));
				pigRGB.setPreco(rSet.getDouble("preco"));
				pigRGB.setQtdNoEstoque(rSet.getDouble("qtdNoEstoque"));
				
				estoque.addNaListaRGB(pigRGB);
			}		
	}
		catch(){
			
		}
}
	@Override
	public void pesquisarPigmentoCMYKDisponiveis(String codigoHexadecimal) {
	}
	
	
}
