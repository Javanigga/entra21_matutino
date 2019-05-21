package exercicio12;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int v_max = Integer.parseInt(JOptionPane.showInputDialog("Informe a velocidade máxima permitida na ciclovia "));
		int v_vei = Integer.parseInt(JOptionPane.showInputDialog("Informe a velocidade que o veiculo estava na ciclovia "));
		
		if(v_vei >= v_max+31) {
			JOptionPane.showMessageDialog(null, "Você ultrapassou a velocidade permitida em " +(v_vei-v_max)+ " , a multa é de R$200");
		}else if(v_vei >= v_max+30) {
			JOptionPane.showMessageDialog(null, "Você ultrapassou a velocidade permitida em " +(v_vei-v_max)+ " , a multa é de R$100");
		}else if (v_vei >= v_max+10) {
			JOptionPane.showMessageDialog(null, "Você ultrapassou a velocidade permitida em " +(v_vei-v_max)+ " , a multa é de R$50");
		}else {
			JOptionPane.showMessageDialog(null, "Você esta digiringo dentro da lei, muito bem");
		}
		
		
		
		
		
		
	}

}
