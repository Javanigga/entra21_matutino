package acao;
import javax.swing.table.DefaultTableModel;

import beans.Nome;
import dados.Dados;
public class Acao {
	
	
	
	 

	//Cadastrar
	public void Cadastrar (Nome c) {
		Dados.arrayNome.add(c);
	}
	
	//Alterar
	public void alterar (int indice, Nome c) {
		Dados.arrayNome.set(indice, c);
	}
	//Excluir
	public void excluir(int indice) {
		Dados.arrayNome.remove(indice);
	}
	//Selecionar
	public DefaultTableModel selecionar() {
		DefaultTableModel modelo = new DefaultTableModel();
		modelo.addColumn("Nome");
		modelo.addColumn("Idade");
		modelo.addColumn("Altura");
		modelo.addColumn("Peso");
		modelo.addColumn("IMC");
		
		for (int indice = 0; indice<Dados.arrayNome.size(); indice++) {
			modelo.addRow(new Object[] {
					Dados.arrayNome.get(indice).getNome(),
					Dados.arrayNome.get(indice).getIdade(),
					Dados.arrayNome.get(indice).getAltura(),
					Dados.arrayNome.get(indice).getPeso(),
					Dados.arrayNome.get(indice).getIMC(),
		
	});
		}
		return modelo;
}
	//Estatisticas
	
}