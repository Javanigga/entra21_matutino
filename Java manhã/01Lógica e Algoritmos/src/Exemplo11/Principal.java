package Exemplo11;

public class Principal {

	public static void main(String[] args) {

		//mod = restp da dovosão
		System.out.println(60 % 2 ==0 ? "Par" : "impar");
		
		
		//Verificar se o ano é bissexto ou não
		//System.out.println(2019 % 4 == 0 ? "É bissexto" : "não é bissexto");
		
	}

}





int qtd_letras = nome.length();

for(int i=0; i<qtd_letras; i++) {

if(i % 2 ==0) {
	System.out.println(String.valueOf(nome.charAt(i)).toUpperCase());
	
}else
	System.out.println(String.valueOf(nome.charAt(i)).toLowerCase());