package exemplo02;

public class Principal {//Variaveis 
	
	public static void main(String[] args) {
		
		//Numeros Inteiros
		byte numero1 = 1;  // armazena 1 byte, apenas -128 at� 127.
		short numero2= 30; // -32.768 at� 32.767
		int numero3  = 10; // -2.147.483.648 at� 2.147.483.647
		long numero4 = 99; // -9.223.372.036.854.775.808 at� 9.223.372.036.854.775.807
		
		//N�meros Reais
		float numero5  = 5.8f; //At� 7 casas decimais. Precisa do "F" ao final dos n�meros.
		double numero6 = 8.7;  //At� 15 casas decimais.
		
		//L�gico
		boolean acao = true; //T or F;
		
		//Textos 
		char letra = 'a'; //Apenas uma letra.
		char ascii = 65;  //C�digo da tabela ASCII pode ser definido no char.
		String texto = "\nAprendendo Java no Neumarkt!";
		
		//Concatenando Valores
		System.out.println("A vari�vel do tipo Byte � "+numero1+
							"\nA vari�vel do tipo Short � "+numero2+
							"\nA vari�vel do tipo Int � "+numero3+
							"\nA vari�vel do tipo Long � "+numero4+
							"\nA vari�vel do tipo Float � "+numero5+
							"\nA vari�vel do tipo Double � "+numero6+
							"\nA vari�vel do tipo Boolean � "+acao+
							"\nA vari�vel do tipo Char1 � "+letra+
							"\nA vari�vel do tipo Char ASCII � "+ascii+
							"\nA vari�vel do tipo String � "+texto);
	}
}
