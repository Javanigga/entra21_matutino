package exemplo06;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[][] cursos = new String[2][2];
		
		for (int i = 0; i<2; i++) {
			System.out.println("Nome do curso:");
			cursos[i][0] = input.nextLine(); 
			System.out.println("Area de atuação:");
			cursos[i][1] = input.nextLine();
		}
		
		System.out.println("Curso: " + cursos[0][0] + " - Área:" + cursos[0][1]);
		System.out.println("Curso: " + cursos[1][0] + " - Área:" + cursos[1][1]);
		
		
	}

}
