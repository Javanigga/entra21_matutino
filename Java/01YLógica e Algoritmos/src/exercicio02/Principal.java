package exercicio02;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double valor = Double.parseDouble(JOptionPane.showInputDialog("valor"));
		
		System.out.println("Voc� obteve um desconto de 10%, valor a pagar "+(valor*0.9));
		
		
		
	}

}
