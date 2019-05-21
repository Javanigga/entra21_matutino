package pacote;

public class Texto {
	
	//Atributo
	private String palavra;
	
	//Construtor
	public Texto(String palavra) {
		this.palavra = palavra;
		
	}
	
	//Metodo para contar caracteres
	public void contarLetras() {
		System.out.println("a palavra "+palavra.toLowerCase()+" possui "+palavra.length()+" letras.");
	}
	

}
