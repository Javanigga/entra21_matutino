package Exercicios;

import javax.swing.JOptionPane;

public class Principal10 {

	public static void main(String[] args) {

	double Total;
	double umcent = 0.01;
	double cincocent = 0.05;
	double dezcent = 0.10;
	double vcincocent = 0.25;
	double cinquentcent = 0.50;
	double umreal = 1.00;
	int quantidade;
	
	quantidade = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade de um centavo"));
	Total = umcent * quantidade;
	
	quantidade = Integer.parseInt(JOptionPane.showInputDialog("insira a quantidade de moedas de cinco centavos"));
	Total += cincocent * quantidade;
	
	quantidade = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade de moedas de dez centavos "));
	Total += dezcent * quantidade;
	
	quantidade = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade de moedas de vinte e cinco centavos"));
	Total += vcincocent * quantidade;
	
	quantidade = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade de cinquanta centavos"));
	Total += cinquentcent * quantidade;
	
	quantidade = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade de moedas de um real"));
	Total += umreal * quantidade;
	
	JOptionPane.showMessageDialog(null, "Total de moedas foi"+Total);
	
	
		
		
	}

}
