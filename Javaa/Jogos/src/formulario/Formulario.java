package formulario;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import acao.Acao;
import beans.Jogos;
import dados.Dados;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;

public class Formulario extends JFrame {

	private JPanel contentPane;
	private JTextField txtNomeJogo;
	private JTextField txtValor;
	private JTable table;
	

	private static int Jjogos;

	/**
	 * Create the frame.
	 */
	public Formulario() {
		
		Acao a = new Acao();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 550);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNomedoJogo = new JLabel("Nome do Jogo:");
		lblNomedoJogo.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 16));
		lblNomedoJogo.setBounds(10, 11, 102, 38);
		contentPane.add(lblNomedoJogo);
		
		JLabel lblGenero = new JLabel("G\u00EAnero:");
		lblGenero.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 16));
		lblGenero.setBounds(10, 43, 102, 38);
		contentPane.add(lblGenero);
		
		JLabel lblPlataforma = new JLabel("Plataforma:");
		lblPlataforma.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 16));
		lblPlataforma.setBounds(10, 79, 102, 38);
		contentPane.add(lblPlataforma);
		
		JLabel lblCIndicativa = new JLabel("Classifica\u00E7\u00E3o Indicativa:");
		lblCIndicativa.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 16));
		lblCIndicativa.setBounds(10, 114, 171, 38);
		contentPane.add(lblCIndicativa);
		
		JLabel lblValor = new JLabel("Valor:");
		lblValor.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 16));
		lblValor.setBounds(10, 158, 48, 14);
		contentPane.add(lblValor);
		
		txtNomeJogo = new JTextField();
		txtNomeJogo.setBounds(195, 20, 229, 20);
		contentPane.add(txtNomeJogo);
		txtNomeJogo.setColumns(10);
		
		txtValor = new JTextField();
		txtValor.setBounds(195, 156, 229, 20);
		contentPane.add(txtValor);
		txtValor.setColumns(10);
		
		JButton btnAlterar = new JButton("Alterar");
		JButton btnExcluir = new JButton("Excluir");
		JButton btnCadastrar = new JButton("Cadastrar");
		JComboBox genero1 = new JComboBox();
		JComboBox plataforma = new JComboBox();
		JComboBox CIndicativa = new JComboBox();
		btnCadastrar.setBounds(23, 205, 89, 23);
		contentPane.add(btnCadastrar);
		btnCadastrar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				boolean duplicada = false;
				Jogos j  = new Jogos();
				j.setNomeJogo(txtNomeJogo.getText());
				j.setGenero(genero1.getSelectedItem().toString());
				j.setPlataforma(plataforma.getSelectedItem().toString());
				j.setCIndicativa(CIndicativa.getSelectedItem().toString());
				j.setValor(txtValor.getText());
				
				String duplicada1 = txtNomeJogo.getText();
				String duplicada2 = plataforma.getSelectedItem().toString();
				
				for(int i = 0; i < Dados.arrayJogos.size();i++) {
					if(duplicada1.equals(Dados.arrayJogos.get(i).getNomeJogo()) && (duplicada2.equals(Dados.arrayJogos.get(i).getPlataforma()))){
						JOptionPane.showMessageDialog(null, "Jogos duplicados");
						duplicada = true;
					}
					
					
				}if(duplicada == false) {
				a.cadastrar (j);
				}
				
				
				table.setModel(a.selecionar());
			
				//limpar cammpos
				txtNomeJogo.setText("");
				txtValor.setText("");
				
				
				//Focus
				txtNomeJogo.requestFocus();
				
				btnCadastrar.setEnabled(true);
				btnAlterar.setEnabled(false);
				btnExcluir.setEnabled(false);
			
			}
		});
		
		
		btnAlterar.setBounds(122, 205, 89, 23);
		contentPane.add(btnAlterar);
		btnAlterar.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent e) {
				
				Jogos j  = new Jogos();
				j.setNomeJogo(txtNomeJogo.getText());
				j.setGenero(genero1.getSelectedItem().toString());
				j.setPlataforma(plataforma.getSelectedItem().toString());
				j.setCIndicativa(CIndicativa.getSelectedItem().toString());
                j.setValor(txtValor.getText());
				
				a.alterar(Jjogos, j);
				
                table.setModel(a.selecionar());
				
				//limpar cammpos
				txtNomeJogo.setText("");
				txtValor.setText("");
				
				
				//Focus
				txtNomeJogo.requestFocus();
				
				
			}
		});
		
		
		btnExcluir.setBounds(221, 205, 89, 23);
		contentPane.add(btnExcluir);
		btnExcluir.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				a.excluir(Jjogos);
				
				table.setModel(a.selecionar());
				
			}
		});
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 247, 414, 253);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				//obter o indice da tabela
				int indice=table.getSelectedRow();
				
				//Adicionar o valor do indice no atributo
				Jogos j = new Jogos();
				Jjogos = indice;
				
				j.setNomeJogo(txtNomeJogo.getText());
				j.setGenero(genero1.getSelectedItem().toString());
				j.setPlataforma(plataforma.getSelectedItem().toString());
				j.setCIndicativa(CIndicativa.getSelectedItem().toString());
				j.setValor(txtValor.getText());
				
				
				//botoes
				btnCadastrar.setEnabled(false);
				btnAlterar.setEnabled(true);
				btnExcluir.setEnabled(true);
				
			}
		});
		table.setModel(a.selecionar());
		scrollPane.setViewportView(table);
		
		
		genero1.setBounds(195, 52, 229, 20);
		genero1.addItem("Esporte");
		genero1.addItem("Luta");
		genero1.addItem("FPS");
		genero1.addItem("MOBA");
		genero1.addItem("Infantil");
		contentPane.add(genero1);
	
		
		
		plataforma.setBounds(195, 89, 229, 20);
		plataforma.addItem("PS3");
		plataforma.addItem("PS4");
		plataforma.addItem("Xbox");
		plataforma.addItem("Desktop");
		contentPane.add(plataforma);
		
		
		CIndicativa.setBounds(195, 123, 229, 20);
		CIndicativa.addItem("10");
		CIndicativa.addItem("14");
		CIndicativa.addItem("16");
		CIndicativa.addItem("18");
		CIndicativa.addItem("L");
		contentPane.add(CIndicativa);
		
		JButton btnEstatisticas = new JButton("Estat\u00EDsticas");
		btnEstatisticas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int esporte = 0;
				int luta = 0;
				int fps = 0;
				int moba = 0;
				int infantil = 0;
				
				
				for(int i=0; i<Dados.arrayJogos.size() ; i++) {
					if(table.getValueAt(i, 1).toString().contains("Esporte")) {
					esporte++;
					}if(table.getValueAt(i, 1).toString().contains("Luta")) {
					luta++;
					}if(table.getValueAt(i, 1).toString().contains("FPS")) {
				    fps++;
					}if(table.getValueAt(i, 1).toString().contains("MOBA")) {
					moba++;
					}if(table.getValueAt(i, 1).toString().contains("Infantil")) {
						infantil++;
					}}
					
				JOptionPane.showMessageDialog(null, "Esporte" +esporte + "\n)Luta" +luta+"\n)FPS" +fps+"\n)MOBA" +moba+"\n)Infantil" +infantil);
				
				int ps3 = 0;
				int ps4 = 0;
				int xbox = 0;
				int desktop = 0;
				
				for (int i=0; i<Dados.arrayJogos.size(); i++) {
					if(table.getValueAt(i, 2).toString().contains("PS3")) {
						ps3++;
					}if(table.getValueAt(i, 2).toString().contains("PS4")) {
						ps4++;
					}if(table.getValueAt(i, 2).toString().contains("Xbox")) {
						xbox++;
					}if(table.getValueAt(i, 2).toString().contains("Desktop")) {
						desktop++;
					}
				}
				JOptionPane.showMessageDialog(null, "PS3" +ps3+ "\n) PS4" +ps4+"\n) Xbox" +xbox+"\n) Desktop" +desktop);
				
				
			}
		});
		btnEstatisticas.setBounds(324, 205, 89, 23);
		contentPane.add(btnEstatisticas);
		
	}
}
