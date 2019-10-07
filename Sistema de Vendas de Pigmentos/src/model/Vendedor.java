package model;

import java.sql.SQLException;

import persistence.EstoqueDAO;
import persistence.sql.EstoqueSQLDAO;

public class Vendedor {
	
	private EstoqueDAO estoquesystem;
	private Estoque estoqueFiltrado;
	
	
	public Vendedor() {
		this.estoquesystem = new EstoqueSQLDAO();
		this.estoqueFiltrado = new Estoque();
	}
	
	public void consultarPigmentosPorQuantidade(double qtdSolicitada) throws Exception {
		try {
			this.estoqueFiltrado.addNaListaRGB(this.estoquesystem.pesquisarPigmentoRGBDisponiveis(qtdSolicitada));
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException e) {
			throw new Exception(e);
		}
		try {
			this.estoqueFiltrado.addNaListaCMYK(this.estoquesystem.pesquisarPigmentoCMYKDisponiveis(qtdSolicitada));
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException e) {
			throw new Exception(e);
		}
	}
	
	public Pigmento getInfoDoPigmentoSelecionado(String codigoHexadecimal) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		String idDoPigmento = this.estoqueFiltrado.getIdPigmentoMaisProximo(codigoHexadecimal);
		return this.estoquesystem.getInfoPigmento(idDoPigmento);
	}


	public void debitarQtdNoBanco(String id, double qtd) {
		this.estoquesystem.debitar(id, qtd);
	}


}
