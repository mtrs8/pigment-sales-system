package model;

import java.sql.SQLException;

import persistence.EstoqueDAO;
import persistence.sql.EstoqueSQLDAO;

public class Vendedor {
	
	private EstoqueDAO estoquesystem;
	private Estoque estoqueFiltrado;
	
	
	public Vendedor() {
		this.estoquesystem = new EstoqueSQLDAO();
	}
	
	public void consultarPigmentosPorQuantidade(double qtdSolicitada) {
		try {
			this.estoqueFiltrado.addNaListaRGB(this.estoquesystem.pesquisarPigmentoRGBDisponiveis(qtdSolicitada));
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		try {
			this.estoqueFiltrado.addNaListaCMYK(this.estoquesystem.pesquisarPigmentoCMYKDisponiveis(qtdSolicitada));
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public Pigmento getInfoDoPigmentoSelecionado(String codigoHexadecimal) {
		String idDoPigmento = this.estoqueFiltrado.getIdPigmentoMaisProximo(codigoHexadecimal);
		Pigmento pig = this.estoquesystem.getInfoPigmento(idDoPigmento);
		return pig;
	}


}
