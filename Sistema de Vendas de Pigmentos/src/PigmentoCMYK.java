
public class PigmentoCMYK extends Pigmento {
	
	private double cyan, magenta, yellow, keyBlack;

	@Override
	public Double findDistanciaEuclidiana(int[] corSolicitadaRGB) {
		this.cyan = 0; this.magenta = 40; this.yellow = 37; this.keyBlack = 29;
		double distanciaCalculada;
		double redDblResultado, greenDblResultado, blueDblResultado;
		double somaDeCores;
		 
		redDblResultado = (255 * (1-this.cyan / 100)) * (1-this.keyBlack / 100) ;
		greenDblResultado = (255 * (1-this.magenta / 100)) * (1-this.keyBlack / 100);
		blueDblResultado = (255 * (1-this.yellow / 100)) * (1-this.keyBlack / 100);
		
		
		redDblResultado -= corSolicitadaRGB[0];
		greenDblResultado -= corSolicitadaRGB[1];
		blueDblResultado -= corSolicitadaRGB[2];
		
		
		somaDeCores = Math.pow(redDblResultado, 2) + 
				Math.pow(greenDblResultado, 2) + 
				Math.pow(blueDblResultado, 2);
		
		return distanciaCalculada = Math.sqrt(somaDeCores);
	}
	

}
