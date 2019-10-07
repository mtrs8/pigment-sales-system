package loja;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Pigmento;
import model.Vendedor;

public class Loja implements LojaApp {
	
	public Vendedor vendedor;
	public Pigmento pigmentoSelecionado;
	
	
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
            } catch (Exception e) {
				e.printStackTrace();
			} 
	}
	
	@Override
	public void debitar(double qtdDesejada) {
		double qtdRestante = this.pigmentoSelecionado.getQtdNoEstoque() - qtdDesejada;
		this.vendedor.debitarQtdNoBanco(this.pigmentoSelecionado.getId(), qtdRestante);
	}

	

	@Override
	public String getNomePigmento() {
		return this.pigmentoSelecionado.getNome();
	}

	@Override
	public double getPrecoPigmento() {
		return this.pigmentoSelecionado.getPreco();
	}

	@Override
	public String getIdPigmento() {
		return this.pigmentoSelecionado.getId();
	}
	
	

	
	
}
