package p05;

import java.util.Scanner;

public class TotalExam {
	int a;
	Integer ac;
	boolean b;
	Boolean bc;
	

	public static void main(String[] args) {		
		TotalExam te = new TotalExam();
//		te.a = 3;
		System.out.println(te.bc);
		if(te.bc!=null && te.bc.toString().equals("true")) {
			System.out.println("TotalExam의 bc의 값이 참이네요!");
		}
		if(te.a==1 || te.a==2 || te.a==3) {
			System.out.println("a가 0이 아니에요");
		}else if(te.a==0 && te.a==1) {
			System.out.println("a가 0이네요");
		}
		
//		String numStr = "백육심칠";
//		System.out.println(numStr);
//		System.out.println("167"==167);
//		System.out.println(Integer.parseInt("1a67"));
//		System.out.println(Integer.parseInt("1.34"));
//		System.out.println(Double.parseDouble("1.34"));
//		
		int a = 0;
		double b = 0.0;
		
		System.out.println(Double.parseDouble(Double.toString(a)));

		System.out.println(Integer.parseInt("167")==167);
		
		System.out.println("스트링배열변수의 방개수를 입력해 주세요");	
		
		Scanner s = new Scanner(System.in);
		int length = s.nextInt();
		String[] strArr = new String[length];
		
		for(int i=0; i<length; i++) {
			System.out.println((i+1)+"번째 방을 입력해 주세요!");
			strArr[i] = s.nextDouble() + "";
		}
		
		int sum = 0;
		for(int i=0; i<length; i++) {
			sum += Double.parseDouble(strArr[i]);
		}
		System.out.println(sum);
		
		
		
//		System.out.println(strArr[0]);				
//		strArr[0] = "123";
//		strArr[1] = "123";
//		strArr[2] = "123";
//		
		
		
//		System.out.println(strArr.length);
//		System.out.println(strArr[0].length());
//		System.out.println(strArr[0].equals(strArr[2]));
//		System.out.println(strArr[0].equals("123".trim()));

		
	}
}
