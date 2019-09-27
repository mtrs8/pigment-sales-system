package pigmentation.sales.model.session;

import java.awt.Color;

import pigmentation.sales.model.entities.Pigmento;

public interface Contract {
	public Color converterHexToRBG(Pigmento p);
	public Color converterHexToCMYK(Pigmento p, ConverterCMYK cmyk);
	public double distanceCalculator(Pigmento p1, Pigmento p2);
	public void debitar(int qtdEstoque);
}
