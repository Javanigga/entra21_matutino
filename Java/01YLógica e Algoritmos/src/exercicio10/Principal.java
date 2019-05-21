package exercicio10;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int m001 = Integer.parseInt(JOptionPane.showInputDialog("Informe quantas moedas de 0,01 centavos voce tem "));
		int m005 = Integer.parseInt(JOptionPane.showInputDialog("Informe quantas moedas de 0,05 centavos voce tem "));
		int m010 = Integer.parseInt(JOptionPane.showInputDialog("Informe quantas moedas de 0,10 centavos voce tem "));
		int m025 = Integer.parseInt(JOptionPane.showInputDialog("Informe quantas moedas de 0,25 centavos voce tem "));
		int m050 = Integer.parseInt(JOptionPane.showInputDialog("Informe quantas moedas de 0,50 centavos voce tem "));
		int m100 = Integer.parseInt(JOptionPane.showInputDialog("Informe quantas moedas de 1,00 centavos voce tem "));
		
		double valor_total = (0.01*m001)+(0.05*m005)+(0.10*m010)+(0.25*m025)+(0.50*m050)+(1*m100);     
		JOptionPane.showMessageDialog(null, "O valor total é R$"+valor_total);
		
		
	}

}
