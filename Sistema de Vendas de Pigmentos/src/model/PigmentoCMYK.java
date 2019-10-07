package model;

import java.awt.Color;

public class PigmentoCMYK extends Pigmento {
	
	private double cyan, magenta, yellow, keyBlack;

	
	public double findDistanciaEuclidiana(Color codigoHexEmRGB) {
		
		double distanciaCalculada;
		double redDblResultado, greenDblResultado, blueDblResultado;
		double somaDeCores;
		 
		redDblResultado = (255 * (1-this.cyan / 100)) * (1-this.keyBlack / 100) ;
		greenDblResultado = (255 * (1-this.magenta / 100)) * (1-this.keyBlack / 100);
		blueDblResultado = (255 * (1-this.yellow / 100)) * (1-this.keyBlack / 100);
		
		
		redDblResultado -= codigoHexEmRGB.getRed();
		greenDblResultado -= codigoHexEmRGB.getGreen();
		blueDblResultado -= codigoHexEmRGB.getBlue();
		
		
		somaDeCores = Math.pow(redDblResultado, 2) + 
				Math.pow(greenDblResultado, 2) + 
				Math.pow(blueDblResultado, 2);
		
		return distanciaCalculada = Math.sqrt(somaDeCores);
	}

	public double getCyan() {
		return cyan;
	}

	public void setCyan(double cyan) {
		this.cyan = cyan;
	}

	public double getMagenta() {
		return magenta;
	}

	public void setMagenta(double magenta) {
		this.magenta = magenta;
	}

	public double getYellow() {
		return yellow;
	}

	public void setYellow(double yellow) {
		this.yellow = yellow;
	}

	public double getKeyBlack() {
		return keyBlack;
	}

	public void setKeyBlack(double keyBlack) {
		this.keyBlack = keyBlack;
	}
	
	
	

}
