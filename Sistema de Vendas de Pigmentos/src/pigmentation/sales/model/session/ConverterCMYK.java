package pigmentation.sales.model.session;

import java.awt.Color;

import pigmentation.sales.model.entities.Pigmento;

public class ConverterCMYK {
	
	private int cianno;
	private int magenta;
	private int yellow;
	private int keyBlack;
	
	public ConverterCMYK(int cianno, int magenta, int yellow, int keyBlack) {
		super();
		this.setCianno(cianno);
		this.setCianno(magenta);
		this.setCianno(yellow);
		this.setKeyBlack(keyBlack);
	}

	private int getCianno() {
		return cianno;
	}

	private void setCianno(int cianno) {
		this.cianno = cianno;
	}

	private int getMagenta() {
		return magenta;
	}

	private void setMagenta(int margenta) {
		this.magenta = margenta;
	}

	private int getYellow() {
		return yellow;
	}

	private void setYellow(int yellow) {
		this.yellow = yellow;
	}

	private int getKeyBlack() {
		return keyBlack;
	}

	private void setKeyBlack(int keyBlack) {
		this.keyBlack = keyBlack;
	}

	
	
}
