package estado;

import java.util.HashMap;

public class Principal {

	public static void main(String[] args) {
		
		//criar um hashmap
		HashMap<String, String> estados = new HashMap<String, String>();
		
		//Adicionar 
		estados.put("Santa Catarina", "Florian�polis");
		estados.put("Parana", "Curitiba");
		estados.put("Minas Gerais", "Belo Horizonte");
		
		
		
		
		//exibir infotma��o especifica
		System.out.println(estados.get("Parana"));
		
		//Remover uma informa��o
		estados.remove("Parana");
		
		//remover todos os conteudos
		estados.clear();
	
		//listar todos os valores
				System.out.println(estados);
	}
	

}
