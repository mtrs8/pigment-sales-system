package loja;

import java.io.IOException;
import java.util.Scanner;

public class LojaConsoleUI {
	
	private LojaApp loja;
	private Scanner sc;
	
	
	public LojaConsoleUI() {
		this.loja = new Loja();
		this.sc = new Scanner(System.in);
		
	}
	
	private void solicitarPigmento() {
		
		String codigoHexadecimal;
		double qtdDesejada;
		
		System.out.println("SOLICITAR PIGMENTO");
		System.out.println("Informe o pigmento desejado:");
		codigoHexadecimal = this.sc.nextLine();
		System.out.println("Informa a quantidade desejada:");
		qtdDesejada = this.sc.nextDouble();
		
		this.loja.consultarPigmento(qtdDesejada);
		//PODE DAR EXCEPTION QUANDO NÃO TEM NENHUM PIGMENTO COM A QUANTIDADE DESEJADA
		//CASO TENHA, AI ELE FAZ A SELEÇÃO CORRETAMENTE, ENTÃO TEM QUE FAZER UM IF-ELSE AQUI OU TRY-CATCH
		
		
		this.loja.selecionarPigmento(codigoHexadecimal);
		
		System.out.println(this.loja.teste());
		
	}
	
	public void run() {
		
		this.solicitarPigmento();

	}
	
	public static void main(String[] args) throws ClassNotFoundException, IOException {
		(new LojaConsoleUI()).run();
	}
	
}
