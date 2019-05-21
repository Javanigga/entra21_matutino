package exemplo05;

public class Principal {

	public static void main(String[] args) {
		int[] nums = {5,1,3,4,2};
		
		//bubble sort
		int maiorNumero;
		for (int x = 0; x<4; x++) {
			for(int y  = x+1; y<5; y++) {
				
				if (nums[y] < nums[x]) {
					maiorNumero = nums[x];
					nums[x] = nums[y];
					nums[y] = maiorNumero;
				}
			}
			
		}
		
		
		for (int i : nums) {
			System.out.println(i);
			
		}
	}

}
