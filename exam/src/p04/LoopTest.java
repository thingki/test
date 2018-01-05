package p04;

import java.util.Scanner;

public class LoopTest {
	
	int num1;
	int num2;
	int tmp = 0;
	int add(int a) {		
		return a*(a+1)/2;		
	}	
	
	void add2() {
		int a = 100;
		System.out.println(a*(a+1)/2);
	}
	
//	void printLoop() {
//		for(int i=1; i<=100; i++) {		
//				if(i!=99) {
//					System.out.print(i+",");
//				}System.out.print(i);			
//		}
//		System.out.println("");
//		
//		for(int j=2; j<=100; j++) {		
//				if(j!=100) {
//					System.out.print(j+",");
//				}System.out.print(j);							
//		}
//	}

	void fuct1(int num1, int num2) {
		int sum = 0;
		for(int i = num1; i<=num2; i++) {
			sum+= i;
		}System.out.println(sum);
		
	}
	
	void func3(int num1, int num2, int num3) {
		if(num1>num2) {
			int tmp = num1;
			num1 = num2;
			num2 = tmp;
		}
		for(int i=num1; i<num2; i++) {
			if(i%num3==0) {				
				System.out.print(i+",");
			}
		}
	}

	
	
	
	
	
//	void inputNums() {
//		Scanner s = new Scanner(System.in);
//		num1 = s.nextInt();
//		num2 = s.nextInt();
//	}
//	
//	void fuct1(int num1, int num2) {
//		int sum = 0;
//		for(int i = num1; i<=num2; i++) {
//			sum+= i;
//		}System.out.println(sum);
//		
//	}
//	
//	void func2() {
//		
//		if(num1>num2) {
//			tmp = num1 ;
//			num1 = num2;
//			num2 = tmp;
//		}
//		for(int i=num1; i<num2-1; i++) {
//			if(i%2==1) {				
//				System.out.print(i+",");
//			}
//		}if(num2%2==1) {
//			System.out.print(num2);
//		}else {
//			System.out.print(num2-1);
//		}
//	}
//	void func3() {		
//		if(num1>num2) {
//			tmp = num1 ;
//			num1 = num2;
//			num2 = tmp;
//		}
//		for(int i=num1; i<num2-1; i++) {
//			if(i%2==0) {
//				System.out.print(i+",");
//			}
//		}if(num2%2==0) {
//			System.out.print(num2);
//		}else {
//			System.out.print(num2-1);
//		}
//	}
	
	
	public static void main(String[] args) {		
		int sum = 0;
		for(int i=1; i<=10; i++) {
			sum += i;
		}
		System.out.println(sum);
		LoopTest lt = new LoopTest();
		System.out.println(lt.add(100));
		lt.add2();
//		lt.printLoop();
//		lt.inputNums();
//		lt.func2();
		System.out.println("");
		lt.func3(100,1,7);
		
//		System.out.println("");
//		int a = 100;
//		System.out.println(a*(a+1)/2);
		
		//		System.out.println(d);
		
		
	}
		
}	

