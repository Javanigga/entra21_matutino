package Exercicios;

import javax.swing.JOptionPane;

public class Principal11 {

	public static void main(String[] args) {

		double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Nota 1"));
		double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Nota 2"));
		double nota3 = Double.parseDouble(JOptionPane.showInputDialog("Nota 3"));
		double nota4 = Double.parseDouble(JOptionPane.showInputDialog("Nota 4"));
		int falta = Integer.parseInt(JOptionPane.showInputDialog("Faltas"));
		Double media = (( nota1 + nota2 + nota3 + nota4 )/4);
		
	    if(falta>=15) {
		JOptionPane.showMessageDialog(null, "Reprovado");
	    }else if(media >=7) {
			JOptionPane.showMessageDialog(null, "Aprovado");
		}else if(media >5) {
			JOptionPane.showMessageDialog(null, "Em exame");
		}else if(media <5) {
			JOptionPane.showMessageDialog(null, "Reprovado");
		}
		
		
		
		
	}

}
