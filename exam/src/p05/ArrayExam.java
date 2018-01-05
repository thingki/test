package p05;

import java.util.Scanner;

public class ArrayExam {
	int num1;
	int num2;
	int[][] numArr;
		
	
	void inputNums() {
		Scanner s = new Scanner(System.in);
		System.out.println("i열을 입력하세요");
		num1 = s.nextInt();
		System.out.println("j열을 입력하세요");
		num2 = s.nextInt();
	}
	
	void initNumArr() {
		numArr = new int[num1][num2];
		int num = 1;
		for(int i=0; i<numArr.length; i++) {
			for(int j=0; j<numArr[i].length; j++) {
//				numArr[i][j] = j+1+(numArr[i].length*i);
				numArr[i][j] = num++;
			}
		}		
	}
	
	void printNumArr() {
		for(int i=0; i<numArr.length; i++) {
			for(int j=0; j<numArr[i].length; j++) {
				if(j!=numArr[i].length-1) {
					System.out.print(numArr[i][j]+",");
					
				}else {
					System.out.print(numArr[i][j]);
					System.out.println("");
				}
			}
		}		
	}
	
	
	public static void main(String[] args) {
//		Scanner scanner;
//		scanner = new Scanner(System.in);		
		ArrayExam ae = new ArrayExam();
		ae.inputNums();
		ae.initNumArr();
		ae.printNumArr();
//		System.out.println("1차원 배열변수의 갯수를 입력하세요");
//		ae.num1 = scanner.nextInt();
//		System.out.println("2차원 배열변수의 갯수를 입력하세요");
//		ae.num2 = scanner.nextInt();
//		ae.inputNum();
		
//		int[][] numArr = new int[ae.num1][ae.num2];
		
//		numArr[0][0] = 1;
//		numArr[0][1] = 2;
//		numArr[0][2] = 3;
//		
//		numArr[1][0] = 1;
//		numArr[1][1] = 2;
//		numArr[1][2] = 3;
//		
//		numArr[2][0] = 1;
//		numArr[2][1] = 2;
//		numArr[2][2] = 3;
		
//		for(int i=0; i<3; i++) {
//			for(int j=0; j<3; j++) {
//				if(j==0) {
//					numArr[i][j] = 1;
//				}else if(j==1) {
//					numArr[i][j] = 2;					
//				}else {
//					numArr[i][j] = 3;
//				}
//			}
//		}
		
//		for(int i=0; i<numArr.length; i++) {
//			for(int j=0; j<numArr[i].length; j++) {	
//				if(i==0) {
//					numArr[i][j] = j+1;
//				}else {
//					numArr[i][j] = numArr[i-1][j] + numArr[i].length;
//				}								
//			}			
//		}
		
//		
//		
//		
//		for(int i=0; i<numArr.length; i++) {
//			for(int j=0; j<numArr[i].length; j++) {
//				numArr[i][j] = j+1+(numArr[i].length*i);
//			}
//		}
//		
		
				
//		for(int i= 0; i<3; i++) {
//			System.out.print(numArr[i][0]+",");
//			System.out.print(numArr[i][1]+",");
//			System.out.println(numArr[i][2]);
//		}
		
//		for(int i= 0; i<3; i++) {
//			for(int j=0; j<3; j++) {
//				if(j==2){
//					System.out.print(numArr[i][j]);
//					System.out.println("");	
//				}else if(j<2) {
//					System.out.print(numArr[i][j]+",");
//				}							
//			}
//		}
//		for(int i=0; i<numArr.length; i++) {
//			for(int j=0; j<numArr[i].length; j++) {
//				if(j!=numArr[i].length-1) {
//					System.out.print(numArr[i][j]+",");
//					
//				}else {
//					System.out.print(numArr[i][j]);
//					System.out.println("");
//				}
//			}
//		}
//		
//		
//		
		
		
//		for(int i=0; i<3; i++) {
//			for(int j=0; j<3; j++) {
//				System.out.println(numArr[i][j]);				
//			}
//		}
		
		
		
		
	}

}
