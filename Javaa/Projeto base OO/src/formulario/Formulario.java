package formulario;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import acao.Acao;
import beans.Curso;

import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Formulario extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtArea;
	private JTable table;
	private static int Ccurso;
	

	
	/**
	 * Create the frame.
	 */
	public Formulario() {
		
		//Objeto da classe acao
		Acao a = new Acao();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 686);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnCancelar = new JButton("Cancelar");
		JButton btnExcluir = new JButton("Excluir");
		JButton btnCadastrar = new JButton("Cadastrar");
		JButton btnAlterar = new JButton("Alterar");
		btnAlterar.setEnabled(false);
		btnAlterar.setBounds(21, 182, 89, 23);
		btnAlterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//instanciar um objeto da classe curso
				Curso c = new Curso();
				c.setNomeCurso(txtNome.getText());
				c.setAreaCurso(txtArea.getText());
				
				//Realizar alterações
				a.alterar(Ccurso, c);
				
				//Atualizar listagem de curso
				table.setModel(a.selecionar());
				
				//limpar cammpos
				txtNome.setText("");
				txtArea.setText("");
				
				//Focus
				txtNome.requestFocus();
				
				
				
				
			}
		});
		contentPane.add(btnAlterar);
		
		
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Criar um objeto Curso
				Curso c = new Curso();
				c.setNomeCurso(txtNome.getText());
				c.setAreaCurso(txtArea.getText());
				
				//Efetuar o cadastrp
				a.cadastrar(c);
				
				//Atualizar tabela
				table.setModel(a.selecionar());
				
				//Limpar campos
				txtNome.setText("");
				txtArea.setText("");
				
				//Focus
				txtNome.requestFocus();
				
				btnCadastrar.setEnabled(true);
				btnAlterar.setEnabled(false);
				btnExcluir.setEnabled(false);
				btnCancelar.setEnabled(false);
				
				
			}
		});
		btnCadastrar.setBounds(130, 183, 87, 23);
		contentPane.add(btnCadastrar);
		
		
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Remover curso
				a.excluir(Ccurso);
				
				//Atualizar table
				table.setModel(a.selecionar());
				
			}
		});
		btnExcluir.setEnabled(false);
		btnExcluir.setBounds(243, 182, 89, 23);
		contentPane.add(btnExcluir);
		
		
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Limpar campos
				txtNome.setText("");
				txtArea.setText("");
				
				//Focus
				txtNome.requestFocus();
				
				//botoes
				btnCadastrar.setEnabled(true);
				btnAlterar.setEnabled(false);
				btnExcluir.setEnabled(false);
				btnCancelar.setEnabled(false);
			}
		});
		btnCancelar.setEnabled(false);
		btnCancelar.setBounds(345, 182, 89, 23);
		contentPane.add(btnCancelar);
		
		txtNome = new JTextField();
		txtNome.setBounds(153, 11, 246, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		txtArea = new JTextField();
		txtArea.setBounds(152, 49, 247, 20);
		contentPane.add(txtArea);
		txtArea.setColumns(10);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(60, 14, 48, 14);
		contentPane.add(lblNome);
		
		JLabel lblrea = new JLabel("\u00C1rea");
		lblrea.setBounds(60, 52, 48, 14);
		contentPane.add(lblrea);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(60, 297, 318, 339);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				//obter o indice da tabela
				int indice=table.getSelectedRow();
				
				//Adicionar o valor do indice no atributo
				Ccurso = indice;
				
				txtNome.setText(table.getValueAt(indice, 0).toString());
				txtArea.setText(table.getValueAt(indice, 1).toString());
				
				
				//botoes
				btnCadastrar.setEnabled(false);
				btnAlterar.setEnabled(true);
				btnExcluir.setEnabled(true);
				btnCancelar.setEnabled(true);
			}
		});
		table.setModel(a.selecionar());
		scrollPane.setViewportView(table);
		
		JLabel lblIndice = new JLabel("Indice");
		lblIndice.setBounds(0, 0, 48, 14);
		contentPane.add(lblIndice);
	}
}
