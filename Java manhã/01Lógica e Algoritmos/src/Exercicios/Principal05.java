package Exercicios;

import javax.swing.JOptionPane;

public class Principal05 {

	public static void main(String[] args) {

		int dia = Integer.parseInt(JOptionPane.showInputDialog("Digite o dia do mês desejado"));
		
		if((dia <1) || (dia>28) ) {
			JOptionPane.showInputDialog("Invalido ");
		}if ((dia==3) || (dia==4) || (dia==10) || (dia==11) || (dia==17) || (dia==18) || (dia==24) || (dia==25)){
			JOptionPane.showMessageDialog(null, "Finais de semana");
			
			
		}else { 
			JOptionPane.showMessageDialog(null, "Dias de semana");}
		}
		
		{
		
		
		
		
	}

}
