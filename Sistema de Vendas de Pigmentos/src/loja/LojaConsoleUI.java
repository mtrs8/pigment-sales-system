package loja;


import java.util.Locale;
import java.util.Scanner;

import loja.Loja;
import loja.LojaApp;

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
		
		System.out.println("SOLICITAR PIGMENTO\n");
		System.out.println("Informe o pigmento desejado:");
		codigoHexadecimal = sc.next();
		System.out.println("Informa a quantidade desejada:");
		qtdDesejada = sc.nextDouble();
		
		this.loja.consultarPigmento(qtdDesejada);

		this.loja.selecionarPigmento(codigoHexadecimal);
		
		System.out.println("Pigmento selecionado! Segue as informações: ");
		System.out.println("ID: " + this.loja.getIdPigmento());
		System.out.println("Nome: " + this.loja.getNomePigmento());
		System.out.println("Preço: " + this.loja.getPrecoPigmento());
		
		int op = -1;
		
		while(op!=0) {
			System.out.println("Deseja comprar este pigmento?");
			op = sc.nextInt();
			
			switch(op) {
			
			case 0: {
				System.out.println("Saindo então...");
				op=0;
				break;
			}
			
			case 1: {
				System.out.println("Vumbora");
				this.loja.debitar(qtdDesejada);
				System.out.println("Foi");
			}
				
			}
		}
		
	}
	
	public void run() {
		
		this.solicitarPigmento();
	}
	
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		(new LojaConsoleUI()).solicitarPigmento();
		
	}

}
