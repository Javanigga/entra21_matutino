package Exercicios;

import javax.swing.JOptionPane;

public class Principal06 {

	public static void main(String[] args) {

		
		 double x;
		 double y;
		 
		x = Double.parseDouble(JOptionPane.showInputDialog("Digite um numero:" ));
		y = Double.parseDouble(JOptionPane.showInputDialog("Digite outro numero:"));
		 if (x == y){ 
		 System.out.println(x + y);
		 } else {
		  System.out.println(x * y);
		  
 		 }
		 
		
		
	}

}
