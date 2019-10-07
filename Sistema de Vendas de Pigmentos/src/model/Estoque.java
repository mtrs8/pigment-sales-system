package model;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Estoque {

	
	public List<PigmentoRGB> listaDePigmentosRGB = new ArrayList<PigmentoRGB>();
	public List<PigmentoCMYK> listaDePigmentosCMYK = new ArrayList<PigmentoCMYK>();
	private double menorDistancia = -1.0;
	public String idPigmentoEscolhido;
	
	public Estoque() {
		
	}
	
	public void addNaListaRGB(Collection<PigmentoRGB> collection) {
		listaDePigmentosRGB.addAll(collection);
	}
	
	public void addNaListaCMYK(Collection<PigmentoCMYK> collection) {
		listaDePigmentosCMYK.addAll(collection);
	}
	
	
	
	public void pigmentoRGBMaisProximo(String codigoHexadecimal) {
		double mD;
		Color colorRGB = Color.decode(codigoHexadecimal);
		this.listaDePigmentosRGB.forEach(pRGB->{
			if(this.menorDistancia == -1.0) {
				this.idPigmentoEscolhido = pRGB.getId();
				this.menorDistancia = pRGB.findDistanciaEuclidiana(colorRGB);
			}
			else if(pRGB.findDistanciaEuclidiana(colorRGB) < this.menorDistancia) {
				this.idPigmentoEscolhido = pRGB.getId();
				this.menorDistancia = pRGB.findDistanciaEuclidiana(colorRGB);
			}
		});
	}
																							
	public void pigmentoCMYKMaisProximo(String codigoHexadecimal) {
		Color colorRGB = Color.decode(codigoHexadecimal);
		this.listaDePigmentosCMYK.forEach(pCMYK->{
			if(this.menorDistancia == -1.0) {
				this.idPigmentoEscolhido = pCMYK.getId();
				this.menorDistancia = pCMYK.findDistanciaEuclidiana(colorRGB);
			}
			else if(pCMYK.findDistanciaEuclidiana(colorRGB) < menorDistancia) {
				this.idPigmentoEscolhido = pCMYK.getId();
				this.menorDistancia = pCMYK.findDistanciaEuclidiana(colorRGB);
			}
		});
	}
	
	public String getIdPigmentoMaisProximo(String codigoHexadecimal) {
		this.pigmentoRGBMaisProximo(codigoHexadecimal);
		this.pigmentoCMYKMaisProximo(codigoHexadecimal);	
		return this.idPigmentoEscolhido;
	}

	
}
