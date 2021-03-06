package colaborador;

public class Colaborador extends Pessoas {

	//Atributos
	private String cargoColaborador;
	private double salarioColaborador;
	
	//Metodo para exibir os dados do colaborador
	private void exibirDadosColaborador() {
		System.out.println("Cargo: "+cargoColaborador);
		System.out.println("Salario :"+salarioColaborador);
				
	}
	//Construtor)
	public Colaborador(String nomePessoa, String emailPessoa,
			           String enderecoPessoa,
			           int idadePessoa,
			           String cargoColaborador,
			           double salarioColaborador) {
		super(nomePessoa, emailPessoa, enderecoPessoa,idadePessoa);
		this.cargoColaborador = cargoColaborador;
		this.salarioColaborador = salarioColaborador;		

	}
}
