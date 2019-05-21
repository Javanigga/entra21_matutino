package exercicio15;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int hotel = Integer.parseInt(JOptionPane.showInputDialog("informe o seu hotel: 1-apto simples, 2-apto duplo e 3-suíte luxo"));
		int dias = Integer.parseInt(JOptionPane.showInputDialog("Informe o número de dias que irá ficar no hotel"));
		
		switch(hotel) {
		case 1:
			JOptionPane.showMessageDialog(null, "O valor total será de R$"+dias*45);
			break;
		case 2:
			JOptionPane.showMessageDialog(null, "O valor total será de R$"+dias*65);
			break;
		case 3:
			JOptionPane.showMessageDialog(null, "O valor total será de R$"+dias*110);
			break;
		default:
			JOptionPane.showMessageDialog(null, "Opção inexistente");
		}
		
		
	
		
		
		
		
		
		
	}

}
