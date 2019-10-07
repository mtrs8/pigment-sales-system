package loja;

import java.sql.SQLException;

public interface LojaApp {
	
	public void selecionarPigmento(String codigoHexadecimal);

	public void consultarPigmento(double qtdSolicitada);
	
	public String teste();
	
	
}
