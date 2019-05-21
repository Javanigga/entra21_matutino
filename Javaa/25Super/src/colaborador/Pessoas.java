package colaborador;

public class Pessoas {

	//Atributos
	protected String nomePessoa, emailPessoa, enderecoPessoa;
	protected int idadePessoa;
	
	//Construtor
		public Pessoas(String nomePessoas, String emailPessoa, String enderecoPessoa, int idadePessoa ) {
			this.nomePessoa = nomePessoa;
			this.emailPessoa = emailPessoa;
			this.enderecoPessoa = enderecoPessoa;
			this.idadePessoa = idadePessoa;
			exibirDadosPessoa();	
		}
	
	//metodo para exibir os dados da pessoa
	private void exibirDadosPessoa() {
		System.out.println("Nome: " +nomePessoa);
		System.out.println("E-mail: "+emailPessoa);
		System.out.println("Endereço: "+enderecoPessoa);
		System.out.println("Idade: "+idadePessoa);
		
		
	}
	
}
