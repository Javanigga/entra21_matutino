package exercicio17;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double num1 = Double.parseDouble(JOptionPane.showInputDialog("Numero base"));
		double num2 = Double.parseDouble(JOptionPane.showInputDialog("Numero divisor"));
		
		double quociente = (num1/num2);
		
		JOptionPane.showMessageDialog(null, "A conta é "+num1+" divido por "+num2+" e o Quocinte é "+quociente);
		
		
		
		
		
		
		
	}

}
