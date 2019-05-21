package Exemplo08;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Principal {

	public static void main(String[] args) {

		
		
		
		JFrame formulario = new JFrame();
		formulario.setSize(500, 300);
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formulario.setTitle("Meu primeiro Formulario");
		formulario.setLocationRelativeTo(null);
		formulario.setLayout(null);
		
		//textarea
		JTextArea campo = new JTextArea();
		
		
		//Scroll
		JScrollPane barra = new JScrollPane(campo);
		barra.setBounds(10, 10, 471, 230);
		
		
		//adicionar elementos ao formulario
		formulario.add(barra);
		
		formulario.setVisible(true);
	}

}
