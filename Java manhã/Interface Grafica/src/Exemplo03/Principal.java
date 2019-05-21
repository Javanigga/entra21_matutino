package Exemplo03;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Principal {

	public static void main(String[] args) {

		JFrame formulario = new JFrame();
		formulario.setSize(500, 300);
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formulario.setTitle("Meu primeiro Formulario");
		formulario.setLocationRelativeTo(null);
		formulario.setLayout(null);

		//Rotulo
		JLabel rotulo = new JLabel();
		rotulo.setText("Informe seu nome");
		rotulo.setBounds(10, 30, 130, 30);
		
		//Campo de texto
		JTextField campo = new JTextField();
		campo.setBounds(150, 30, 100, 30);
		
	//Botão
		JButton botao = new JButton();
		botao.setText("enviar");
		botao.setSize(200, 20);
		
		//evento no botao
		botao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				//armazenar o nome informado
				String nome = campo.getText();
				
				//Mensagem
				JOptionPane.showMessageDialog(null, "ola " + nome);
				
				//limpar o campo nome
				campo.setText("");
				
				//cursor no campo nome
				campo.requestFocus();
				
			}
		});
		
		//adicionar o botao no formulario
		formulario.add(botao);
		formulario.add(rotulo);
		formulario.add(campo);
		
		formulario.setVisible(true);
	}

}
