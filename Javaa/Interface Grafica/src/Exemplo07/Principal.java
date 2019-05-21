package Exemplo07;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class Principal {

	public static void main(String[] args) {
		
		JFrame formulario = new JFrame();
		formulario.setSize(500, 300);
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formulario.setTitle("Meu primeiro Formulario");
		formulario.setLocationRelativeTo(null);
		formulario.setLayout(null);
		
		//radio botao
		JRadioButton rbt01 = new JRadioButton("opção 01 ");
		rbt01.setBounds(10, 10, 100, 20);
		rbt01.setActionCommand("Primeira opção");
		JRadioButton rbt02 = new JRadioButton("opção 02 ");
		rbt02.setBounds(10, 40, 100, 20);
		rbt02.setActionCommand("Segunda opção");
		JRadioButton rbt03 = new JRadioButton("opção 03 ");
		rbt03.setBounds(10, 70, 100, 20);
		rbt03.setActionCommand("terceira opção");
		
		//agrupar botoes de radio
		ButtonGroup bg = new ButtonGroup();
		bg.add(rbt01);
		bg.add(rbt02);
		bg.add(rbt03);
		
		//Botao
		JButton btn = new JButton("testar");
			btn.setBounds(10, 100, 100, 20);
			
			btn.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					
					//getSelection: obtem o radio button selecionado
					//getActioncomand: Retorna um valor do radio Button
					JOptionPane.showMessageDialog(null, bg.getSelection().getActionCommand());
					
					
				}
			});
		
		formulario.add(btn);
		formulario.add(rbt01);
		formulario.add(rbt02);
		formulario.add(rbt03);
		formulario.setVisible(true);
		

	}

}
