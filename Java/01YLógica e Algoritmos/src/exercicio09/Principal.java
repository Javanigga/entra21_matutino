package exercicio09;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		double n1 = Double.parseDouble(JOptionPane.showInputDialog("Escolha um numero "));
		double n2 = Double.parseDouble(JOptionPane.showInputDialog("Escolha mais um numero "));
		double n3 = Double.parseDouble(JOptionPane.showInputDialog("E o ultimo "));
		
		if((n1<n2)&&(n1<n3)) {
			JOptionPane.showMessageDialog(null, "O menor n�mero � "+n1);
		}else if ((n2<n1)&&(n2<n3)) {
			JOptionPane.showMessageDialog(null, "O menor n�mero � "+n2);
		}else if((n3<n2)&&(n3<n1)) {
			JOptionPane.showMessageDialog(null, "O menor n�mero � "+n3);
		}
		
		
		
		
		
		
		
			
		
		
		
	}

}
