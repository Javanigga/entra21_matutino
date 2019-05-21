package Exercicios;

import javax.swing.JOptionPane;

public class Principal14 {

	public static void main(String[] args) {

		double veiculo;
		
		veiculo = Double.parseDouble(JOptionPane.showInputDialog("Valor do veiculo"));
		if (veiculo >= 0 && veiculo <= 12000 ) {
			JOptionPane.showMessageDialog(null, "Terá 5% de de distribuidor, e isento de imposto"+veiculo*0.05);
			
		}else if (veiculo >= 12001 && veiculo <= 25000 ) {
			JOptionPane.showMessageDialog(null, "Terá 10% de distribuidor"+veiculo*0.10+"E importos de 15%"+veiculo * 0.15);
			
		}else if (veiculo >= 25001) {
			JOptionPane.showMessageDialog(null, "Terá 15% de distribuidor"+veiculo*0.15+ "E impostos de 20%"+veiculo*0.20 );
			
		}
		
		
		
		
		
		
		
	}

}
