package p07;

import java.util.Scanner;

public class Exam03 {
	
	public static void main(String[] args) {	
		
		
		Scanner s = new Scanner(System.in);
		System.out.println("방갯수를 입력하세요");
		int a = s.nextInt();				
		int[] nums;		
		nums = new int[a];
		
		for(int i=0; i<nums.length; i++) {
			System.out.println(i+1+"번째 방의 숫자를 입력하세요.");
			nums[i] = s.nextInt();
			for(int j=0; j<i; j++) {
				if(nums[i]==nums[j]) {
					nums[i] = 0;
					i--;
					System.out.println("중복된 숫자를 입력했습니다.");
//					continue;
				}
			}
		}
//		
		
//		int[] nums = new int[5];
//		nums[0] = 7;
//		nums[1] = 5;
//		nums[2] = 4;
//		nums[3] = 9;
//		nums[4] = 1;
		
		int tmp = 0;
		System.out.println("오름차순이면 짝수, 내림차순이면 홀수를 입력하세요. ");
		int ttt = s.nextInt();
		
		if(ttt%2==1) {
			for(int i=0; i<nums.length-1; i++) {
				for(int j=i+1; j<nums.length; j++) {
					if(nums[i]<nums[j]) {
						tmp = nums[i];
						nums[i] = nums[j];
						nums[j] = tmp;											
					}
				}										
			}
		}else {
			for(int i=0; i<nums.length-1; i++) {
				for(int j=i+1; j<nums.length; j++) {
					if(nums[i]>nums[j]) {
						tmp = nums[i];
						nums[i] = nums[j];
						nums[j] = tmp;											
					}
				}										
			}
			
		}
		
		
		
		for(int i=0; i<nums.length; i++) {
			System.out.println(nums[i]);	
		}
				
		
		
	}

}
