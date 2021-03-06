package formulario;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import beans.Nome;
import dados.Dados;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Formulario extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtIdade;
	private JTextField txtAltura;
	private JTextField txtPeso;
	private JTextField txtIMC;
	private JTable table;

	
	public Formulario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 551, 581);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCadastro = new JLabel("Cadastro ");
		lblCadastro.setBounds(234, 11, 92, 39);
		lblCadastro.setFont(new Font("Tahoma", Font.BOLD, 17));
		contentPane.add(lblCadastro);
		
		txtNome = new JTextField();
		txtNome.setBounds(72, 58, 254, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		txtIdade = new JTextField();
		txtIdade.setBounds(72, 89, 254, 20);
		contentPane.add(txtIdade);
		txtIdade.setColumns(10);
		
		txtAltura = new JTextField();
		txtAltura.setBounds(72, 120, 254, 20);
		contentPane.add(txtAltura);
		txtAltura.setColumns(10);
		
		txtPeso = new JTextField();
		txtPeso.setBounds(72, 151, 254, 20);
		contentPane.add(txtPeso);
		txtPeso.setColumns(10);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(14, 61, 48, 14);
		contentPane.add(lblNome);
		
		JLabel lblIdade = new JLabel("Idade");
		lblIdade.setBounds(14, 92, 48, 14);
		contentPane.add(lblIdade);
		
		JLabel lblAltura = new JLabel("Altura");
		lblAltura.setBounds(14, 123, 48, 14);
		contentPane.add(lblAltura);
		
		JLabel lblPeso = new JLabel("Peso");
		lblPeso.setBounds(14, 154, 48, 14);
		contentPane.add(lblPeso);
		
		txtIMC = new JTextField();
		txtIMC.setBounds(72, 182, 254, 20);
		contentPane.add(txtIMC);
		txtIMC.setColumns(10);
		
		JLabel lblImc = new JLabel("IMC");
		lblImc.setBounds(14, 185, 48, 14);
		contentPane.add(lblImc);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Objeto
				boolean duplicada = false;
				Nome c = new Nome();
				c.setNome(txtNome.getText());
				c.setIdade(Integer.parseInt(txtIdade.getText()));
				c.setAltura(Double.parseDouble(txtAltura.getText()));
				c.setPeso(Double.parseDouble(txtPeso.getText()));
				c.setIMC(Double.parseDouble(txtIMC.getText()));
				
				String duplicada1 = txtNome.getText();
				for(int i = 0; i < Dados.arrayNome.size();i++) {
					if(duplicada1.equals(Dados.arrayNome.get(i).getNome()))
							JOptionPane.showMessageDialog(null, "Jogos duplicados");
					duplicada = true;
				}
			}if(duplicada1 == false) {
				a.cadastrar(c);
			}
			
				
				//Cadastrar IMC
			    double imc = c.getPeso() / Math.pow(c.getAltura(), 2);
			
		});
		btnCadastrar.setBounds(10, 226, 89, 23);
		contentPane.add(btnCadastrar);
		
		JButton btnNewButton = new JButton("Alterar");
		btnNewButton.setBounds(109, 226, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Excluir");
		btnNewButton_1.setBounds(208, 226, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnSelecionar = new JButton("Selecionar");
		btnSelecionar.setBounds(307, 226, 89, 23);
		contentPane.add(btnSelecionar);
		
		JButton btnEstatisticas = new JButton("Estatisticas");
		btnEstatisticas.setBounds(406, 226, 89, 23);
		contentPane.add(btnEstatisticas);
		
		table = new JTable();
		table.setBounds(10, 276, 515, 255);
		contentPane.add(table);
	}
}
