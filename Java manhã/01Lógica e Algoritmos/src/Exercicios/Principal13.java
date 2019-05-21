package Exercicios;

import javax.swing.JOptionPane;

public class Principal13 {

	public static void main(String[] args) {

		int valor;
		
		valor = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
		
		JOptionPane.showMessageDialog(null, "O antecessor desse numero é: "+(valor-1));
		JOptionPane.showMessageDialog(null, "O sucessor desse numero é: "+ (valor+1));
		
		
		
		
		
		
	}

}
