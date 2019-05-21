package acao;

import beans.Cadastro;
import dados.Dados;

public class Acao {

	//Cadastrar
	public void cadastrar (Cadastro  c) {
		Dados.arrayCadastro.add(c);
	}
	
}
