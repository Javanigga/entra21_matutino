package Exercicios;

import javax.swing.JOptionPane;

public class Principal04 {

	public static void main(String[] args) {

		String produto = JOptionPane.showInputDialog("Qual é o produto?");
		int valor = Integer.parseInt(JOptionPane.showInputDialog("Qual o valor do produto?"));
		int pagamento = JOptionPane.showConfirmDialog(null , "Pagamento a vista?");
		
		if ((valor > 500) && (pagamento == 0))  {
			JOptionPane.showMessageDialog(null, "O produto" +produto+ " Tera 10% de desconto"+(valor * 0.9));
		
			
		} else { 
           JOptionPane.showMessageDialog(null, "Valor do produto R$"+(valor));
		}
			
			
		
		

		
		
		
		
	}

}
