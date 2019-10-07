package loja;

import java.sql.SQLException;
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
		 try {
			this.pigmentoSelecionado = this.vendedor.getInfoDoPigmentoSelecionado(codigoHexadecimal);
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
	}

	@Override
	public void consultarPigmento(double qtdSolicitada) {
            try {
                this.vendedor.consultarPigmentosPorQuantidade(qtdSolicitada);
            } catch (Exception ex) {
                Logger.getLogger(Loja.class.getName()).log(Level.SEVERE, null, ex);
            }
		
	}
	
	public String teste() {
		return this.pigmentoSelecionado.getNome();
	}
	
	
	
}
