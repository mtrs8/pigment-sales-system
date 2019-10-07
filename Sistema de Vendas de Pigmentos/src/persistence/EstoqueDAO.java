package persistence;

import java.sql.SQLException;
import java.util.Collection;

import model.Estoque;
import model.Pigmento;
import model.PigmentoCMYK;
import model.PigmentoRGB;

public interface EstoqueDAO {
	
	public void debitar(String corEscolhida);
	
	public Collection<PigmentoRGB> pesquisarPigmentoRGBDisponiveis(double qtdSolicitada) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException;
	
	public Collection<PigmentoCMYK> pesquisarPigmentoCMYKDisponiveis(double qtdSolicitada) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException;

	public Pigmento getInfoPigmento(String idDoPigmento) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException;
	

}
