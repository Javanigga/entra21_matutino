package exercicio01;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nome = JOptionPane.showInputDialog("Informe seu nome");
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade"));
		String cidade =JOptionPane.showInputDialog("Informe a cidade onde mora");
		
		String mensagem = "Ol� " +nome;
				mensagem+= ", voc� tem " +idade;
				mensagem+= " de idade e mora em " +cidade;
				
		JOptionPane.showMessageDialog(null, mensagem);		
		
		
	}

}
