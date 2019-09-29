package model;

import java.sql.SQLException;

import persistence.EstoqueDAO;
import persistence.sql.EstoqueSQLDAO;

public class Vendedor {
	
	private EstoqueDAO estoquesystem;
	private Estoque estoqueSelecionado;
	
	
	public Vendedor() {
		this.estoquesystem = new EstoqueSQLDAO();
	}
	
	public void consultarPigmentosPorQuantidade(double qtdSolicitada) {
		try {
			this.estoqueSelecionado.addNaListaRGB(this.estoquesystem.pesquisarPigmentoRGBDisponiveis(qtdSolicitada));
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		this.estoqueSelecionado.addNaListaCMYK(this.estoquesystem.pesquisarPigmentoCMYKDisponiveis());
	}
	
	public Pigmento getInfoDoPigmentoSelecionado(String codigoHexadecimal) {
		String idDoPigmento = this.estoqueSelecionado.getIdPigmentoMaisProximo(codigoHexadecimal);
		Pigmento pig = this.estoquesystem.getInfoPigmento(idDoPigmento);
		return pig;
	}


}
