package exercicio11;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Informe sua primeira nota"));
		double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Informe sua sergunda nota"));
		double nota3 = Double.parseDouble(JOptionPane.showInputDialog("Informe sua terceira nota"));
		double nota4 = Double.parseDouble(JOptionPane.showInputDialog("Informe sua quarta nota"));
		
		int faltas = Integer.parseInt(JOptionPane.showInputDialog("Informe o número de faltas"));
		
		double nota_final = (nota1+nota2+nota3+nota4)/4;
		
		if(faltas >= 15) {
			JOptionPane.showMessageDialog(null, "Você foi reprovado por falta "+faltas+ " e sua média final foi "+nota_final);
		}else if(nota_final == 10) {
			JOptionPane.showMessageDialog(null, "Parabéns, sua média geral foi 10 "+nota_final);
		}else if(nota_final >= 9) {
			JOptionPane.showMessageDialog(null, "Sua nota foi ótima, continue assim "+nota_final);
		}else if(nota_final >=7) {
			JOptionPane.showMessageDialog(null, "Sua nota foi boa "+nota_final);
		}else if(nota_final >= 5.1) {
			JOptionPane.showMessageDialog(null, "Você esta em exame com média "+nota_final);
		}else {
			JOptionPane.showMessageDialog(null, "Você infelizmente foi reprovado, e sua média final foi "+nota_final);
		}
		
		
		
		
		
	}

}
