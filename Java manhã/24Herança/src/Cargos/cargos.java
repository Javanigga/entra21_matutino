package Cargos;

public class cargos{

	//Atributo
	protected String cargo;
	protected double salario;
	protected int nivel;
	
	//Vale transporte
	public void vt() {
		System.out.println("Vale Transporte é "+salario*0.06);
		
	
	}
 //Identificação
	public void indentificacao() {
		System.out.println("O cargo selecionado é "+cargo);

}
}