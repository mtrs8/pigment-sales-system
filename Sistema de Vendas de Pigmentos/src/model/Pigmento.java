package model;
import java.awt.Color;
import java.io.Serializable;

public abstract class Pigmento implements Serializable {
	
	private String nome;
	private String idPigmento;
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
		
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getId() {
		return idPigmento;
	}
	
	public void setId(String idPigmento) {
		this.idPigmento = idPigmento;
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
	
	public abstract Double findDistanciaEuclidiana(Color codigoHexEmRGB);
	
}
