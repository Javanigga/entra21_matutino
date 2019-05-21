package exercicio06;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double valor_somado;
		double valor_multiplicado;
		
		double valor1 = Double.parseDouble(JOptionPane.showInputDialog("Insira o primeiro valor"));
		double valor2 = Double.parseDouble(JOptionPane.showInputDialog("Insira o segundo valor"));
		
		if(valor1 == valor2) {
			valor_somado=(valor1+valor2);
			JOptionPane.showMessageDialog(null, "O valor é somado é " +valor1+ " + " +valor2+ " e o valor final é "+valor_somado);
		}else {
			valor_multiplicado=(valor1*valor2);
			JOptionPane.showMessageDialog(null, "O valor multiplicado é " +valor1+ " x " +valor2+  " e o valor final é "+valor_multiplicado);
		}
		
		
		
		
	}

}
