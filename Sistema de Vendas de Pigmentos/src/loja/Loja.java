package loja;

import model.Pigmento;
import model.Vendedor;

public class Loja implements LojaApp {
	
	private Vendedor vendedor;
	
	
	public Loja() {
		this.vendedor = new Vendedor();
	}
	
	public void selecionarPigmento(String codigoHexadecimal) {
		Pigmento pigmentoSelecionado = this.vendedor.getInfoDoPigmentoSelecionado(codigoHexadecimal);
		
	}

	@Override
	public void consultarPigmento(double qtdSolicitada) {
		this.vendedor.consultarPigmentosPorQuantidade(qtdSolicitada);
		//PODE DAR EXCEPTION QUANDO NÃO TEM NENHUM PIGMENTO COM A QUANTIDADE DESEJADA
		
	}
	
	
	
}
