package principal;

import java.util.Random;

public class principal {

	public static void main(String[] args) {

		//Random boolean
		//instanciando um objeto
		Random gerador = new Random();
		
		//Criando uma variavel e adicionando um valor bolean randomico
		boolean resultado = gerador.nextBoolean();
		
		//exibindo o valor da variavel resultado
		System.out.println(resultado);
		
		//Random int
		//instaciando um objeto
		Random gerador1 = new Random();
		
		//Criando uma variavel e adicionando um valor numerico randomico
		int resultado1 = gerador.nextInt();
		
		//exibindo o valor da variavel resultado
		System.out.println(resultado);
		
		//Random int atribuindo um valor
		//instaciando um objeto
		Random gerador2 = new Random();

		//Criando uma variavel e adicionando um valor numerico randomico
		int resultado2 = gerador.nextInt(10);

		//exibindo o valor da variavel resultado
		System.out.println(resultado);
		
		//Random double
		//
		
		
		
		
		
	}

}
