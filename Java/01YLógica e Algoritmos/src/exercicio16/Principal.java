package exercicio16;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		double p1 = 5, p2=4.5, p3=8, p4=12, troco;
		int pedido = Integer.parseInt(JOptionPane.showInputDialog("1-Hambuguer+suco de laranja                   "+p1+
																		"\n2-Sanduiche Natural+suco de uva       "+p2+
																		"\n3-Prato do dia                        "+p3+
																		"\n4-Pizza                               "+p4));
		
		double pre�o = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor que o cliente pagou"));
		
		switch(pedido) {
		case 1:
			troco = pre�o-p1;
			JOptionPane.showMessageDialog(null, "O seu pedido foi o Hamburguer com suco, no valor de R$"+p1+ "\nE seu troco � R$"+troco);
			break;
		case 2:
			troco = pre�o-p2;
			JOptionPane.showMessageDialog(null, "O seu pedido foi o Hamburguer com suco, no valor de R$"+p2+ "\nE seu troco � R$"+troco);
			break;
		case 3:
			troco = pre�o-p3;
			JOptionPane.showMessageDialog(null, "O seu pedido foi o Hamburguer com suco, no valor de R$"+p3+ "\nE seu troco � R$"+troco);
			break;
		case 4:
			troco = pre�o-p4;
			JOptionPane.showMessageDialog(null, "O seu pedido foi o Hamburguer com suco, no valor de R$"+p4+ "\nE seu troco � R$"+troco);
			break;
		
			
		
		
		}
		
		
		
			
		
	}

}
