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
	
	public Pigmento pigmentoMaisProximo(String codigoHexadecimal) {
		double menorDistancia = 0.0;
		PigmentoRGB pigmentoProximo;
		listaDePigmentosRGB.forEach(pRGB->{
			if(pRGB.findDistanciaEuclidiana(Color.decode(codigoHexadecimal)) < menorDistancia)
			menorDistancia = pRGB.findDistanciaEuclidiana(Color.decode(codigoHexadecimal));
			pigmentoProximo = pRGB;
			
		});
		
		return pigmentoProximo;
		
		
	}
	
	
	
}
