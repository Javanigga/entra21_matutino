package exemplo02;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String[] nomes = new String[3];
		
		int indice = 0;
		
		while (indice <3) {
			System.out.println("Insira o " + (indice+1) +"º nome:");
			nomes[indice] = input.nextLine();
			indice++;
		}
		
		indice = 0;
		while (indice <3) {
			System.out.println((indice+1) + "º nome é " + nomes[indice]);
			indice++;	
		}
		
		
		
		
	}

}
