package Exemplo06;

import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class Principal {

	public static void main(String[] args) {

		

		JFrame formulario = new JFrame();
		formulario.setSize(500, 300);
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formulario.setTitle("Meu primeiro Formulario");
		formulario.setLocationRelativeTo(null);
		formulario.setLayout(null);
		
		//checkbox
		JCheckBox ckb01 = new JCheckBox("opção01");
		ckb01.setBounds(10, 10, 100, 20);
		
		JCheckBox ckb02 = new JCheckBox("opção02");
		ckb02.setBounds(10, 40, 100, 20);
		
		JCheckBox ckb03 = new JCheckBox("opção03");
		ckb03.setBounds(10, 70, 100, 20);
		
		//adicionar elementos
		formulario.add(ckb01);
		formulario.add(ckb02);
		formulario.add(ckb03);
		
		
		
		
		formulario.setVisible(true);
	}

}
