package Principal;

import Cargos.Analista;
import Cargos.Desenvolvedor;
import Cargos.Estagiario;

public class Principal {

	public static void main(String[] args) {

		
		//Instanciar objetos
		Estagiario e = new Estagiario();
		Analista a = new Analista(5000, 2);
		Desenvolvedor d = new Desenvolvedor(3000, 3);
		
		//Chamando os metodos de indentificação
		e.indentificacao();
		a.indentificacao();
		d.indentificacao();
		
		//Chamando os metodos de vale transporte
		a.vt();
		d.vt();
		System.out.println("");
		
		e.ir();
		a.ir();
		d.ir();
	}

}
