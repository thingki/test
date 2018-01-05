package p05;

import java.util.Scanner;

public class ArrayExam2 {
	
	
	public static void main(String[] args) {
				
		int num1;
		int num2;		
		
		Scanner s = new Scanner(System.in);
		num1 = s.nextInt();
		num2 = s.nextInt();
		
		int[][] numArr = new int[num1][num2];	
		
		for(int i=0; i<numArr.length; i++) {
			for(int j=0; j<numArr[i].length; j++) {
				numArr[i][j] = (i+1)*(j+1);
			}
		}		
				
		for(int i=0; i<numArr.length; i++) {
			for(int j=0; j<numArr[i].length; j++) {
				if(j!=numArr[i].length-1) {
					System.out.print((i+1)+"X"+(j+1) + "=" + numArr[i][j] + "," );
				}else {
					System.out.print((i+1)+"X"+(j+1) + "=" + numArr[i][j]);
					System.out.println("");
				}
			}
		}
		
		
	}

}
