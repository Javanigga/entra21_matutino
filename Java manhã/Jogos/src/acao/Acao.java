package acao;

import javax.swing.table.DefaultTableModel;

import beans.Jogos;
import dados.Dados;

public class Acao {
	
	//Cadastrar
		public void cadastrar(Jogos j ) {
			Dados.arrayJogos.add(j);
		}
		
		//Seleção
		public DefaultTableModel selecionar() {
			
			DefaultTableModel modelo = new DefaultTableModel();
			modelo.addColumn("Nome do Jogo");
			modelo.addColumn("Genero");
			modelo.addColumn("Plataforma");
			modelo.addColumn("Classificação Indicativa");
			modelo.addColumn("Valor");
			
			for (int indice = 0; indice<Dados.arrayJogos.size(); indice++) {
				modelo.addRow(new Object[] {
						Dados.arrayJogos.get(indice).getNomeJogo(),
						Dados.arrayJogos.get(indice).getGenero(),
						Dados.arrayJogos.get(indice).getPlataforma(),
						Dados.arrayJogos.get(indice).getCIndicativa(),
						Dados.arrayJogos.get(indice).getValor(),
				});
			}
			return modelo;
		}
		
		//Alteração
		public void alterar(int indice, Jogos j) {
			Dados.arrayJogos.set(indice, j);
		}
		//Exclusão
		public void excluir(int indice) {
			Dados.arrayJogos.remove(indice);

		}
		

		
		
}
