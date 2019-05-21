package Exercicios;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		 String nome = JOptionPane.showInputDialog( "Informe seu nome:");
		 int idade = Integer.parseInt(JOptionPane.showInputDialog ("Informe sua idade:"));
		 String cidade = JOptionPane.showInputDialog("Informe sua cidade");
		 
		
		        
		 
		 JOptionPane.showConfirmDialog(null, "Olá" +nome+ "você tem" +idade+ "anos de idade e você mora em" +cidade);
		 
		 
		
	
		
		
		
		
	}

}
