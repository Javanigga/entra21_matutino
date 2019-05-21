package Exercicios;

import java.util.Scanner;

import javax.swing.JOptionPane;



public class Exercicios01 {

	public static void main(String[] args) {

		
		/*Scanner cadastro = new Scanner (System.in);
	
		
		int gerente=0;
		int açougueiro=0;
		int atendente=0;
		int secretaria=0;
		int almoxarife=0;
		int pedreiro=0;
		int estagiario=0;		
		String nome;
		int idade=1;
		int sexo=0;
		int continuar = 0;
		int cargo;
		int Npessoas=1;
		int masc = 0;
		int fem=0;
		int maior=0;
		int menor=0;
		
		
		
		//Laço
		do {
		
			//Perguntas
			
			System.out.println("Informe seu nome: ");
			nome = cadastro.next();
			
			System.out.println("Informe sua idade");
			idade = cadastro.nextInt();
				
			System.out.println("Informe o sexo:\n1)Masculino\n2)Feminino");
			sexo = cadastro.nextInt();
			{if (sexo >= 3)
				JOptionPane.showMessageDialog(null, "erro");}
			System.out.println("Infrome seu cargo: \n1)Gerente \n2)Açougueiro \n3)Atendente \n4)Secretaria \n5)Almoxarife \n6)Pedreiro \7)Estagiario");
			cargo = cadastro.nextInt();
			
			Npessoas++; 
				
			
			if(idade <=17  ) {
				menor++;
			} else {
				maior++;
			}if (sexo == 1) {
				masc++;
			}else {
				fem++;
			}if (cargo == 1) {
				gerente++;
			}if(cargo == 2) {
				açougueiro++;
			}if(cargo == 3) {
				atendente++;
			}if(cargo == 4) {
				secretaria++;
			}if(cargo == 5) {
				almoxarife++;
			}if(cargo == 6) {
				pedreiro++;
			}if(cargo == 7) {
				estagiario++;
			}
			
		
			
		}while(Npessoas <= 10 );
		       
		   
		System.out.println("Quantidade de pessoas do sexo Masc. "+masc);
		System.out.println("Quantidade de pessoas do sexo fem. "+fem);
		System.out.println("Quantidade de pessoas em cada profissão: "+gerente + açougueiro + atendente + secretaria + almoxarife + pedreiro + estagiario);
		System.out.println("Quantidae de pessoas menores de idade: "+menor);
		System.out.println("Quantidade de pessoas maiores de idade: "+maior);*/
		
		    
	
	
		
	/*Scanner dados = new Scanner (System.in);	
		
		
	String nome;
	int altura = 0;
	int idade = 0;
	int peso = 0;
	int Njogadores = 0;
	int SAIR = 0;
	boolean valido = false;
	
	
	do {
		
		
		System.out.println("Informar o nome: ");
		nome = dados.nextLine(); 
		
		

		System.out.println("informar a altura: ");
		altura = dados.nextInt();
		
		System.out.println("Informar a idade: ");
		idade = dados.nextInt();
		
		System.out.println("Informar o peso: ");
		peso = dados.nextInt();
		
		
	}while (Njogadores <= 5);
	

	System.out.println("Quantidade de jogadores cadastrados: "+ Njogadores);
	System.out.println("O maior jogador se chama: "+altura);
	System.out.println("O jogador mais velho se chama: "+idade);
	System.out.println("O jogador mais pesado se chama: "+peso);
	*/
	
		
		
	//ex3
		/*Scanner armazenar = new Scanner(System.in);
		int hamburguer = 5;
		double SN = 4.50;
		int PD = 8;
		int quantidade = 0;
		int codigo = 0;
		double troco = 0;
		double total = 0;
		int pedidos = 0;
		int pagamento = 0;
		
	   		
		System.out.println("Faça seu pedido:  \n1)hamburguer \n2)SN  \n3)PD \n4)final ");
	    codigo = armazenar.nextInt();
	    	   
	    do 
	    {
	    	System.out.println("qnt");
	    quantidade = armazenar.nextInt();
	    	System.out.println();
	    	
	    if(codigo==1) {
	    	total += hamburguer*quantidade;
	    }if(codigo==2) {
	    	total += SN*quantidade;
	    }if(codigo==3) {
	    	total += PD*quantidade;
	    	
	    }
		System.out.println("Faça seu pedido:  \n1)hamburguer \n2)SN  \n3)PD \n4)final ");
	    codigo = armazenar.nextInt();
	    
	    } while (codigo < 4 );
	    
	
	    
	    
	    System.out.println("Total: "+ total);
	    
	    System.out.println("insira o valor do pagamento");
	    pagamento = armazenar.nextInt();
	    
	   
	    
	    while(pagamento < total){
	    	System.out.println("Insira o valor correto: ");
	    	pagamento = armazenar.nextInt();
	    
	    
	   }
	    System.out.println("Troco: "+ (total - pagamento));*/ 
		
		
		//ex04
		
		/*Scanner arm = new Scanner(System.in);
		double PV = 0;
		double quantidade = 0;
		int crianças = 0;
		int adolecentes = 0;
		int adultos = 0;
		int idade = 0;
		int excelente = 0;
		int otimo = 0;
		int bom = 0;
		int regular = 0;
		int ruim = 0;
		boolean valida = true;
		int sair = 0;
		do {
			System.out.println("O que você achou do filme: \n1)Excelente \n2)Otimo \n3)Bom \n4)Regular \n5)Ruim \n6)Sair");
			PV = arm.nextInt();
			
			System.out.println("Informe sua idade: ");
		idade = arm.nextInt();
		
	
		
	
	if (idade >= 0 || idade <= 9 ) {
		crianças++;
	}else if(idade >=10 || idade <= 17 ) {
		adolecentes++;
	}else if(idade >= 18 ) {
		adultos++;
	}else if(PV == 1 ) {
		excelente++;
	}else if(PV == 2) {
		otimo++;
	}else if(PV == 3) {
		bom++;
	}else if(PV == 4) {
		regular++;
	}else if(PV == 5) {
		ruim++;
	}
	
   System.out.println(quantidade++);
		
		} while(PV != 6);
		
		
	    
		System.out.println("Excelente "+ (excelente)*100 / quantidade );
		System.out.println("Otimo "+ (otimo)*100 / quantidade);
		System.out.println("Bom "+ (bom)*100 / quantidade);
		System.out.println("Regular"+(regular)*100 / quantidade);
		System.out.println("Ruim"+(ruim)*100 / quantidade);*/
		
		Scanner arm = new Scanner(System.in);
		String nome;
		int cargo=0;
		 double DJJ = 0;
		 double DJP = 0;
		 double DJS = 0;
		 double ABD = 0;
		 double AJ = 0;
		 double AP = 0;
		 double AS = 0;
		 double AdS = 0;
		 double GP = 0;
		int sexo;
		 int Masc=0;
		 int Fem=0;
		int idade = 0;
		int QFaltas = 0;
		int QFilhos = 0;
		int associado;
		 int sim=0;
		 int não=0;
		int HTrabalhadas = 0;
		 int HE50 = 0;
		 int HE100 = 0;
		int PFaltas = 200;
		int VTransporte = 0;
		double SBruto = 0;
		double SLiquido = 0;
		int INSS = 0;
		int sair;
		int VPhora = 0;
		boolean Sair = false;
		
		/*nome = JOptionPane.showInputDialog("Insira seu nome: ");
		cargo = JOptionPane.showInputDialog("Insira seu cargo: \n1)DJJ \n2)DJP \n3)DJS \n4)ABD \n5)AJ \n6)AP \n7)AdS \n8)GP");
		HTrabalhadas = Integer.parseInt(JOptionPane.showInputDialog("Informe quantas horas você trabalha por dia: "));
		idade = Integer.parseInt(JOptionPane.showInputDialog("Insira sua idade: "));
		sexo = JOptionPane.showInputDialog("Qual seu sexo: ");
		QFaltas = Integer.parseInt(JOptionPane.showInputDialog("Quantas vezes você faltou no mês: "));
		QFilhos = Integer.parseInt(JOptionPane.showInputDialog("Quantos filhos você tem: "));
		associado = JOptionPane.showInputDialog("Você é associado");*/
		
		while (Sair == false)
		{
		System.out.println("Insira seu nome: ");
		nome=arm.nextLine();
		System.out.println("Insira seu cargo: \n1)DJJ \n2)DJP \n3)DJS \n4)ABD \n5)AJ \n6)AP \n7)AdS \n8)GP");
		cargo=arm.nextInt();
		
		if(cargo==1) {
			DJJ++;
		}else if(cargo == 2) {
			DJP++;
		}else if(cargo == 3) {
			DJS++;
		}else if(cargo == 4) {
			ABD++;
		}else if(cargo == 5) {
			AJ++;
		}else if(cargo == 6) {
			AP++;
		}else if(cargo == 7) {
			AdS++;
		}else if(cargo == 8) {
			GP++;
		
		
		}
		
		 while(cargo > 8);
		
		System.out.println("insira seu sexo: \n1)Masc \n2)Fem ");
		sexo=arm.nextInt();
				
		if(sexo == 1) {
			Masc++;
		}else if(sexo == 2) {
			Fem++;
		}
		
		while(sexo > 3);
		
		System.out.println("insira sua idade: ");
		idade=arm.nextInt();
		System.out.println("Quantas vezes você faltou? ");
		QFaltas=arm.nextInt();
		System.out.println("Quantos filhos você tem? ");
		QFilhos=arm.nextInt();
		System.out.println("Associado ao clube de fidelidades? \n1)Sim \n2)Não");
		associado=arm.nextInt();
		if(associado == 1) {
			sim++;
		}else if(associado == 2) {
			não++;
		}while (associado > 3);
		
		System.out.println("Quantas horas normais você trabalhou? ");
		HTrabalhadas=arm.nextInt();
		System.out.println("Quantas horas extras 50% você fez? ");
		HE50=arm.nextInt();
		System.out.println("Quantas horas extras 100% você fez? ");
		HE100=arm.nextInt();
		
		System.out.println("Quanto você recebe por hora? ");
		VPhora=arm.nextInt();
		
				SBruto = HTrabalhadas * VPhora;
				SBruto+= VPhora * HE50* 1.5;
				SBruto+= VPhora * HE100* 2.0;
		
		
		SLiquido = SBruto + PFaltas + QFilhos - VTransporte - INSS - associado;
		
		System.out.println("Deseja continuar? \n1)Sim \n2)Não");
	    int escolha = arm.nextInt();
	    	if(escolha == 2) {
	    		Sair = true;
	    }
	    
	}

		
		
		
		
		
		
		
	    
				
		
		
		
		
		
		
		
		
		
		
		
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    	
	    	
	    
	    	
	    	
	   
	    	
		
	
		
		
		
		
			
		
		
	
	
	
	
	
	
	
	}
}
		
		
		            
		
		
		
		
		
		
		
	

