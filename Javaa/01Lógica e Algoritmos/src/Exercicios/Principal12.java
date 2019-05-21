package Exercicios;

import javax.swing.JOptionPane;

public class Principal12 {

	public static void main(String[] args) {

		double vp = 60;
		double vc;
		
		vc = Double.parseDouble(JOptionPane.showInputDialog("Velociade do carro: "));
		
	   
		if (vc < vp){
		   JOptionPane.showMessageDialog(null, "Bom motorista");
		}else if (vc >= vp + 1 && vc <= vp +10) {
			JOptionPane.showMessageDialog(null, "Multa de 50R$");
			
		}else if (vc >= vp +  11 && vc <= vp +30  ) {
		    JOptionPane.showMessageDialog(null, "Multa de 100R$");
		}else if (vc >= vp + 30 ) {
			JOptionPane.showMessageDialog(null, "Multa de 200R$");
		}
		    		
		   
		
		
		
	 
		
		
		
	}

}
