package formulario;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import acao.Acao;
import beans.Beans;
import dados.Dados;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Formulario extends JFrame {

	private JPanel contentPane;
	private JTextField txtQtd;


	
	public Formulario() {
		Acao a = new Acao();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 541, 514);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnmaca = new JButton("Ma\u00E7a");
		
		btnmaca.setBounds(10, 76, 89, 82);
		contentPane.add(btnmaca);
		
		JButton btnlaranja = new JButton("Laranja");
		btnlaranja.setBounds(10, 210, 89, 82);
		contentPane.add(btnlaranja);
		
		JButton btnmorango = new JButton("Morango");
		btnmorango.setBounds(10, 339, 89, 82);
		contentPane.add(btnmorango);
		
		JButton btnbanana = new JButton("Banana");
		btnbanana.setBounds(130, 76, 89, 82);
		contentPane.add(btnbanana);
		
		JButton btnabacaxi = new JButton("Abacaxi");
		btnabacaxi.setBounds(130, 210, 89, 82);
		contentPane.add(btnabacaxi);
		
		JButton btnmelancia = new JButton("Melancia");
		btnmelancia.setBounds(130, 339, 89, 82);
		contentPane.add(btnmelancia);
		
		JButton btnpera = new JButton("Pera");
		btnpera.setBounds(251, 76, 89, 82);
		contentPane.add(btnpera);
		
		JButton btnacerola = new JButton("Acerola");
		btnacerola.setBounds(251, 210, 89, 82);
		contentPane.add(btnacerola);
		
		JButton btnmelao = new JButton("Melao");
		btnmelao.setBounds(251, 339, 89, 82);
		contentPane.add(btnmelao);
		
		JButton btnQuantidade = new JButton("Quantidade");
		btnQuantidade.setBounds(323, 11, 89, 23);
		contentPane.add(btnQuantidade);
		
		txtQtd = new JTextField();
		txtQtd.setBounds(419, 12, 96, 20);
		contentPane.add(txtQtd);
		txtQtd.setColumns(10);
		
		JButton btnNewButton_9 = new JButton("+");
		btnNewButton_9.addActionListener(new ActionListener() {
			
		public void actionPerformed(ActionEvent e) {
			 	Beans q = new Beans();
			 		
			 	}
		});
		btnNewButton_9.setBounds(10, 157, 43, 23);
		contentPane.add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton("-");
		btnNewButton_10.setBounds(56, 157, 43, 23);
		contentPane.add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("+");
		btnNewButton_11.setBounds(10, 293, 43, 23);
		contentPane.add(btnNewButton_11);
		
		JButton btnNewButton_12 = new JButton("-");
		btnNewButton_12.setBounds(56, 293, 43, 23);
		contentPane.add(btnNewButton_12);
		
		JButton btnNewButton_13 = new JButton("-");
		btnNewButton_13.setBounds(56, 418, 43, 23);
		contentPane.add(btnNewButton_13);
		
		JButton btnNewButton_14 = new JButton("+");
		btnNewButton_14.setBounds(10, 418, 43, 23);
		contentPane.add(btnNewButton_14);
		
		JButton btnNewButton_15 = new JButton("+");
		btnNewButton_15.setBounds(130, 157, 43, 23);
		contentPane.add(btnNewButton_15);
		
		JButton btnNewButton_16 = new JButton("-");
		btnNewButton_16.setBounds(176, 157, 43, 23);
		contentPane.add(btnNewButton_16);
		
		JButton btnNewButton = new JButton("+");
		btnNewButton.setBounds(251, 157, 43, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("-");
		btnNewButton_1.setBounds(297, 157, 43, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("+");
		btnNewButton_2.setBounds(130, 293, 43, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("-");
		btnNewButton_3.setBounds(176, 293, 43, 23);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("+");
		btnNewButton_4.setBounds(130, 418, 43, 23);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("-");
		btnNewButton_5.setBounds(176, 418, 43, 23);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("+");
		btnNewButton_6.setBounds(251, 293, 43, 23);
		contentPane.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("-");
		btnNewButton_7.setBounds(297, 293, 43, 23);
		contentPane.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("+");
		btnNewButton_8.setBounds(251, 418, 43, 23);
		contentPane.add(btnNewButton_8);
		
		JButton btnNewButton_17 = new JButton("-");
		btnNewButton_17.setBounds(297, 418, 43, 23);
		contentPane.add(btnNewButton_17);
	}

}
