package exemplo01;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);	
		//var que armazena vários dados
		
		String [] nomes = new String[3];
		
		//Pedir os tres nomes
		System.out.println("Insira o primeiro nome");
		nomes[0] = input.nextLine();
		System.out.println("Insira o segundo nome");
		nomes[1] = input.nextLine();
		System.out.println("Insira o terceiro nome");
		nomes[2] = input.nextLine();
		
		System.out.println(nomes[0] + "       " + nomes[1] + "       " +nomes[2]);
		
		input.close();
		
	}

}
