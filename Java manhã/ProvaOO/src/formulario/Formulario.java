package formulario;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import acao.Acao;
import dados.Dados;
import beans.Cadastro;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTable;

public class Formulario extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField textField_1;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTable table;

	
	public Formulario() {
		
		Acao a = new Acao();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 563, 487);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblColaborador = new JLabel("Colaborador");
		lblColaborador.setBounds(10, 14, 68, 14);
		contentPane.add(lblColaborador);
		
		txtNome = new JTextField();
		txtNome.setBounds(88, 11, 162, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Salario Bruto");
		lblNewLabel.setBounds(10, 45, 68, 14);
		contentPane.add(lblNewLabel);
		
		textField_1 = new JTextField();
		textField_1.setBounds(88, 42, 162, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		
		JLabel lblCargo = new JLabel("Cargo");
		lblCargo.setBounds(286, 14, 48, 14);
		contentPane.add(lblCargo);
		
		JComboBox ccargo = new JComboBox();
		ccargo.setBounds(329, 10, 208, 18);
		ccargo.addItem("Estagiario");
		ccargo.addItem("Desenvolvedor jr.");
		ccargo.addItem("Desenvolvedor Pleno");
		ccargo.addItem("Desenvolvedor senior");
		ccargo.addItem("Analista de Sistemas jr.");
		ccargo.addItem("Analista de Sistemas Pleno");
		ccargo.addItem("Analista de sistemas Senior");
		ccargo.addItem("Arquiteto de Software");
		contentPane.add(ccargo);
		
				
		JCheckBox chckbxNewCheckBox = new JCheckBox("Clube fidelidade");
		chckbxNewCheckBox.setBounds(286, 42, 120, 23);
		contentPane.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Plano de saude");
		chckbxNewCheckBox_1.setBounds(408, 41, 115, 23);
		contentPane.add(chckbxNewCheckBox_1);
		
		JLabel lblValeTransporte = new JLabel("Vale Transporte");
		lblValeTransporte.setBounds(20, 76, 78, 14);
		contentPane.add(lblValeTransporte);
		
		JCheckBox checkBox = new JCheckBox("");
		checkBox.setBounds(98, 74, 21, 23);
		contentPane.add(checkBox);
		
		textField_3 = new JTextField();
		textField_3.setBounds(125, 73, 133, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblImpostoDeRenda = new JLabel("Imposto de Renda");
		lblImpostoDeRenda.setBounds(286, 83, 99, 14);
		contentPane.add(lblImpostoDeRenda);
		
		textField_4 = new JTextField();
		textField_4.setBounds(391, 80, 146, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblSAlarioLiquido = new JLabel("Salario Liquido");
		lblSAlarioLiquido.setBounds(286, 114, 83, 14);
		contentPane.add(lblSAlarioLiquido);
		
		textField_5 = new JTextField();
		textField_5.setBounds(387, 111, 150, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblFaltasNoMes = new JLabel("Faltas no Mes ");
		lblFaltasNoMes.setBounds(10, 114, 78, 14);
		contentPane.add(lblFaltasNoMes);
		
		JComboBox FaltasM = new JComboBox();
		FaltasM.setBounds(88, 110, 42, 22);
		contentPane.add(FaltasM);
		FaltasM.addItem("1");
		FaltasM.addItem("2");
		FaltasM.addItem("3");
		FaltasM.addItem("4");
		FaltasM.addItem("5");
		FaltasM.addItem("6");
		
		JButton btnCadastrarColaborador = new JButton("Cadastrar Colaborador");
		btnCadastrarColaborador.setBounds(10, 163, 155, 43);
		contentPane.add(btnCadastrarColaborador);
		btnCadastrarColaborador.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Dados c = new Dados();
				
				c.set
			}
		});
		
		JButton btnEstatisticas = new JButton("Estatisticas");
		btnEstatisticas.setBounds(202, 163, 167, 43);
		contentPane.add(btnEstatisticas);
		
		table = new JTable();
		table.setBounds(10, 219, 527, 218);
		contentPane.add(table);
		
		
	}
}
