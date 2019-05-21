package exemplo04;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Scanner nums = new Scanner(System.in);
		
		String[] nomes = new String[20];
		int[] idades = new int[20];
		
		int i = 0;
		boolean continuar = true;
		int verContinuar;
		
		do {
			System.out.println("Insira o " + (i+1) + "º nome:");
			nomes[i] = input.nextLine();
			System.out.println("Insira a " + (i+1) + "º idade:");
			idades[i] = nums.nextInt();
			i++;
			
			
			
			System.out.println("Continuar?");
			verContinuar = nums.nextInt();
			if (verContinuar !=0) {
				continuar = false;
			}
			
		}while(continuar == true);
		
		for (int o = 0; o <nomes.length; o++) {
			if (nomes[o] != null) {
			System.out.println("Nome:" + nomes[o] + ", idade:" + idades[o]);
			}
		}
		
	}

}
