package exercicio14;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double pre�o = Double.parseDouble(JOptionPane.showInputDialog("Informe o pre�o do veiculo"));
		
		if(pre�o<=12000){ 
			JOptionPane.showMessageDialog(null, "O carro teve 5% do valor repassado para a distribuidora, sendo ele R$"+(pre�o*0.05)+" e � isento de imposto");
		}else if(pre�o<=25000) {
			JOptionPane.showMessageDialog(null, "O carro teve 10% do valor repassado para a distribuidora, sendo ele R$"+(pre�o*0.10)+" e tem 15% de imposto, no valor de R$"+(pre�o*0.15));
		}else {
			JOptionPane.showMessageDialog(null, "O carro teve 15% do valor repassado para a distribuidora, sendo ele R$"+(pre�o*0.15)+" e tem 20% de imposto, no valor de R$"+(pre�o*0.2));
		}
		
		
		
		
		
		
	}

}
