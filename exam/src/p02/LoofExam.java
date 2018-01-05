package p02;

import java.util.Scanner;

public class LoofExam {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int minNum = s.nextInt();
		int maxNum = s.nextInt();
		//minNum부터 maxNum까지 반복하는 반복문을 작성하여
		//반복되는 i값을 출력
		//minNum에 10 maxNum에 1이란 값이 들어갔을 경우
		int tmp = 0;
		if(minNum>maxNum) {
			tmp = minNum;
			minNum = maxNum;
			maxNum = tmp;
		}
		for(int i = minNum; i <= maxNum; i++ ) {
			System.out.print(i);
		}
		
		
		
		
//		for(int i = maxNum; i <= minNum; i++) {
//			System.out.print(i);
//		}
		
	
//		Scanner s = new Scanner(System.in);
//		int maxNum = s.nextInt();
//		int minNum = s.nextInt();
//		for(int i = maxNum; i >= minNum; i-- ) {
//			System.out.print(i);
//		}
	}

}
