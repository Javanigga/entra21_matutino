package Exemplo04;

import javax.swing.JOptionPane;


public class Principal {

	public static void main(String[] args) {

		
		/*JOptionPane.showMessageDialog(null, "Bom dia! ");
		JOptionPane.showMessageDialog(null, "Tudo ok? ", "Titulo", JOptionPane.QUESTION_MESSAGE);
		JOptionPane.showMessageDialog(null, "Informa��o ", "Titulo", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, "Perigo ", "Titulo", JOptionPane.WARNING_MESSAGE);
		JOptionPane.showMessageDialog(null, "Falha ", "Titulo", JOptionPane.ERROR_MESSAGE);*/
		

		
		//Armazenar valores
		String nome = JOptionPane.showInputDialog("Informe seu nome");
		
	int idade = Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade"));
	double altura = Double.parseDouble(JOptionPane.showInputDialog("Informe sua altura"));
	
	
	String mensagem = "nome: "+nome;
		   mensagem+= "\nIdade: "+idade;
		   mensagem+= "\nAltura: "+altura;
		   
		   JOptionPane.showMessageDialog(null, mensagem);
		
		/*Caixa de confirma��o
		
		int resposta = JOptionPane.showConfirmDialog(null, "Gostando de Java? ");
		
		switch (resposta) {
		case 0:
			JOptionPane.showMessageDialog(null, "Que bom! ");
			break;

		case 1:
			JOptionPane.showMessageDialog(null, "Que pena");
			break;
			
		case 2:
			JOptionPane.showMessageDialog(null, "Voc� cancelou");
			break;
			
			
		default:
			JOptionPane.showMessageDialog(null, "Voc� saiu");
			
		}
		 */  
		   
		//Caixa de confirma��o 2
		//int resposta = JOptionPane.showConfirmDialog(null, "Hoje � ter�a?", "titulo",JOptionPane.OK_CANCEL_OPTION);
		
		//Comparando Stringa
		/*String nome1 = JOptionPane.showInputDialog("Informe o primeiro nome");
		String nome2 = JOptionPane.showInputDialog("Informe o segundo nome");
		System.out.println(nome1.equals(nome2)); */
		
		
		   
	}

}
