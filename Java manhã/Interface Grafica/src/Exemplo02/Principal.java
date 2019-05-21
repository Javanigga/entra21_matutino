package Exemplo02;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		
		
		
		JFrame formulario = new JFrame();
		formulario.setSize(500, 300);
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formulario.setVisible(true);
		formulario.setTitle("Meu primeiro Formulario");
		formulario.setLocationRelativeTo(null);
		formulario.setLayout(null);
		
	
	//Botão
		JButton botao = new JButton();
		botao.setText("enviar");
		botao.setSize(100, 20);
		
		//evento no botao
		botao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				JOptionPane.showMessageDialog(null, "ola mundo");
				
			}
		});
		
		//adicionar o botao no formulario
		formulario.add(botao);
		
	
	
	
	}

}
