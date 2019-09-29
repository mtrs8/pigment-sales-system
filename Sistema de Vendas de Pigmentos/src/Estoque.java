import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Estoque {

	
	public List<PigmentoRGB> listaDePigmentosRGB = new ArrayList<PigmentoRGB>();
	public List<PigmentoCMYK> listaDePigmentosCMYK = new ArrayList<PigmentoCMYK>();
	
	public Estoque() {
		
	}
	
	public void addNaListaRGB(PigmentoRGB pig) {
		listaDePigmentosRGB.add(pig);
	}
	
	public void addNaListaCMYK(PigmentoCMK pig) {
		listaDePigmentosCMYK.add(pig);
	}
	
	
	public PigmentoRGB pigmentoRGBMaisProximo(String codigoHexadecimal) {
		double menorDistancia = 0.0;
		PigmentoRGB pigmentoProximo;
		Color colorRGB = Color.decode(codigoHexadecimal);
		listaDePigmentosRGB.forEach(pRGB->{
			if(pRGB.findDistanciaEuclidiana(colorRGB) < menorDistancia)
			menorDistancia = pRGB.findDistanciaEuclidiana(Color.decode(codigoHexadecimal));
			pigmentoProximo = pRGB;
			
		});
		
		return pigmentoProximo;
		
		
	}
												
											
	public PigmentoCMYK pigmentoCMYKMaisProximo(String codigoHexadecimal) {
		
		double menorDistancia = 0.0;
		PigmentoRGB pigmentoProximo;
		listaDePigmentosCMYK.forEach(pCMYK->{
			if(pCMYK.findDistanciaEuclidiana() < menorDistancia)
			menorDistancia = pRGB.findDistanciaEuclidiana(Color.decode(codigoHexadecimal));
			pigmentoProximo = pCMYK;
			
		});
		
		return pigmentoProximo;
		
	}
	
	
	
}
