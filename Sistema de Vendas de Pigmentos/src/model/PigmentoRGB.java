package model;
import java.awt.Color;

public class PigmentoRGB extends Pigmento {
	
	private int red, green, blue;
	
	
	public double findDistanciaEuclidiana(Color codigoHexEmRGB) {
		 
		double distanciaCalculada;
		double redDblResultado, greenDblResultado, blueDblResultado;
		double somaDeCores;

		redDblResultado = (double) (this.getRed() - codigoHexEmRGB.getRed());
		greenDblResultado = (double) (this.getGreen() - codigoHexEmRGB.getGreen());
		blueDblResultado = (double) (this.getBlue() - codigoHexEmRGB.getBlue());
		
		somaDeCores = Math.pow(redDblResultado, 2) + 
				Math.pow(greenDblResultado, 2) + 
				Math.pow(blueDblResultado, 2);
		
		return distanciaCalculada = Math.sqrt(somaDeCores);
	}

	public int getRed() {
		return red;
	}

	public void setRed(int red) {
		this.red = red;
	}

	public int getGreen() {
		return green;
	}

	public void setGreen(int green) {
		this.green = green;
	}

	public int getBlue() {
		return blue;
	}

	public void setBlue(int blue) {
		this.blue = blue;
	}
	
	

	

}
