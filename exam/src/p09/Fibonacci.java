package p09;

public class Fibonacci {
	int[] f ;
	
	int num;
	
	public Fibonacci(int num) {
		this.num = num;
		f = new int[num];		
	}	
	
	void makeFibonacci() {
		f[0] = 0;
		f[1] = 1;
		for(int i=2; i<f.length; i++) {	
			int check = 
			f[i] = (f[i-1] + f[i-2]);			
		}
				
	}
	
	void println() {
		
		System.out.println("피보나치 수열의 "+ num+"번 째 수열은 "+ f[num-1]+ " 이당!");
	}
	
	
	public static void main(String[] args) {
		Fibonacci fb = new Fibonacci(7);		
		fb.makeFibonacci();
		fb.println();
		
	}
	
	

}
