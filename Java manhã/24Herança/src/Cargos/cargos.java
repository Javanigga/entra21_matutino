package Cargos;

public class cargos{

	//Atributo
	protected String cargo;
	protected double salario;
	protected int nivel;
	
	//Vale transporte
	public void vt() {
		System.out.println("Vale Transporte � "+salario*0.06);
		
	
	}
 //Identifica��o
	public void indentificacao() {
		System.out.println("O cargo selecionado � "+cargo);

}
}