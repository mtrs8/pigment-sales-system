package model;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Consumer;

public class Estoque {

	
	public List<PigmentoRGB> listaDePigmentosRGB = new ArrayList<PigmentoRGB>();
	public List<PigmentoCMYK> listaDePigmentosCMYK = new ArrayList<PigmentoCMYK>();
	private double menorDistancia = 0.0;
	private String idPigmentoEscolhido;
	
	public Estoque() {
		
	}
	
	public void addNaListaRGB(Collection<PigmentoRGB> collection) {
		listaDePigmentosRGB.addAll(collection);
	}
	
	public void addNaListaCMYK(Collection<PigmentoCMYK> collection) {
		listaDePigmentosCMYK.addAll(collection);
	}
	
	
	
	public void pigmentoRGBMaisProximo(String codigoHexadecimal) {
		Color colorRGB = Color.decode(codigoHexadecimal);
		this.listaDePigmentosRGB.forEach(pRGB->{
			if(pRGB.findDistanciaEuclidiana(colorRGB) < menorDistancia)
				this.idPigmentoEscolhido = pRGB.getId();
		});
	}
																							
	public void pigmentoCMYKMaisProximo(String codigoHexadecimal) {
		Color colorRGB = Color.decode(codigoHexadecimal);
		this.listaDePigmentosCMYK.forEach(pCMYK->{
			if(pCMYK.findDistanciaEuclidiana(colorRGB) < menorDistancia)
			this.idPigmentoEscolhido = pCMYK.getId();
			
		});
	}
	
	public String getIdPigmentoMaisProximo(String codigoHexadecimal) {
		this.pigmentoRGBMaisProximo(codigoHexadecimal);
		this.pigmentoCMYKMaisProximo(codigoHexadecimal);	
		return this.idPigmentoEscolhido;
	}

	
}
