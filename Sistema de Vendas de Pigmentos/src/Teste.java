import model.PigmentoCMYK;
import model.PigmentoRGB;

public class Teste {

	public static void main(String[] args) {
		PigmentoCMYK pigrgb = new PigmentoCMYK();
		int[] cor = {255, 0, 0};
		System.out.println(pigrgb.findDistanciaEuclidiana(cor));
		PigmentoRGB pigrgb2 = new PigmentoRGB();
		System.out.println(pigrgb2.findDistanciaEuclidiana(cor));
		
		

	}

}
