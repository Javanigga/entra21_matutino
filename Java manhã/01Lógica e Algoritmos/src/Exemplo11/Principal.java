package Exemplo11;

public class Principal {

	public static void main(String[] args) {

		//mod = restp da dovos�o
		System.out.println(60 % 2 ==0 ? "Par" : "impar");
		
		
		//Verificar se o ano � bissexto ou n�o
		//System.out.println(2019 % 4 == 0 ? "� bissexto" : "n�o � bissexto");
		
	}

}





int qtd_letras = nome.length();

for(int i=0; i<qtd_letras; i++) {

if(i % 2 ==0) {
	System.out.println(String.valueOf(nome.charAt(i)).toUpperCase());
	
}else
	System.out.println(String.valueOf(nome.charAt(i)).toLowerCase());