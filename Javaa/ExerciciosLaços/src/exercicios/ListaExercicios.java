package exercicios;
import java.util.Scanner;

public class ListaExercicios {

	public static void main(String[] args) {

		
		/*Exercicio 1
		System.out.println("1)");
		
		Scanner textos = new Scanner(System.in);
		Scanner numeros = new Scanner(System.in);
		
		
		String nome;
		int idade;
		String sexo;
		String cargo;
		int pessoas = 0;
		
		int masc = 0;
		int fem = 0;
		int deMenor=0;
		int deMaior=0;
		int gerente=0;
		int atendente=0;
		int açougueiro=0;
		int secretaria=0;
		int almoxarife=0;
		int padeiro=0;
		int estagiario=0;
		
		System.out.println("Digite 1 para começar e -1 para finalizar o programa");
		pessoas = numeros.nextInt();
		while (pessoas != -1) {
			System.out.print("Insira o seu nome:");
			nome = textos.nextLine();
			
			System.out.print("Insira a sua idade:");
			idade = numeros.nextInt();
			
			System.out.print("Insira o seu sexo (M ou F):");
			sexo = textos.nextLine();
			
			System.out.print("Insira o seu cargo:");
			cargo = textos.nextLine();
			
			if (idade >= 18) {
				deMaior++;
			}
			if (idade <= 17) {
				deMenor++;
			}
			if (sexo.contains("F")||sexo.contains("f")) {
				fem++;
			}
			if (sexo.contains("M")||sexo.contains("m")) {
				masc++;
			}
			if (cargo.contains("Gerente")|| cargo.contains("gerente")) {
				gerente++;
			}if (cargo.contains("Atendente")|| cargo.contains("atendente")) {
				atendente++;
			}if (cargo.contains("Açougueiro")|| cargo.contains("açougueiro")) {
				açougueiro++;
			}if (cargo.contains("Secretaria")|| cargo.contains("secretaria")) {
				secretaria++;
			}if (cargo.contains("Almoxarife")|| cargo.contains("almoxarife")) {
				almoxarife++;
			}if (cargo.contains("Padeiro")|| cargo.contains("padeiro")) {
				padeiro++;
			}if (cargo.contains("Estagiario")|| cargo.contains("estagiario")) {
				estagiario++;
			}
			
			
			System.out.println("Continuar execução? (-1 para parar)");
			pessoas = numeros.nextInt();
		}
		
		System.out.println("Número de Homens:" + masc);
		System.out.println("Número de Mulheres:" + fem);
		System.out.println("Número de Gerentes:" + gerente);
		System.out.println("Número de Atendentes:" + atendente);
		System.out.println("Número de Açougueiros:" + açougueiro);
		System.out.println("Número de Secretárias:" + secretaria);
		System.out.println("Número de Almoxarifes:" + almoxarife);
		System.out.println("Número de Padeiros:" + padeiro);
		System.out.println("Número de Estagiários:" + estagiario);
		System.out.println("Números de pessoas que são maior de idade:" + deMaior);
		System.out.println("Números de pessoas que são menor de idade:" + deMenor);*/
		
		/*Exercicio 2
		System.out.println("");
		System.out.println("2)");
		
		Scanner textosE02 = new Scanner(System.in);
		Scanner numerosE02 = new Scanner(System.in);
		
		String nome;
		String nomeAlto = "";
		String nomeVelho = "";
		String nomePesado = "";
		boolean saida = false;
		
		int idade = 0;
		int maiorIdade = 0;
		int altura = 0;
		int maiorAltura = 0;
		double peso = 0;
		double maiorPeso = 0;
		double mediaAltura = 0;
		double totalAltura = 0;
		int cadastrados = 0;
			
		System.out.println("Digite SAIR para finalizar a execução");
		System.out.print("Insira o seu nome:");
		nome = textosE02.nextLine();
		
		while (saida != true) {
			System.out.print("Insira a sua idade:");
			idade = numerosE02.nextInt();
			
			System.out.print("Insira a sua altura (em cms):");
			altura = numerosE02.nextInt();
			totalAltura += altura;
			
			System.out.print("Insira o seu peso:");
			peso = numerosE02.nextDouble();
			
			if (altura > maiorAltura) {
				maiorAltura = altura;
				nomeAlto = nome;
			}
			if (idade > maiorIdade) {
				maiorIdade = idade;
				nomeVelho = nome;
			}
			if (peso > maiorPeso) {
				maiorPeso = peso;
				nomePesado = nome;
			}
			cadastrados++;
			System.out.println("Digite SAIR para finalizar");
			System.out.print("Insira o seu nome:");
			nome = textosE02.nextLine();
			if (nome.contains("SAIR")|| nome.contains("sair") ||nome.contains("Sair")) {
				saida = true;
			}
		}
		
		System.out.println("Jogadores cadastrados: " + cadastrados);
		System.out.println("Jogador mais alto: " + nomeAlto + ", " + maiorAltura + "cms");
		System.out.println("Jogador mais velho: " + nomeVelho + ", " + maiorIdade + " anos");
		System.out.println("Jogador mais pesado: " + nomePesado + ", " + maiorPeso + "kg");
		System.out.println("Média de altura dos jogadores: " + (mediaAltura = totalAltura/cadastrados));*/
		
		
		
		/*Exercicio 3
		System.out.println("");
		System.out.println("3)");
		Scanner numerosE03 = new Scanner(System.in);
		
		
		int hamb = 5;
		double sandUva = 4.5;
		int doDia = 8;
		int pizza = 12;
		double lasanha = 16.5;
		int pdq = 1;
		double bolo = 2.5;
		
		int codigo = 0;
		int qnt = 0;
		double valorTotal = 0;
		double troco = 0;
		double pagamento = 0;
		
		System.out.println("");
		System.out.println("1)Hambúrger + suco de laranja \n2)Sanduíche natural + suco de uva \n3)Prato do dia \n4)Pizza \n5)Lasanha \n6)Pão de queijo \n7)Bolo");
		System.out.print("Insira o número do pedido:");
		codigo = numerosE03.nextInt();
		
		while (codigo != -1) {
			System.out.print("Insira a quantidade:");
			qnt = numerosE03.nextInt();
			
			if (codigo == 1) {
				valorTotal += hamb*qnt;
			}
			
			if (codigo == 2) {
				valorTotal += sandUva*qnt;
			}
			if (codigo == 3) {
				valorTotal += doDia*qnt;
			}
			if (codigo == 4) {
				valorTotal += pizza*qnt;
			}
			if (codigo == 5) {
				valorTotal += lasanha*qnt;
			}
			if (codigo == 6) {
				valorTotal += pdq*qnt;
			}
			if (codigo == 7) {
				valorTotal += bolo*qnt;
			}
			
			
			
			System.out.println("");
			System.out.println("1)Hambúrger + suco de laranja \n2)Sanduíche natural + suco de uva \n3)Prato do dia \n4)Pizza \n5)Lasanha \n6)Pão de queijo \n7)Bolo");
			System.out.print("Insira o número do pedido:");
			codigo = numerosE03.nextInt();
		}
		
		System.out.println("O valor total do pedido é de: R$" +valorTotal);
		
		while (pagamento < valorTotal) {
			System.out.print("Insira o valor dado pelo cliente:");
			pagamento = numerosE03.nextDouble();
		}
		
		System.out.println("O troco será de " + (troco = pagamento - valorTotal));*/
		
		
		/*Exercicio 4
		System.out.println("");
		System.out.println("4)");
		Scanner numerosE04 = new Scanner(System.in);
		
		int crianças =0;
		int adolescentes = 0;
		int adultos = 0;
		int idade = 0;
		int pessoas = 0;
		
		int exce=0;
		int otimo=0;
		int bom=0;
		int regular=0;
		int ruim=0;
		int voto=0;
		int saida = 0;
		
		while (saida != 1) {
			System.out.println("1)Ruim 2)Regular 3)Bom 4)Ótimo 5)Excelente");
			System.out.print("Insira o seu voto");
			voto = numerosE04.nextInt();
			
			System.out.print("Insira a sua idade:");
			idade = numerosE04.nextInt();
			
			if (idade <0 || idade >100) {
				System.out.println("Idade invalida, insira um valor entre 0 e 100");
				voto = voto-voto;
			}
			
			if (idade >=0 && idade <=9) {
				crianças++;
			}
			if (idade >=10 && idade <=17) {
				adolescentes++;
			}
			if (idade >17 && idade <=100) {
				adultos++;
			}
			
			if(voto == 1) {
				ruim++;
			}
			if(voto == 2) {
				regular++;
			}
			if(voto == 3) {
				bom++;
			}
			if(voto == 4) {
				otimo++;
			}
			if(voto == 5) {
				exce++;
			}
			pessoas++;
			System.out.print("Insira 0 para continuar e 1 para parar:");
			saida = numerosE04.nextInt();
			
		}
		
		System.out.println("Excelente:" + (exce*100)/pessoas + "%");
		System.out.println("Ótimo:" + (otimo*100)/pessoas + "%");
		System.out.println("Bom:" + (bom*100)/pessoas + "%");
		System.out.println("Regular:" + (regular*100)/pessoas + "%");
		System.out.println("Ruim:" + (ruim*100)/pessoas + "%");
		
		System.out.println("Crianças:" + crianças);
		System.out.println("Adolescentes:" + adolescentes);
		System.out.println("Adultos:" + adultos);*/
		
		/*Excercicio 5
		System.out.println("");
		System.out.println("5)");
		Scanner numerosE5 = new Scanner(System.in);
		
		
		
		double lapis = 2;
		double caneta =3;
		double borracha = 1.5;
		double desc = 0.95;
		int cnt = 1;
		int produto = 0;
		
		
		System.out.println("1)Lápis 2)Caneta 3)Borracha");
		System.out.print("Insira o produto:");
		produto = numerosE5.nextInt();
		
		while (cnt <= 10) {
			if (produto == 1) {
				lapis= lapis*desc;
				System.out.printf("%d X %.2f = %.2f\n",cnt,lapis,lapis*cnt);
				desc= desc - 0.05;
				lapis=2;
			}
			
			if (produto == 2) {
				caneta = caneta*desc;
				System.out.printf("%d X %.2f = %.2f\n",cnt,caneta,caneta*cnt);
				desc=desc - 0.05;
				caneta = 3;
			}
			
			if (produto == 3) {
				borracha = borracha*desc;
				System.out.printf("%d X %.2f = %.2f\n",cnt,borracha,borracha*cnt);
				desc = desc-0.05;
				borracha = 1.5;
			}
			
			cnt++;
		}*/
		
		
		/*Exercicio 6
		System.out.println("");
		System.out.println("6)");
		Scanner textosE6 = new Scanner(System.in);		
		Scanner numerosE6 = new Scanner(System.in);
				
		String nome = "";
		int sexo = 0;
		double n1 = 0;
		double n2 = 0;
		double n3 = 0;
		double n4 = 0;
		double media = 0;
		int fem = 0;
		int masc = 0;
		int parab = 0;
		int otimo = 0;
		int bom = 0;
		int satisf = 0;
		int rec = 0;
		int rep = 0;
		boolean sair = true;
		int pessoas = 0;
		
		
		System.out.print("Insira o nome do(a) aluno(a):");
		nome = textosE6.nextLine();
		
		while (sair == true) {
			
			System.out.print("Insira o sexo (1=F 2=M):");
			sexo = numerosE6.nextInt();
			
			System.out.print("Insira a primeira nota:");
			n1 = numerosE6.nextDouble();
			
			System.out.print("Insira a segunda nota:");
			n2 = numerosE6.nextDouble();
			
			System.out.print("Insira a terceira nota:");
			n3 = numerosE6.nextDouble();
			
			System.out.print("Insira a quarta nota:");
			n4 = numerosE6.nextDouble();
			
			media = (n1+n2+n3+n4)/4;
			
			if (sexo == 1) {
				fem++;
			}
			if (sexo == 2) {
				masc++;
			}
			if (media == 10) {
				parab++;
			}
			if (media >=9 && media <=9.9) {
				otimo++;
			}
			if (media >=8 && media <=8.9) {
				bom++;
			}
			if (media >=7 && media <=7.9) {
				satisf++;
			}
			if (media >=5 && media <=6.9) {
				rec++;
			}
			if (media <= 4.9) {
				rep++;
			}
			pessoas++;
			
			System.out.println("");
			System.out.print("Insira o nome do(a) aluno(a):");
			nome = textosE6.nextLine();
			if (nome.contains("sair") || nome.contains("SAIR") || nome.contains("sair")) {
				sair = false;
				
			}
		}
				
		System.out.println("Homens: " + (masc*100)/pessoas + "%" );
		System.out.println("Mulheres: " + (fem*100)/pessoas + "%");
		
		System.out.println("Quantidade de alunos que tiraram 10: " + (parab*100)/pessoas + "%");
		System.out.println("Quantidade de alunos que tiraram entre 9 e 9.9: " + (otimo*100)/pessoas + "%");
		System.out.println("Quantidade de alunos que tiraram 8 e 8.9: " + (bom*100)/pessoas + "%");
		System.out.println("Quantidade de alunos que tiraram 7 e 7.9: " + (satisf*100)/pessoas + "%");
		System.out.println("Quantidade de alunos que tiraram 5 e 6.9: " + (rec*100)/pessoas + "%");
		System.out.println("Quantidade de alunos que tiraram abaixo de 5: " + (rep*100)/pessoas + "%");*/
		
		/*Exercicio 7
		System.out.println("");
		System.out.println("7)");
		Scanner textosE7 = new Scanner(System.in);
		
		boolean fim = false;
		String l1 ="";
		String l2 ="";
		String l3 ="";
		String l4 ="";
		String l5 ="";
		String l6 ="";
		String l7 ="";
		String digito ="";
		int c1 = 0;
		int c2 = 0;
		int c3 = 0;
		int c4 = 0;
		int c5 = 0;
		int c6 = 0;
		int c7 = 0;
		int ok = 0;
		
		while (fim == false) {
			System.out.print("Insira uma letra:");
			digito = textosE7.nextLine();
			
			if (digito.contains("e") || digito.contains("E") ) {
				l1 = digito;
				c1++;
				System.out.println("Letra correta!");
			}
			if (digito.contains("s") || digito.contains("S") ) {
				l2 = digito;
				c2++;
				System.out.println("Letra correta!");
			}
			if (digito.contains("t") || digito.contains("T") ) {
				l3 = digito;
				c3++;
				System.out.println("Letra correta!");
			}
			if (digito.contains("u") || digito.contains("U") ) {
				l4 = digito;
				c4++;
				System.out.println("Letra correta!");
			}
			if (digito.contains("d") || digito.contains("D") ) {
				l5 = digito;
				c5++;
				System.out.println("Letra correta!");
			}
			if (digito.contains("a") || digito.contains("A") ) {
				l6 = digito;
				c6++;
				System.out.println("Letra correta!");
			}
			if (digito.contains("r") || digito.contains("R") ) {
				l7 = digito;
				c7++;
				System.out.println("Letra correta!");
			}
			if(digito.contains("e") || digito.contains("s") || digito.contains("t")||digito.contains("u")||digito.contains("d")||digito.contains("a")||digito.contains("r")||digito.contains("E") || digito.contains("S") || digito.contains("T")||digito.contains("U")||digito.contains("D")||digito.contains("A")||digito.contains("R")) {
				ok++;
			}
			else {
				System.out.println("Letra incorreta");
			}
			if (c1==1 && c2==1 && c3==1 && c4==1 && c5==1 && c6==1 && c7==1 ) {
				fim = true;
			}
		}
		
		System.out.println("Fim de jogo! A palavra é ESTUDAR!");*/
		
		/*Exercicio 8 
		System.out.println("");
		System.out.println("8)");
		
		Scanner numerosE8 = new Scanner(System.in);
		
		int numero = 0;
		int contador = 0;
		int total = 0;
		
		
		
		System.out.print("Insira um numero:");
		numero = numerosE8.nextInt();
		contador = numero - 1;
		
		while (contador>0) {
			total = numero*contador;
			System.out.println(numero + " X " + contador + " = " + total);
			numero=total;
			contador--;
		}*/
		
		/*Exercicio 9
		System.out.println("");
		System.out.println("9)");
		
		Scanner numerosE9 = new Scanner(System.in);
		
		int n1 = 0;
		int n2 = 0;
		int pos = 0;
		int neg = 0;
		int imp = 0;
		int par = 0;
		
		System.out.print("Insira o primeiro número:");
		n1 = numerosE9.nextInt();
		System.out.print("Insira o segundo número:");
		n2 = numerosE9.nextInt();
		
		if (n1 < n2) {
			while (n1 <= n2) {
				System.out.println(n1);
				if (n1>0) {
					pos++;
				}
				if (n1<0) {
					neg++;
				}
				if (n1 % 2 == 0) {
					par++;
				}
				
				if (n1 % 2 !=0) {
					imp++;
				}
				n1++;
			}
		}
		else if (n1>n2) {
			while (n1 >= n2) {
				System.out.println(n1);
				if (n1>0) {
					pos++;
				}
				if (n1<0) {
					neg++;
				}
				n1--;
			}
		}
		
		System.out.println("");
		System.out.println("Numeros positivos: " + pos);
		System.out.println("Numeros negativos: " + neg);
		System.out.println("Numeros Pares: " + par);
		System.out.println("Numeros Impares: " + imp);*/
		
		
		/*Exercicio 10
		Scanner numerosE10 = new Scanner(System.in);
		
		double investimento = 0;
		double total = 0;
		double ganho = 0;
		int mes = 0;
		double juros = 0.0037;
		int cntE10 = 1;
		double invTot = 0;
		
		System.out.print("Insira a quantidade de mêses: ");
		mes = numerosE10.nextInt();
		
		System.out.print("Insira o valor a ser investido: ");
		investimento = numerosE10.nextDouble();
		
		invTot = investimento;
		
		while (cntE10 <= mes) {
				ganho +=(invTot*juros);
				System.out.printf(cntE10 + "º mês   Ganho: %.2f  Total: %.2f\n" , (invTot*juros), (invTot =(invTot + (invTot * juros))));
				cntE10++;
		}
		System.out.printf("Ganho total: %.2f ", ganho);*/
		
		
		//Exercicio 11 (Prova)
		Scanner textosE11 = new Scanner(System.in);
		Scanner numerosE11 = new Scanner(System.in);
		
		
		double sLiq = 0;
		double sBruto = 0;
		double maiorSLiq = 0;
		String mNome = "";
		
		double devJavJun = 0;
		int numJavJun = 0;
		
		double devJavPleno = 0;
		int numJavPleno = 0;
		
		double devJavSen = 0;
		int numJavSen = 0;
		
		double admBD = 0;
		int numAdmBd =0;
		
		double anaJun = 0;
		int numAnaJun = 0;
		
		double anaPleno = 0;
		int numAnaPleno =0;
		
		double anaSen = 0;
		int numAnaSen =0;
		
		double arqSoft = 0;
		int numArqSoft = 0;
		
		double gerenteProj = 0;
		int numGerProj = 0;
		
				
		String nome = "";
		
		int qFilhos = 0;
		int filhos =0;
		int idade = 0;
		int totCad = 0;
		int dezVseis =0;
		int vSeteQuar =0;
		int qUmCinq =0;
		int maiorCinq =0;
		int faltas =0;
		int sexo = 0;
		int fem = 0;
		int masc = 0;
		int clubFid = 0;
		int cargo = 0;
		int horas = 0;
		int hExtraN = 0;
		int hExtraFDS = 0;
		double vt = 0;
		double inss = 0;
		
		boolean sair = false;
		
		while (sair == false) {
			System.out.print("Insira o nome do colaborador: ");
			nome = textosE11.nextLine();
			if (nome.contains("sair")) {
				sair = true;
			}
			System.out.println("1)Homem | 2)Mulher");
			System.out.print("Insira o sexo do colaborador");
			sexo = numerosE11.nextInt();
			if (sexo == 1) {
				masc++;
			}
			if (sexo ==2) {
				fem++;
			}
			System.out.print("Insira a idade do colaborador:");
			idade = numerosE11.nextInt();
			if (idade >=18 && idade <=26) {
				dezVseis++;
			}
			if (idade >=27 && idade<=40) {
				vSeteQuar++;
			}
			if (idade >=41 && idade <=50) {
				qUmCinq++;
			}
			if (idade >50) {
				maiorCinq++;
			}
			System.out.println("1)Dev. Java Júnior | 2)Dev. Java Pleno | 3)Dev. Java Sênior");
			System.out.println("4)Adm. Banco de Dados | 5)Analista Júnior | 6)Analista Pleno");
			System.out.println("7)Analista Sênior | 8)Arquiteto de Software | 9)Gerente de Projetos");
			System.out.print("Insira o cargo:");
			cargo = numerosE11.nextInt();
			
			if (cargo == 1) {
				System.out.print("Insira o valor recebido por hora:");
				devJavJun = numerosE11.nextDouble();
				System.out.print("Insira as horas trabalhadas:");
				horas = numerosE11.nextInt();
				
				sBruto = devJavJun * horas;
				
				System.out.print("Insira as horas extras normais trabalhadas:");
				horas = numerosE11.nextInt();
				
				sBruto += devJavJun * horas * 1.5;
				
				System.out.print("Insira as horas extras especiais trabalhadas:");
				horas = numerosE11.nextInt();
				
				sBruto += devJavJun * horas * 2;
				
				System.out.println(sBruto);
				
				if (sBruto <= 2000) {
					inss = sBruto*0.05;
				}
				if (sBruto >=2001 && sBruto<=3500) {
					inss = sBruto*0.07;
				}
				if (sBruto >=3501 && sBruto<=5600) {
					inss = sBruto*0.08;
				}
				if (sBruto >=5600) {
					inss = sBruto*0.1;
				}
				System.out.println(inss);
				vt = sBruto*0.06;
				System.out.println(vt);
				
				System.out.print("Insira a quantidade de filhos do colaborador:");
				qFilhos = numerosE11.nextInt();
				if(qFilhos>0) {
					filhos = qFilhos*50;
				}
				System.out.println("1)Sim | 2)Não");
				System.out.print("O colaborador participa do clube fidelidade?");
				clubFid = numerosE11.nextInt();
				if (clubFid == 1) {
					sBruto = sBruto -110;
				}
				System.out.println(sBruto);
				
				System.out.print("Insira a quantidade de faltas do colaborador:");
				faltas = numerosE11.nextInt();
				if(faltas == 0){
					faltas = 200;
				}
				
				sLiq = sBruto + faltas + filhos - vt - inss;
				System.out.println(sLiq);
				
				if(sLiq >maiorSLiq) {
					maiorSLiq = sLiq;
					mNome = nome;
					
				totCad++;
				numJavJun++;
				}
				
			}//primeiro if
			
			
			System.out.println("insira sair para sair");
			
			if (nome.contains("sair")) {
				sair = true;
			}
			
		}
		
		
		
		
		
		
		
	}//main

}
