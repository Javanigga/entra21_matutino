package exercicio03;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Nota 1"));
		double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Nota 2"));
		double nota3 = Double.parseDouble(JOptionPane.showInputDialog("Nota 3"));
		double nota4 = Double.parseDouble(JOptionPane.showInputDialog("Nota 4"));
		double media = (nota1 + nota2 +nota3 +nota4)/4;
		
		if(media >= 7) {
			JOptionPane.showMessageDialog(null, "Aprovado");
		}else if(media >= 5) {
			JOptionPane.showMessageDialog(null, "Em Exame");
		}else {
			JOptionPane.showMessageDialog(null, "Reprovado");
		}
		
		
		
		
		
		
	}

}
