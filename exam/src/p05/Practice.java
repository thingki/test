package p05;

import java.util.Scanner;

public class Practice {
	int[][] numArr;
	int num1;
	int num2;
	
//	void declare() {
//		numArr = new int[num1][num2];		
//		for(int i=0; i<num1; i++) {
//			for(int j=0; j<num2; j++) {
//				numArr[i][j] = j+1+(i*numArr[i].length);
//			}
//		}
//	}
	
	void declare() {
		numArr = new int[num1][num2];		
		for(int i=0; i<num1; i++) {
			for(int j=0; j<num2; j++) {
				numArr[i][j] = numArr.length*numArr[i].length -j +(-i*numArr[i].length);
			}
		}
	}
	
	void inputNums() {
		Scanner s;
		s = new Scanner(System.in);
		System.out.println("1차원 배열변수의 방 갯수를 입력하세요.");
		num1 = s.nextInt();
		System.out.println("2차원 배열변수의 방 갯수를 입력하세요.");
		num2 = s.nextInt();
	}
	
	
	
	void printLoop() {
		for(int i=0; i<num1; i++) {
			for(int j=0; j<num2; j++) {
				System.out.print(numArr[i][j]);
				if(j!=num2-1) {
					System.out.print(",");
				}else {
					System.out.println("");
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Practice pt = new Practice();
		pt.inputNums();
		pt.declare();		
		pt.printLoop();
		
	}
	

}
