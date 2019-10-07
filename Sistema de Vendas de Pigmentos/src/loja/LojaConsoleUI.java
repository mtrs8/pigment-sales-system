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
		//PODE DAR EXCEPTION QUANDO NÃO TEM NENHUM PIGMENTO COM A QUANTIDADE DESEJADA
		//CASO TENHA, AI ELE FAZ A SELEÇÃO CORRETAMENTE, ENTÃO TEM QUE FAZER UM IF-ELSE AQUI OU TRY-CATCH 
		/*Matheus:
		Aí tem que lançar o throws lá na hora da consulta e
		tratar aqui, quando eu conseguir entender o código posso fazer KK
		*/
		this.loja.selecionarPigmento(codigoHexadecimal);
		
		System.out.println(this.loja.teste());
		
	}
	
	public void run() {
		
		this.solicitarPigmento();
	}
	
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		(new LojaConsoleUI()).solicitarPigmento();
		
	}

}
