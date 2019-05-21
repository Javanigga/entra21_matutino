package Exercicios;

import javax.swing.JOptionPane;

public class Principal09 {

	public static void main(String[] args) {

		
	   int v = (10000);
		
	   int x =Integer.parseInt(JOptionPane.showInputDialog("Primeiro numero: "));
	   int y =Integer.parseInt(JOptionPane.showInputDialog("Segundo numero: "));
	   int z =Integer.parseInt(JOptionPane.showInputDialog("Terceiro numero: "));
	   
	   System.out.println("mostrar primeiro valor");
	   if (x < v) {
		   v=x;
	   } if(y < v) {
		   v=y;
	   } if(z < v) {
		   z=v;
		  
	   }
	   JOptionPane.showMessageDialog(null, "O menor numero sera: "+v);
	   
	     
	     
	     
	     
	   
	   
		   
	  
		
		
		
	}

}
