package pigmentation.sales.model.session;

import java.awt.Color;

import pigmentation.sales.model.entities.Pigmento;

public abstract class Services implements Contract{
	
	@Override
	public abstract double distanceCalculator(Pigmento p1, Pigmento p2);
	
	@Override
	public Color converterHexToRBG(Pigmento p) {
		Color rgb = Color.decode(p.getId());
		return rgb;
	}

	@Override
	public void debitar(int qtdEstoque) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public Color converterHexToCMYK(Pigmento p, ConverterCMYK cmyk) {
		// TODO Auto-generated method stub
		Color rbg = converterHexToRBG(p);
		rbg.getRed();
		return null;
	}
	
	
	

}
