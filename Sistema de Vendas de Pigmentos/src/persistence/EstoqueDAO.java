package persistence;

import Pigmento;

public interface EstoqueDAO {
	
	public void debitar(Pigmento pigmentoEscolhido);
	
	public void pesquisarPigmentoRGBDisponiveis(String codigoHexadecimal);
	
	public void pesquisarPigmentoCMYKDisponiveis(String codigoHexadecimal);
	
	

}
