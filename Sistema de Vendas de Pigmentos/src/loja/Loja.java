package loja;

import model.Pigmento;
import model.Vendedor;

public class Loja implements LojaApp {
	
	private Vendedor vendedor;
	private Pigmento pigmentoSelecionado;
	
	
	public Loja() {
		this.vendedor = new Vendedor();
	}
	
	public void selecionarPigmento(String codigoHexadecimal) {
		 this.pigmentoSelecionado = this.vendedor.getInfoDoPigmentoSelecionado(codigoHexadecimal);
		 
	}

	@Override
	public void consultarPigmento(double qtdSolicitada) {
		this.vendedor.consultarPigmentosPorQuantidade(qtdSolicitada);
		//PODE DAR EXCEPTION QUANDO NÃO TEM NENHUM PIGMENTO COM A QUANTIDADE DESEJADA
		
	}
	
	public String teste() {
		return this.pigmentoSelecionado.getNome();
	}
	
	
	
}
