package exemplo07;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		int[][] nums = new int[3][2];
		
		for(int linhas = 0; linhas < 3; linhas++) {
			for(int colunas = 0; colunas < 2; colunas++) {
				
				nums[linhas][colunas] = Integer.parseInt(JOptionPane.showInputDialog(linhas +" - " + colunas ));
				System.out.println(nums[linhas][colunas]);
				
			}
		}
		
		
		
	}

}
