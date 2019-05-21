package Trabalho;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Trabalho01 extends JFrame  {

	public static void main(String[] args) {
 


		JFrame formulario = new JFrame();
		formulario.setSize(500, 500);
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formulario.setTitle("Posto de Saude");
		formulario.setLocationRelativeTo(null);




		JButton login = new JButton("Entrar ");
		login.setBounds(10, 10, 150, 30);

		JButton cadastrar = new JButton("Cadastrar ");
		cadastrar.setBounds(190, 10, 150, 30);



		JPanel painel01 = new JPanel();
		painel01.setBounds(40, 10, 350, 150);
		painel01.setBackground(Color.RED);
		painel01.setVisible(true);

		JPanel painel02 = new JPanel();
		painel02.setBounds(10, 50, 300, 150);
		painel02.setBackground(Color.BLUE);
		painel02.setVisible(false);
		
		
		
		
		JTextField Nome = new JTextField("                      ");
		Nome.setSize(100, 100);
		painel01.add(Nome);
		
		JTextField Cpf = new JTextField("                       ");
		Cpf.setSize(50,50);
		painel01.add(Cpf);
		
		 
		
		
		login.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
		
				painel01.setVisible(true);
				painel02.setVisible(false);
				
				JOptionPane.showMessageDialog(null, "Ola" + Nome);
				
			
			}
		});
		
		cadastrar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				painel01.setVisible(false);
				painel02.setVisible(true);
				
				
			
				
			}
		});
		
		
		
		/*JRadioButton rbt01 = new JRadioButton("Psiquiatra ");
		rbt01.setBounds(20, 1, 10, 20);
		rbt01.setActionCommand("Dr. Pedro");
		JRadioButton rbt02 = new JRadioButton("Psicóloga ");
		rbt02.setBounds(30, 1, 20, 30);
		rbt02.setActionCommand("Dr. Marcia");
		JRadioButton rbt03 = new JRadioButton("Clinico Geral ");
		rbt03.setBounds(40, 1, 30, 40);
		rbt03.setActionCommand("Dr. Jorge");
		
		//agrupar botoes de radio
		ButtonGroup bg = new ButtonGroup();
		bg.add(rbt01);
		bg.add(rbt02);
		bg.add(rbt03);
		
		//Botao
		JButton btn = new JButton("Selecionar");
			cadastrar.setBounds(50, 50, 50, 50);
			
			cadastrar.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					
					
					JOptionPane.showMessageDialog(null, bg.getSelection().getActionCommand());
					
					
				}
			});*/
				
				
				
	
		



		formulario.add(login);
		formulario.add(cadastrar);
		/*formulario.add(rbt01);
		formulario.add(rbt02);
		formulario.add(rbt03);*/
		formulario.add(painel01);
		formulario.add(painel02);
	
		//formulario.add(rotulo);
		//formulario.add(campo);
		

		formulario.setVisible(true);




		
		
		
		
		
	}

}
