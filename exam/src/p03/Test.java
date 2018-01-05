package p03;

import java.util.Scanner;

public class Test {
	
	String str;
	
	Test(String str) {
		this.str = str;
	}
	void print() {
		System.out.println(str);
	}
//	static void printInt(int a) {
//		System.out.println(a);
//	}
	
//	String getCoffee() {
//		Scanner s = new Scanner(System.in);
//		System.out.println("돈을 넣으세요");
//		int pay = s.nextInt();
//		if(pay>1000) {
//			return "커피 사왔습니다.";
//		}return "돈 부족 함";
//	}
	
	public static void main(String[] args) {
		ObjectExam oe = new ObjectExam();
		oe.inputNums();		
		
		GuGuDan ggd = new GuGuDan();
		ggd.printLoop(oe);
		
		
//		ObjectExam oe = new ObjectExam();
//		oe.inputNums();
//		oe.printLoop();
//		System.out.println(oe.num1 + oe.num2);
		
//		Test t = new Test("가나다ABC123");  //위에서 Test(String str)로 선언을 했기에  String에 맞게 문자열 필요하다, 여기서 변수 t는 위의 함수들을 호출가능
//		t.print();
		
//		String result = t.getCoffee();
//		System.out.println(result);
		
//		String str = "나 나여깄어요~~나";
		
//		str = str.replace("나","최재열");
//		t.print(str.replace("나", "최재열"));
//		t.print(str);
		
//		System.out.println(str.indexOf("나"));
//		System.out.println(str.lastIndexOf("나"));
//		System.out.println(str.substring(1));
//		str = str.substring(3);
//		System.out.println(str.indexOf("나"));
		
	}

}
