package p08;

import java.util.Random;

public class PracticeLotto {
	
	boolean isDupl(int[] nums, int num) {
		for(int i=0; i<nums.length; i++) {
			if(nums[i] == num) {
				return true;
			}
		}return false;	
	} 
	
	
	public static void main(String[] args) {
		
		Random rd = new Random();
		int[] nums = new int[6];
		int rNums = 0;
		for(int i=0; i<6; i++) {
			rNums = rd.nextInt(45)+1;
			
			
		}
		
		
		
		
		
		
		
	}

}
