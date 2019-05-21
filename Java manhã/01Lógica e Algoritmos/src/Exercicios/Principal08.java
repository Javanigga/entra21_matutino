package Exercicios;

import javax.swing.JOptionPane;

public class Principal08 {

	public static void main(String[] args) {

		int resultado = Integer.parseInt(JOptionPane.showInputDialog("Insira o calculo: 1.soma , 2.subtração , 3.multiplicação , 4.divisão" ));
		    
		switch (resultado) {
		
		case 1:
			int x = Integer.parseInt(JOptionPane.showInputDialog("Insira o primeiro numero"));
			int y = Integer.parseInt(JOptionPane.showInputDialog("Insira o segundo numero"));
			JOptionPane.showMessageDialog(null, "Resultado: "+(x+y));
			break;
			
		case 2:
			x = Integer.parseInt(JOptionPane.showInputDialog("Insira o primeiro numero"));
			y = Integer.parseInt(JOptionPane.showInputDialog("Insira o segundo numero"));
			JOptionPane.showMessageDialog(null, "Resultado: "+(x-y));
			break;
			
		case 3: 	
			x = Integer.parseInt(JOptionPane.showInputDialog("Insira o primeiro numero"));
			y = Integer.parseInt(JOptionPane.showInputDialog("Insira o segundo numero"));
			JOptionPane.showMessageDialog(null, "Resultado: "+(x*y));
			break;
		
		case 4:
			x = Integer.parseInt(JOptionPane.showInputDialog("Insira o primeiro numero"));
			y = Integer.parseInt(JOptionPane.showInputDialog("Insira o segundo numero"));
			JOptionPane.showMessageDialog(null, "Resultado: "+(x/y));
			break;
		
		} 
		
		
		
		
		
		
		
	}

}
