package formulario;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import beans.ADM;
import dados.Dados;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class Administrador extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtSenha;
	private JTextField txtNome1;
	private JTextField txtSenha1;

	
	 
	public Administrador() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnAdministrador = new JButton("Administrador");
		btnAdministrador.setBounds(10, 34, 164, 47);
		contentPane.add(btnAdministrador);
		btnAdministrador.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				ADM j = new ADM();
				j.setNome(txtNome.getText());
				j.setSenha(txtSenha.getText());
				
				
				
				
				
			}
		});
		
		JButton btnCliente = new JButton("Cliente");
		btnCliente.setBounds(217, 34, 164, 47);
		contentPane.add(btnCliente);
		btnCliente.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ADM j = new ADM();
				j.setNome1(txtNome1.getText());
				j.setSenha1(txtSenha1.getText());
				
				
			}
		});
		
		txtNome = new JTextField();
		txtNome.setBounds(10, 104, 164, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		txtSenha = new JTextField();
		txtSenha.setBounds(10, 152, 164, 20);
		contentPane.add(txtSenha);
		txtSenha.setColumns(10);
		
		txtNome1 = new JTextField();
		txtNome1.setBounds(217, 104, 164, 20);
		contentPane.add(txtNome1);
		txtNome1.setColumns(10);
		
		txtSenha1 = new JTextField();
		txtSenha1.setBounds(217, 152, 164, 20);
		contentPane.add(txtSenha1);
		txtSenha1.setColumns(10);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(10, 92, 48, 14);
		contentPane.add(lblNome);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setBounds(10, 141, 48, 14);
		contentPane.add(lblSenha);
		
		JLabel lblNome1 = new JLabel("Nome");
		lblNome1.setBounds(217, 92, 48, 14);
		contentPane.add(lblNome1);
		
		JLabel lblSenha1 = new JLabel("Senha");
		lblSenha1.setBounds(217, 141, 48, 14);
		contentPane.add(lblSenha1);
	}
}


