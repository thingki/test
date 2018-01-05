package p03;

import java.util.Scanner;

public class ObjectExam {
	
	int num1;
	int num2;
	
	public ObjectExam(){
		System.out.println("기본 생성자를 호출하셨군요!");
	}
	
	int add2() {
		return num1 + num2;
	}
//	double db1;
//	Double db2;
//	String str;
	
	void add() {
//		num1 =3; //위의 영역에서 데이터타입을 선언해서 여기서 데이터타입을 필요없음
//		int num3 = 4;
//		System.out.println("ObjectExam의 num1 =" + num1);
//		System.out.println("add()함수를 호출했구나");
	}
		
	int getNum2(int num2) {
		return num2;
	}
	
	public void inputNums() {
		Scanner s = new Scanner(System.in);
		System.out.println("첫번째 숫자를 입력해주세요 : ");
		num1 = s.nextInt();
		System.out.println("두번째 숫자를 입력해주세요 : ");
		num2 = s.nextInt();
	}
	
	void printLoop() {		
//		num1 = 1;
//		num2 = 13;
		for(int i=num1; i<=num2; i++) {
			System.out.print(i);
			if(i!=num2) {
				System.out.print(",");
//			}if(i%10==0){ 
//				System.out.println("");
			}
			//System.out.println(num2);
		}
	}
	
	public static void main(String[] args) {
//		ObjectExam oe = new ObjectExam();  
//		oe.add();
//		oe.num1 = 4;
//		
////		oe.num2 = 4;
////		oe.num3 = 5;
//		System.out.println(oe.num1);
//		System.out.println(oe.getNum2(3));
//		System.out.println(oe.num2);
////		System.out.println(oe.num1);
//				
////		System.out.println(oe.str.length());
		ObjectExam oe; 
		oe = new ObjectExam();  
//		ObjectExam oe = new ObjectExam();		
		oe.inputNums();
		oe.printLoop();
		
		
//		oe.num1 = 1;
//		oe.num2 = 10;
//		
//		
//		ObjectExam oe2 = new ObjectExam();	
//		oe2.num1 = 2;
//		oe2.num2 = 20;
//		oe.printLoop();
//		oe2.printLoop();
//		
//		int a = 1;
//		int b = a;
//		
//		a= 2;		
//		System.out.println(a);
//		System.out.println(b);
		
		
	}

}
