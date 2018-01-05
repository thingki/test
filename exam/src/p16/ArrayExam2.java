package p16;

import java.util.ArrayList;

public class ArrayExam2 {
	
	//아래의 ArrayExam2클래스를 실행하게 되면 다음 같은 결과가 나온다.
	//단 ArrayList는 ArrayExam에 있는 List 변수를 받아와야 실행한다.
	//[0,1,2,3,4,5,6,7,8,9]
	//위와 같은 결과가 올바르게 나올수 있도로 코딩을 작성
	
	
	public static void main(String[] args) {		
		ArrayExam ae = new ArrayExam();		
		ArrayList al = ae.getArrayList(0, 9);		
		for(int i =0; i<10; i++) {			
			al.add(i);			
		}		
		System.out.println(al);		
	}

}
