package exercicio14;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double preço = Double.parseDouble(JOptionPane.showInputDialog("Informe o preço do veiculo"));
		
		if(preço<=12000){ 
			JOptionPane.showMessageDialog(null, "O carro teve 5% do valor repassado para a distribuidora, sendo ele R$"+(preço*0.05)+" e é isento de imposto");
		}else if(preço<=25000) {
			JOptionPane.showMessageDialog(null, "O carro teve 10% do valor repassado para a distribuidora, sendo ele R$"+(preço*0.10)+" e tem 15% de imposto, no valor de R$"+(preço*0.15));
		}else {
			JOptionPane.showMessageDialog(null, "O carro teve 15% do valor repassado para a distribuidora, sendo ele R$"+(preço*0.15)+" e tem 20% de imposto, no valor de R$"+(preço*0.2));
		}
		
		
		
		
		
		
	}

}
