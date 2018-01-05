package p16;

public class Exam2 {
	
	
	final int a = 2; 
//	Exam2(){		
//		a = 3;	// 선언 때 값을 넣지 않으면 여기서 한번 넣는게 가능하다.
//		a = 4; // 이건 불가능
//	}
	
	
	
	
	public static void main(String[] args) {
		
		Exam2 e = new Exam2();
//		e.a = 4; //이것도 불가능		
		System.out.println(new Exam2().a);
		
	}

}
