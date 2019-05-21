import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JTable;

public class form01 extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome1;
	private JTextField txtCPF1;
	private JTextField txtNome;
	private JTextField txtCPF;
	private JTextField txtBuscar;
	private JTable tableCarrinho;

	public form01() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 562, 489);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtNome1 = new JTextField();
		txtNome1.setBounds(440, 11, 96, 20);
		contentPane.add(txtNome1);
		txtNome1.setColumns(10);
		
		txtCPF1 = new JTextField();
		txtCPF1.setBounds(440, 42, 96, 20);
		contentPane.add(txtCPF1);
		txtCPF1.setColumns(10);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setBounds(440, 73, 89, 23);
		contentPane.add(btnLogin);
		
		txtNome = new JTextField();
		txtNome.setBounds(334, 11, 96, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		txtCPF = new JTextField();
		txtCPF.setBounds(334, 42, 96, 20);
		contentPane.add(txtCPF);
		txtCPF.setColumns(10);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setBounds(334, 73, 89, 23);
		contentPane.add(btnCadastrar);
		
		txtBuscar = new JTextField();
		txtBuscar.setBounds(0, 59, 251, 20);
		contentPane.add(txtBuscar);
		txtBuscar.setColumns(10);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(251, 58, 73, 23);
		contentPane.add(btnBuscar);
		
		JLabel lblLojaGaspar = new JLabel("Loja Gaspar");
		lblLojaGaspar.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblLojaGaspar.setBounds(137, 14, 114, 34);
		contentPane.add(lblLojaGaspar);
		
		JComboBox Celulares = new JComboBox();
		Celulares.setBounds(10, 107, 147, 34);
		contentPane.add(Celulares);
		
		JComboBox EleltroEletronicos = new JComboBox();
		EleltroEletronicos.setBounds(167, 107, 147, 34);
		contentPane.add(EleltroEletronicos);
		
		JComboBox Moveis = new JComboBox();
		Moveis.setBounds(324, 107, 147, 34);
		contentPane.add(Moveis);
		
		tableCarrinho = new JTable();
		tableCarrinho.setBounds(10, 303, 526, 136);
		contentPane.add(tableCarrinho);
	}
}
