import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class EstoqueSQLDAO extends ConnectionDAO implements EstoqueDAO {
	
	private static final String SELECT_PIGMENTO_RGB = 
			"SELECT nome, idPigmento, qtdNoEstoque, preco FROM PIGMENTORGB WHERE qtdNoEstoque >= ?";
	
	private static final String SELECT_PIGMENTO_CMYK = 
			"SELECT nome, idPigmento, qtdNoEstoque, preco FROM PIGMENTOCMYK WHERE qtdNoEstoque >= ?";
	
	private Estoque estoque = new Estoque();
	
	@Override
	public void debitar(Pigmento pigmentoEscolhido) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public Pigmento escolherPigmentoRGB(String codigoHexadecimal) {
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
			
			
		return 
				
	}

	@Override
	public Pigmento escolherPigmentoCMYK(String codigoHexadecimal) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
