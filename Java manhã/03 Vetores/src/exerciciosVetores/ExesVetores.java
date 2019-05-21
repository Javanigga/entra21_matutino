package exerciciosVetores;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class ExesVetores {
	public static void main(String[] args) {
		/*Exercicio 1
		System.out.println("1)");
		Scanner numerosE1 = new Scanner(System.in);
		int[] num1 = new int[10];
		int[] num2 = new int[10];
		double resultado;


		for(int x = 0; x < num1.length; x++ ) {
			System.out.print("Insira o " + (x+1) + "� n�mero:");
			num1[x] = numerosE1.nextInt();
		}

		System.out.println("");
		for(int y = 0; y<num2.length; y++) {
			System.out.print("Insira o " + (y+1) + "� n�mero:");
			num2[y] = numerosE1.nextInt();
		}

		System.out.println("");
		System.out.println("1)Soma | 2)Subtra��o | 3)Multiplica��o | 4)Divis�o");
		System.out.print("Insira a opera��o:");
		int esc = numerosE1.nextInt();

		if (esc == 1) {
			for (int z = 0; z<10; z++) {
				System.out.println(num1[z] + " + " + num2[z] + " = " + (num1[z] + num2[z]));
			}
		}
		if (esc == 2) {
			for (int z = 0; z<10; z++) {
				System.out.println(num1[z] + " - " + num2[z] + " = " + (num1[z] - num2[z]));
			}
		}
		if (esc == 3) {
			for (int z = 0; z<10; z++) {
				System.out.println(num1[z] + " X " + num2[z] + " = " + (num1[z] * num2[z]));
			}
		}
		if (esc == 4) {
			for (int z = 0; z<10; z++) {
				resultado =(double) num1[z]/num2[z]; 
				System.out.println(num1[z] + " / " + num2[z] + " = " + resultado);
			}
		}

		//Exercicio 2
		System.out.println("");
		System.out.println("2)");

		Scanner numerosE2 = new Scanner(System.in);

		int[] numeros = new int[10];

		for (int x = 0; x < numeros.length; x++) {
			System.out.print("Insira o " + (x+1) + "� n�mero:");
			numeros[x] = numerosE2.nextInt();
		}

		System.out.println("N�meros inseridos na ordem contr�ria:");

		for (int y = 9; y>-1;y--) {
			System.out.println(numeros[y]);
		}

		//Exercicio 3
		System.out.println("");
		System.out.println("3)");

		Scanner numerosE3 = new Scanner(System.in);
		int[] nums = new int[5];
		boolean dez = false;

		for (int i = 0; i<nums.length;i++) {
			System.out.print("Insira o " + (i+1) + "� n�mero:");
			nums[i] = numerosE3.nextInt();

		}
		for (int i = 0; i<nums.length;i++) {
			if (nums[i]== 10) {
				System.out.println("O n�mero 10 est� na posi��o " + (i+1) + " do vetor");
				dez = true;
			}
		}

		if (dez == false) {
			System.out.println("N�o foi encontrado nenhum n�mero 10");
		}

		//Exercicio 4
		System.out.println("");
		System.out.println("4)");
		Scanner textosE4 = new Scanner(System.in);

		String[] gabarito = new String[10];
		String[] respostas = new String[10];
		String[] nomes = new String[30];
		int[] acertosAlunos = new int[30];
		
		String nome = "";
		boolean verifica��o = false;
		boolean saida = false;
		int acertos = 0;
		int erros = 0;
		int contador = 0;

		System.out.println("Insira o gabarito da prova (A, B, C ou D em letra ma�scula):");

		for (int i =0; i<gabarito.length; i++) {
			System.out.println("Resposta " + (i+1) + ":");
			gabarito[i] = textosE4.nextLine();

			if (gabarito[i].contains("A") || gabarito[i].contains("B")|| gabarito[i].contains("C") || gabarito[i].contains("D")) {

			}else {
				while (verifica��o == false) {
					System.out.println("Insira uma alternativa v�lida:");
					gabarito[i] = textosE4.nextLine();
					if (gabarito[i].contains("A") || gabarito[i].contains("B")|| gabarito[i].contains("C") || gabarito[i].contains("D")){
						verifica��o = true;
					}
				}
				verifica��o = false;
			}//else

	}//for 
		
		System.out.print("Insira o nome do Aluno (ou SAIR para sair):");
		nome = textosE4.nextLine();

		while (saida == false) {

		System.out.println("Insira as respostas da prova do aluno (A, B, C ou D em letra ma�scula):");

		for (int x =0; x<respostas.length; x++) {
			System.out.println("Resposta " + (x+1) + ":");
			respostas[x] = textosE4.nextLine();

			if (respostas[x].contains("A") || respostas[x].contains("B")|| respostas[x].contains("C") || respostas[x].contains("D")) {

			}else {
				while (verifica��o == false) {
					System.out.println("Insira uma alternativa v�lida:");
					respostas[x] = textosE4.nextLine();
					if (respostas[x].contains("A") || respostas[x].contains("B")|| respostas[x].contains("C") || respostas[x].contains("D")){
						verifica��o = true;
					}
				}
				verifica��o = false;
			}//else
		}//for 2
		
		
		for (int y = 0; y < 10; y++) {
			if(respostas[y].equals(respostas[0])) {
				acertos++;
			}else {
				erros++;
			}
			
		}
		
		System.out.println("O aluno " + nome + " acertou " + acertos + " quest�es e errou " + erros);
		
		nomes[contador] = nome;
		acertosAlunos[contador] = acertos;
		
		acertos = 0;
		erros = 0;
		contador++;
		
		System.out.print("Insira o nome do Aluno (ou SAIR para sair):");
		nome = textosE4.nextLine();
		
		if (nome.contains("SAIR")) {
			saida=true;
		}

	}
		
		for (int i = 0; i<contador;i++) {
			System.out.println("Nome:" + nomes[i] + ", Acertos: " + acertosAlunos[i] );
		}*/
		
		
		
		
		
		
		
		
		
		
		
		//Exercicio 01
		
		/*Scanner vetores = new Scanner(System.in);
		
		int [] x = new int [10];
		int [] y = new int[10];
		
		for(int i  = 0; i < x.length ; i++) {
			System.out.println("insira um valor: ");
			x[i]=vetores.nextInt();
			}
		for(int i = 0; i < y.length; i++) {
			System.out.println("Insira um valo: ");
			y[i]=vetores.nextInt();
		}
		int indice=0;
		
	    System.out.println("Escolha a opera��o; "
	    		+ "\n1)Soma "
	    		+ "\n2)subtra��o"
	    		+ "\n3)divis�o"
	    		+ "\n4)Multiplica��o");
	    
	    
	    if(indice==1) {
	    	
	    	 
		    for (int i = 0; i < 10; i++) {
		    	System.out.println(x[i]+"  + "+ y[i]+ " = " + (x[i] + y[i]) );
		    }
	    }
		    if(indice==2) {
			
		    	for(int i = 0; i<10; i++) {
		    		System.out.println(x[i]+" - "+y[i]+ "=" + (x[i] - y[i]));
		    	}
		}
		    if(indice==3) {
		    	for(int i = 0; i<10; i++) {
		    		System.out.println(x[i] + " / " + y[i]+ "=" + (x[i] / y[i]));

		    }
		    }
		    if(indice==4) {
		    	for (int i = 0; i<10; i++) {
		    		System.out.println(x[i]+ "*" +y[i]+ "=" +(x[i] * y[i]));
		    		
		    		
		    	}
		    }
	
	
	}*/
		
		Scanner N2 = new Scanner(System.in);
		
		int[] x = new int [10];
		
		for(int i = 0; i< x.length; i++) {
			System.out.println("insira o "+ (i+1) " numero:");
			x[i] = N2.nextInt();
		}
	
	
	
	    	
	    	
	    
	    
	    
	    
	    
	    
	    		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		








	}//main

