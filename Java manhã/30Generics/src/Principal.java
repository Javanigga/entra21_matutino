
public class Principal {
	
	/*Valores genericos
	 * E -> tipos de classe
	 * K -> Chave(utilizado com hashmap)
	 * V -> Valor (utilizado com hashmap)
	 * T -> tipo (int, double, char)
	 */
	
	//metodo estatico de exibição
	public static <E> void exibirDados(E[] vetor) {
		for(E elemento : vetor) {
			System.out.println(elemento);
		}
	}

	public static void main(String[] args) {
		
		//Dados
		Integer[] dadosInt = {1,5,7,8};
		Double[] dadosDouble = {7.5, 8.3, 1.2};
		String[] dadosString = {"computador", "Impressora"};

		//exibir dados
	
		exibirDados(dadosString);
		

	}

}
