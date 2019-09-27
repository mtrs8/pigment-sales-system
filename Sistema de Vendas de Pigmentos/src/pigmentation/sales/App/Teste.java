package pigmentation.sales.App;

import java.util.Scanner;

import pigmentation.sales.model.entities.Pigmento;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Pigmento p = new Pigmento();
		int verificaPadrao = menu();
		int sair = 1;
		while(sair != 0) {
			switch(verificaPadrao) {
				case 0:{
					System.out.println("Finalizando...");
					sair=0;
				}
				case 1: {
					System.out.println("Entre com o padrão de cores Hexadecimal: ");
					p.setId(sc.nextLine());	
				}
				
				case 2:{
					System.out.println("Entre com padrão de cores CMYK (Cyan, Magenta, Yellow, Black): ");
					p.setId(sc.nextLine());
				}
				default: {
					System.out.println("Opção inválida, digite novamente!");
				}
			}
		}
	}		

		
		public static int menu() {
			int op;
			Scanner sc = new Scanner(System.in);
			System.out.println("Deseja entrar com qual padrão?");
			System.out.println("(1)RBG");
			System.out.println("(2)CMYK");
			op = sc.nextInt();
			return op;
		}
		
		
}