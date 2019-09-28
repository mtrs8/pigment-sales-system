package pigmentation.sales.model;

import java.awt.Color;

public abstract class Pigmento{
	
	private String idHEX;
	private String nomeCor;
	private int qtdEstoque;
	private double preco;
	
	public Pigmento() {
	}
	
	public Pigmento(String id, String nomeCor, 
			int qtdEstoque, double preco) {
		this.idHEX = id;
		this.nomeCor = nomeCor;
		this.qtdEstoque = qtdEstoque;
		this.preco = preco;
	}

	public String getId() {
		return idHEX;
	}

	public String getNomeCor() {
		return nomeCor;
	}

	public int getQtdEstoque() {
		return qtdEstoque;
	}

	public double getPreco() {
		return preco;
	}

	public void setId(String id) {
		this.idHEX = id;
	}

	public void setNomeCor(String nomeCor) {
		this.nomeCor = nomeCor;
	}

	public void setQtdEstoque(int qtdEstoque) {
		this.qtdEstoque = qtdEstoque;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public abstract double distanceCalculator(Pigmento p1, Pigmento p2);
	
}
