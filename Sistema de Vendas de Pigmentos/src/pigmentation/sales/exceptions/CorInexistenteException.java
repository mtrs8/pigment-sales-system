package pigmentation.sales.exceptions;


public class CorInexistenteException extends Exception{
	
	private static final long serialVersionUID = 1L;
	private String nome;
	
	public CorInexistenteException(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
}
