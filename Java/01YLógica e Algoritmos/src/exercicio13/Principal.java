package exercicio13;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = Integer.parseInt(JOptionPane.showInputDialog("Informe um número"));
		int ante = (num-1);
		int suce = (num+1);
		
		JOptionPane.showMessageDialog(null, "Antecessor: "+ante+
											"\nNumero base: "+num+
											"\nSucessor: "+suce);
		
		
		
		
	}

}
