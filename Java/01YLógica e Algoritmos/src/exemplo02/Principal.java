package exemplo02;

public class Principal {//Variaveis 
	
	public static void main(String[] args) {
		
		//Numeros Inteiros
		byte numero1 = 1;  // armazena 1 byte, apenas -128 até 127.
		short numero2= 30; // -32.768 até 32.767
		int numero3  = 10; // -2.147.483.648 até 2.147.483.647
		long numero4 = 99; // -9.223.372.036.854.775.808 até 9.223.372.036.854.775.807
		
		//Números Reais
		float numero5  = 5.8f; //Até 7 casas decimais. Precisa do "F" ao final dos números.
		double numero6 = 8.7;  //Até 15 casas decimais.
		
		//Lógico
		boolean acao = true; //T or F;
		
		//Textos 
		char letra = 'a'; //Apenas uma letra.
		char ascii = 65;  //Código da tabela ASCII pode ser definido no char.
		String texto = "\nAprendendo Java no Neumarkt!";
		
		//Concatenando Valores
		System.out.println("A variável do tipo Byte é "+numero1+
							"\nA variável do tipo Short é "+numero2+
							"\nA variável do tipo Int é "+numero3+
							"\nA variável do tipo Long é "+numero4+
							"\nA variável do tipo Float é "+numero5+
							"\nA variável do tipo Double é "+numero6+
							"\nA variável do tipo Boolean é "+acao+
							"\nA variável do tipo Char1 é "+letra+
							"\nA variável do tipo Char ASCII é "+ascii+
							"\nA variável do tipo String é "+texto);
	}
}
