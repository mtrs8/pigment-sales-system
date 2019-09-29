package pigmentation.sales.model;

import java.awt.Color;

public class ConverterRGB extends Pigmento {
	
	public Color converterHexToRBG(Pigmento p) {
		Color rgb = Color.decode(p.getId());
		return rgb;
	}

	@Override
	public double distanceCalculator(Pigmento p1, Pigmento p2) {
		// TODO Auto-generated method stub
		return 0;
	}
}
