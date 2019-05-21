package exercicio19;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int s = Integer.parseInt(JOptionPane.showInputDialog("informar a distancia"));
		int t = Integer.parseInt(JOptionPane.showInputDialog("informar o tempo tomado"));
		
		int vm = (s/t);
		
		JOptionPane.showMessageDialog(null, "A velocidade média "+vm+"m/s ou "+vm*3.6+"Km/h");
		
		
		
		
		
		
		
		
		
	}

}
