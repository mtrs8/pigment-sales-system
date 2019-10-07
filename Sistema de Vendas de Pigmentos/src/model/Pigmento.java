package model;

import java.awt.Color;

public abstract class Pigmento{
	
	private String nome;
	private String id;
	private double qtdNoEstoque;
	private double preco;
	
	public Pigmento(String nome, String idPigmento, int qtdNoEstoque, double preco) {
		super();
		this.setNome(nome);
		this.setId(idPigmento);
		this.setQtdNoEstoque(qtdNoEstoque);
		this.setPreco(preco);
	}
	
	public Pigmento() {
		super();
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public double getQtdNoEstoque() {
		return qtdNoEstoque;
	}
	
	public void setQtdNoEstoque(double qtdNoEstoque) {
		this.qtdNoEstoque = qtdNoEstoque;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public abstract double findDistanciaEuclidiana(Color codigoHexEmRGB);

	
	
}
