package exemplo09;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Idade
		int idade = 16;
		
		//Operador ternário
		String condicao = idade >= 18 ? "maior de idade" : "Menor de idade"; //? = então, : = se não
		
		//Exibir condição
		System.out.println(condicao);
	}

}
