package p09;

import java.util.Random;

public class Experient {
	int[] num;
	int checkNum;
	int maxNum;
	
	public Experient(int length, int maxNum) {
		num = new int[length];
		this.maxNum = maxNum;
		
	}
	
	void castNum() {
		Random r = new Random();
		for(int i=0; i<num.length; i++) {
			checkNum = r.nextInt(maxNum) +1 ;
			if(isDupl()) {
				i--;
			}
			else {				
				num[i] = checkNum;
			}			
		}		
	}
	
	boolean isDupl() {
		for(int i=0; i<num.length; i++) {
			if(checkNum == num[i]) {
				return true;			
			}
		}
		return false;
	}
	
	void print() {
		String str = "";
		for(int i=0; i<num.length; i++) {
			str += num[i] + ", ";			
		}
		System.out.println(str.substring(0,str.length()-2));
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		Experient ep = new Experient(6, 45);
		ep.castNum();
		ep.print();
		
		
	}
}
