package Exemplo05;

import javax.swing.JOptionPane;

public class Principl05 {

	public static void main(String[] args) {

		//variavel de validação
		boolean valida = false;
		
		
		//Obter a idade
		do {
			try {
		             int idade = Integer.parseInt(JOptionPane.showInputDialog("informe uma idade"));
		valida = true;
			}catch (Exception erro) {
			JOptionPane.showMessageDialog(null, "favor informar um numero inteiro");
			}
			}while(valida == false);
		
		
		
		
	}

}
