
public class PigmentoRGB extends Pigmento {
	
	private int red, green, blue;
	
	@Override
	public Double findDistanciaEuclidiana(int[] corSolicitadaRGB) {
		
		red = 180; green = 108; blue = 114;
		double distanciaCalculada;
		double redDblResultado, greenDblResultado, blueDblResultado;
		double somaDeCores;
		
		
		redDblResultado = new Double(this.red - corSolicitadaRGB[0]);
		greenDblResultado = new Double(this.green - corSolicitadaRGB[1]);
		blueDblResultado = new Double(this.blue - corSolicitadaRGB[2]);
		
		somaDeCores = Math.pow(redDblResultado, 2) + 
				Math.pow(greenDblResultado, 2) + 
				Math.pow(blueDblResultado, 2);
		
		return distanciaCalculada = Math.sqrt(somaDeCores);
	}

}
