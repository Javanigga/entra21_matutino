package exemplo03;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//vetor de numeros
		
		int[] nums = new int[10];
		
		for (int i = 0; i<nums.length ; i++) {
			System.out.println("Informe o " + (i+1) + "º numero:");
			nums[i] = input.nextInt();
		}
		
		/*for (int i = 0; i<nums.length; i++) {
			System.out.println((i+1) + "º numero é:" + nums[i]);
		}*/
		
		System.out.println("");
		System.out.println("");
		
		for (int i : nums) {
			System.out.println(i);
		}
		
		input.close();
		
		
	}

}
