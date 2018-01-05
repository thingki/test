package p09;

import java.util.Random;

public class ForExam {
	int[] num;
	int checkNum;
	int maxNum;
	
	
	public ForExam(int numLength, int maxNum) {
		num = new int[numLength];
		this.maxNum = maxNum;
		
	}
	
	boolean isDupl() {
		for(int i=0; i<num.length; i++) {
			if(checkNum == num[i]) {
				return true;				
			}			
		}
		return false;
	}
	
	
	
	
	void castLotto() {
		
		Random r = new Random();
		for(int i=0; i<num.length; i++) {
			checkNum = r.nextInt(maxNum)+1;
			if(isDupl()) {
				i--;				
			}else {
				num[i] = checkNum;
			}			
		}		
	}
	
	void print() {
		for(int i=0; i<num.length; i++) {
			System.out.print(num[i] + ", ");
			
		}
		
	}
	
	
	
	
	public static void main(String[] args) {
		
		ForExam fe = new ForExam(6, 6);
		fe.castLotto();
		fe.print();
		
		System.out.println("");
		
		
		int[][] nums = new int[3][];
		 //가장 큰 차원의 방은 선언 해야된다.
//		nums[0] = new int[4];  //1차원 배열의 2차원 배열의 방의 개수는 다 다르게 입력 할 수 있다 !!
//		nums[1] = new int[3];
		
//		for(int i=0; i<nums.length; i++) {
//			nums[i] = new int[nums.length + i];
//		}
		

		int[] a = new int[3];
		int[] b = new int[4];
		int[] c = new int[5];
		nums[0] = a;
		nums[1] = b;
		nums[2] = c;
		
//		System.out.println(nums[0].length);
//		System.out.println(nums[1].length);
//		System.out.println(nums[2].length);
		
//		
		int cnt = 0;
		for(int i=0; i<nums.length; i++ ) {
			for(int j=0; j<nums[i].length; j++) {	
				
				nums[i][j] = ++cnt;				
			}			
		}
		
//		int lastNum = 0;
//		for(int i=0; i<nums.length; i++) {
//			for(int j=0; j<nums[i].length; j++) {				
//				if(j == (nums[i].length -1)) {
//					nums[i][j] = lastNum + j + 1 ;
//					lastNum = nums[i][j];					
//				}else {
//					nums[i][j] = lastNum + j + 1 ;					
//				}								
//			}
//		}
		
		
		
		

//		int addNum = 1;
//		for(int i=0; i<nums.length; i++ ) {
//			if(i!=0) {
//				addNum += nums[i-1].length;  
//			}			
//			for(int j=0; j<nums[i].length; j++) {	
//					nums[i][j] =  j + addNum;		
//			}			
//		}
		
		
		
					
			
		
//		for(int i=0; i<3; i++) {
//			nums[0][i] = i+1;			
//		}		
		
				
		for(int i=0; i<nums.length; i++) {
			for(int j=0; j<nums[i].length; j++) {
				System.out.print("nums["+ i + "][" + j + "]" + "= " + nums[i][j] + "  ");				
			}System.out.println("");						
		}
		
		
//		int[] a = new int[4];
//		a = new int[5];  // 위의 방의 개수 더 많게 만들려면
		
	}	
}


