package Loja;

import java.io.BufferedReader;
import java.util.Scanner;

public class LojaConsole {
	
	private LojaApp loja;
	
	private Scanner sc;
	
	public LojaConsole() {
		this.loja = new Loja();
		this.sc = new Scanner(System.in);
		
	}
	
	private void consultarPigmento() {
		
		String codigoHexadecimal;
		
		System.out.println("SOLICITAR PIGMENTO");
		System.out.println("Informe o pigmento desejado:");
		codigoHexadecimal = this.sc.nextLine();
		this.loja.consultarTintaDisponivel(codigoHexadecimal);
		
	}
}
