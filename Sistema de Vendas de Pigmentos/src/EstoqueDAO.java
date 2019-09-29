
public interface EstoqueDAO {
	
	public void debitar(Pigmento pigmentoEscolhido);
	
	public Pigmento escolherPigmentoRGB(String codigoHexadecimal);
	
	public Pigmento escolherPigmentoCMYK(String codigoHexadecimal);
	
	

}
