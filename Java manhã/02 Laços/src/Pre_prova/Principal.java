package Pre_prova;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double desconto, VT=0.06, hora_extra, salario_liqui, homem=0, mulher=0, porcen_homem, porcen_mulher;
		int filhos_d = 50, s_faltas = 200, salario,
			maior_idade, hora_extrabonus, horas, 
			cargo, DJJ = 0, DJP =0, DJS = 0, ABD = 0, AJ = 0, AP =0, AS = 0, ArqSof = 0, GerenProj = 0,	
			faltas, filhos, clube, clube_extra=110;
		String sexo, continuar, nome, nome_rico;
		int salarios, salario_hora;
		int funcionarios=0;
		double maior_salarioliqui = 0;
		String Mnome = "";
		double idade, velho=0, adulto=0, jovem=0, novo=0;
		double porcen_velho, porcen_adulto, porcen_jovem, porcen_novo;
		double porcen_DJJ, porcen_DJP, porcen_DJS, porcen_ABD, porcen_AJ, porcen_AP, porcen_AS, porcen_ArqSof, porcen_GerenProj;
		int p_clube=0;
		do {
			nome = JOptionPane.showInputDialog("Qual seu nome?").toLowerCase();
			cargo = Integer.parseInt(JOptionPane.showInputDialog("Qual seu cargo?(informe o numero)"+
																"\n\n1- Desenvolvedor java jr"+
																"\n2- Desenvolvedor java pleno"+
																"\n3- Desenvolvedor java sênior"+
																"\n4- Administrador banco de dados"+
																"\n5- Analista jr"+
																"\n6- Analista pleno"+
																"\n7- Analista sênior"+
																"\n8- Arquiteto de software"+
																"\n9- Gerente de projetos"));
			salario_hora = Integer.parseInt(JOptionPane.showInputDialog("Quanto voce ganha por hora?"));
			horas = Integer.parseInt(JOptionPane.showInputDialog("Quantas horas você trabalhou?"));
			hora_extra = Integer.parseInt(JOptionPane.showInputDialog("Quantas horas extras você trabalhou?"));
			hora_extrabonus = Integer.parseInt(JOptionPane.showInputDialog("Quantas horas extras especiais você trabalhou(domingo/feriado)?"));
			sexo = JOptionPane.showInputDialog("Qual seu sexo?(homem/mulher)").toLowerCase();
			idade = Integer.parseInt(JOptionPane.showInputDialog("Quantos anos você tem?"));
			faltas = Integer.parseInt(JOptionPane.showInputDialog("Quantas vezes você faltou?"));
			filhos = Integer.parseInt(JOptionPane.showInputDialog("Quantos filhos você tem?"));
			clube = Integer.parseInt(JOptionPane.showInputDialog("Você é associado ao clube?"+
																 "\n1- Sim"+
																 "\n2- não"));
		switch(cargo) {case 1:
			DJJ++;	
				break;case 2:
			DJP++;	
				break;case 3:
			DJS++;	
				break;case 4:
			ABD++;	
				break;case 5:
			AJ++;	
				break;case 6:
			AP++;	
				break;case 7:
			AS++;	
				break;case 8:
			ArqSof++;	
				break;case 9:
			GerenProj++;	
				break;	
}
		
		if(sexo.equals("homem")) {
			homem++;
		}else if(sexo.equals("mulher")) {
			mulher++;
		}else {
			JOptionPane.showMessageDialog(null, "Informe homem ou mulher");
		}
														
			
			
			if((faltas == 0) && (clube == 1)) {
				salario_liqui = (salario_hora*horas)+((salario_hora*1.5)*hora_extra)+((salario_hora*2)*hora_extrabonus)+(filhos*50)+s_faltas+clube_extra;
			}else if((faltas == 0)) {
				salario_liqui = (salario_hora*horas)+((salario_hora*1.5)*hora_extra)+((salario_hora*2)*hora_extrabonus)+(filhos*50)+s_faltas;
			}else if(clube == 1) {
			salario_liqui = (salario_hora*horas)+((salario_hora*1.5)*hora_extra)+((salario_hora*2)*hora_extrabonus)+(filhos*50)+clube_extra;
			}else {
				salario_liqui = (salario_hora*horas)+((salario_hora*1.5)*hora_extra)+((salario_hora*2)*hora_extrabonus)+(filhos*50);
			}
			continuar = JOptionPane.showInputDialog("Se você deseja cadastrar mais uma pessoa, digite continuar").toLowerCase();
		}while(continuar.equals("continuar"));
		
		
		if(salario_liqui > maior_salarioliqui) {
			maior_salarioliqui=salario_liqui;
			Mnome = nome;
		}
		
		funcionarios = DJJ+DJP+DJS+ABD+AJ+AP+AS+ArqSof+GerenProj;
		porcen_homem=(homem/funcionarios)*100;
		porcen_mulher=(mulher/funcionarios)*100;
		
		if(idade > 50) {
			velho++;
		}else if((idade>=41) && (idade <= 50)) {
			adulto++;
		}else if((idade>=27) && (idade <= 40)) {
			jovem++;
		}else if((idade>=18) && (idade <= 26)) {
			novo++;
		}
		if(clube == 1){
			p_clube++;
		}
		porcen_velho= (velho/funcionarios)*100;
		porcen_adulto= (adulto/funcionarios)*100;
		porcen_jovem= (jovem/funcionarios)*100;
		porcen_novo= (novo/funcionarios)*100;
		
		porcen_DJJ=(DJJ/funcionarios)*100;
		porcen_DJP=(DJJ/funcionarios)*100;
		porcen_DJS=(DJJ/funcionarios)*100;
		porcen_ABD=(DJJ/funcionarios)*100;
		porcen_AJ=(DJJ/funcionarios)*100;
		porcen_AP=(DJJ/funcionarios)*100;
		porcen_AS=(DJJ/funcionarios)*100;
		porcen_ArqSof=(DJJ/funcionarios)*100;
		porcen_GerenProj=(DJJ/funcionarios)*100;
		
		JOptionPane.showMessageDialog(null, "O numero de funcionarios na empresa é "+funcionarios);
		JOptionPane.showMessageDialog(null, "Dados sexo:"+
											"\nHomens "+porcen_homem+"%"+
											"\nMulheres "+porcen_mulher+"%");
		JOptionPane.showMessageDialog(null, "Dados idade:"+
											"\nMais velho que 50 "+porcen_velho+"%"+
											"\nEntre 41 e 50 "+porcen_adulto+"%"+
											"\nEntre 27 e 40 "+porcen_jovem+"%"+
											"\nEntre 18 e 26 "+porcen_novo+"%");
		JOptionPane.showMessageDialog(null, "Dados funcionarios:"+
											"\nTotal funcionarios: "+funcionarios+
											"\nDesenvolvedor Java Jr "+porcen_DJJ+
											"\nDesenvolvedor Java Jr "+porcen_DJP+
											"\nDesenvolvedor Java Jr "+porcen_DJS+
											"\nDesenvolvedor Java Jr "+porcen_ABD+
											"\nDesenvolvedor Java Jr "+porcen_AJ+
											"\nDesenvolvedor Java Jr "+porcen_AP+
											"\nDesenvolvedor Java Jr "+porcen_AS+
											"\nDesenvolvedor Java Jr "+porcen_ArqSof+
											"\nDesenvolvedor Java Jr "+porcen_GerenProj);
		JOptionPane.showMessageDialog(null, "A pessoa que possui o maior salario é "+Mnome+ "no valor de R$"+maior_salarioliqui);
		JOptionPane.showMessageDialog(null, "O número de pessoas que fazem parte do clube é de "+p_clube);
		
		
		
		
		
		/*
		if(salario liquido > maior salario liqudi){
		maior salario liquido = salario liquido;
		Maiorsalarionome = nome;
		}
		*/
		
		
		
}
}

