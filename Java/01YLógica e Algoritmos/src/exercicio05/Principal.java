package exercicio05;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int data = Integer.parseInt(JOptionPane.showInputDialog("Informe o dia do m�s "));
		
		if((data == 3)||(data == 4)||(data == 10)||(data == 11)||(data == 17)||(data == 18)||(data == 24)||(data == 25)) {
			JOptionPane.showMessageDialog(null, "Fim de semana");
		} else if((data >= 1) && (data <= 28)) {
			JOptionPane.showMessageDialog(null, "Dia de semana");
		}else {
			JOptionPane.showMessageDialog(null, "Dia n�o existente");
		}
		
		
		
	}
	

}
