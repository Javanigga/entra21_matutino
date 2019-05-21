package Prova;

import java.util.Scanner;

public class Prova {

	public static void main(String[] args) {

		Scanner arm = new Scanner(System.in);
		
		
		String nome;
		int sexo = 0;
		int idade = 0;
		int sistema = 0;
		 int sim = 0;
		 int nao = 0;
		boolean valido = false; 
		int departamentos=0;
		 int Audio=0;
		  int TV=0;
		  int AP=0;
		 int Informatica=0;
		  int hardware=0;
		  int Software=0;
		 int Telefonia=0;
		  int Smartphones=0;
		  int tablet=0;
		 int Vestuario=0;
		  int Masculino=0;
		  int Feminino=0;
		 
		while(valido = false)
		{
		System.out.println("Você deseja realmente utilizar o sistema? \n1)Sim \n)2 Não ");
		sistema = arm.nextInt();
		if(sistema == 1) {
			sim++;
		}while(sistema >=2);
		}valido = true;
		
		System.out.println();
		
		
			
			
		System.out.println("insira o nome: ");
		nome = arm.nextLine();
		System.out.println("Insira seu sexo: ");
		sexo = arm.nextInt();
		System.out.println("insira sua idade: ");
		idade = arm.nextInt();

		
			
		System.out.println("Insira o departamento desejado: "
					+ "\n1)Áudio/video "
					+ "\n2)Informática "
					+ "\n3)Telefonia "
					+ "\n4)Vestuario "
					+ "\n5)Voltar ");
		departamentos=arm.nextInt();
			
			   System.out.println("Selecione qual procuto da area de Audio/Video desejado: "
			   		+ "\n1)TV "
			   		+ "\n2)Aparelho de Som ");
			Audio = arm.nextInt();
			if(Audio==1) {
				TV++;
			}else if(Audio==2) {
				AP++;
			}
			       System.out.println("Escolha um tipo de TV: "
			       		+ "\n1) Smart TV Led 49 Samsung - R$ 4.999,99 "
			       		+ "\n2) Smart TV 4k LG 60 - R$7.499,00 "
			       		+ "\n3) Smart TV Full HD 32 Samsung - R$ 1.710,00 ");
			         
			       System.out.println("Escolha um tipo de Aparelho de Som"
			       		+ "\n1) Semp Toshiba Áudio Bright - R$ 599,99 "
			       		+ "\n2) Mini System LG - R$ 512,00 "
			       		+ "\n3) Mini System Philco - R$ 499,99 ");
			       
			   System.out.println("Selecione qual produto da area de Informática desejado: "
			   		+ "\n1)Hardware"
			   		+ "\n2)Software");
			Informatica = arm.nextInt(); 
			if(Informatica==1) {
				hardware++;				
			}else if(Informatica==2) {
				Software++;
			}
			       System.out.println("Escolha um tipo de Hardware: "
			       		+ "\n1) Placa Mãe Asus - R$ 2.000,00 "
			       		+ "\n2) Memória Ram Corsair 4GB - R$500,00 "
			       		+ "\n3) Mouse Multilaser - R$59,90");
			       System.out.println("Escolha um tipo de Software: "
			       		+ "\n1) Windows 10  - R$500,00 "
			       		+ "\n2) Office 2019   - R$399,99 "
			       		+ "\n3) AutoCard 3D - R$899,50 ");
			  
			   System.out.println("Selecione qual produto da area de Telefonia você deseja: "
			   		+ "Smartphone "
			   		+ "Tablets ");
			Telefonia = arm.nextInt();
			if(Telefonia==1) {
				Smartphones++;
			}else if(Telefonia==2) {
				tablet++;
			}
			       System.out.println("Selecione  um tipo de Smartphone: "
			       		+ "\n1)Exemplo1 "
			       		+ "\n2)Exemplo2 "
			       		+ "\n3)Exemplo3 ");  
			       System.out.println("Selecione um tipo de Tablet: "
			       		+ "\n1)Exemplo1 "
			       		+ "\n2)Exemplo2 "
			       		+ "\n3)Exemplo3 ");
			       
			   System.out.println("Selecione qual produto da area de Vestuario você deseja: "
			   		+ "\n1)Masculino "
			   		+ "\n2)Feminino ");
			Vestuario = arm.nextInt();
			if(Vestuario==1) {
				Masculino++;
			}else if(Vestuario==2) {
				Feminino++;
			}
			       System.out.println("Selecione um tipo de Vestuario masculino: "
			       		+ "\n1) Camisa Social Lacoste - R$ 200,00 "
			       		+ "\n2) Calça Jeans Calvin Klein R$ 230,00 "
			       		+ "\n3) Camisa Social Dudalina - R$ 130,00  ");
			       
			
			
			
			
			
			
			
			
		
		
		
	}

}
