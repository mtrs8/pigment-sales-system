package Loja;

import persistence.EstoqueDAO;
import persistence.sql.EstoqueSQLDAO;

public class Loja implements LojaApp {
	
	private EstoqueDAO estoqueDAO;
	
	public Loja() {
		this.estoqueDAO = new EstoqueSQLDAO();
	}

//	@Override
//	public void consultarTintaDisponivel(String codigoHexadecimal) {
//		pRGB = this.estoqueDAO.escolherPigmentoRGB(codigoHexadecimal);
//		pCMYK = this.estoqueDAO.escolherPigmentoCMYK(codigoHexadecimal);
//	}
	
	public void consultaPigmento(String codigoHexadecimal) {
		this.estoqueDAO.escolherPigmento;
	}
	
	
}
