package Cargos;

public class Desenvolvedor extends cargos {

	
	//Construtor
	public Desenvolvedor(double salario, int nivel) {
		cargo = "desenvolvedor";
		this.salario = salario;
		this.nivel = nivel;		
	}
	
	//IR(Imposto de renda)
	public void ir() {
		
		if(nivel == 1) {
			System.out.println("imposto de renda: "+salario*0.04);
		}else if( nivel ==2) {
			
		}
	}
}
