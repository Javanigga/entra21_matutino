package Cargos;

public class Analista extends cargos {

	
	//Construtor
	public Analista(double salario, int nivel) {
		
	}
	//IR(Imposto de renda)
		public void ir() {
			if(nivel == 1) {
				System.out.println("Imposto de renda: "+salario*0.15);
				}else {
					System.out.println("imposto de renda: "+salario*0.20);
				}
			
			
		}
}
