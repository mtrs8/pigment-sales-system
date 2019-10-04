package loja;

import java.util.logging.Level;
import java.util.logging.Logger;
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
            try {
                this.vendedor.consultarPigmentosPorQuantidade(qtdSolicitada);
                //PODE DAR EXCEPTION QUANDO N�O TEM NENHUM PIGMENTO COM A QUANTIDADE DESEJADA
            } catch (Exception ex) {
                Logger.getLogger(Loja.class.getName()).log(Level.SEVERE, null, ex);
            }
		
	}
	
	public String teste() {
		return this.pigmentoSelecionado.getNome();
	}
	
	
	
}
