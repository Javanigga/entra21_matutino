package exemplo05;

import javax.swing.JOptionPane;


public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try {
			int idade = Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade"));
		} catch(Exception erro) {
			JOptionPane.showInputDialog(null, "Falha ao obter a idade: "+erro.getMessage());
			} finally {
				JOptionPane.showMessageDialog(null, "Finalizando o exemplo");
			}
	}

}
