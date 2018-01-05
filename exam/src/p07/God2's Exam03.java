package p07;

import java.util.Scanner;

public class Exam03 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] intArr = new int[5];

		for (int i = 0; i < intArr.length; i++) {
			System.out.println("숫자입력");
			intArr[i] = sc.nextInt();
		}
		sc.nextLine();
		System.out.println("초기입력 숫자");
		for (int x = 0; x < intArr.length; x++) {
			if (x == intArr.length - 1) {
				System.out.print(intArr[x]);
			} else {

				System.out.print(intArr[x] + " , ");
			}
		}
		System.out.println("");
		int temp = 0;

		for (int i = 0; i < intArr.length; i++) {

			for (int x = i + 1; x < intArr.length; x++) {

				if (intArr[i] < intArr[x]) {
					temp = intArr[i];
					intArr[i] = intArr[x];
					intArr[x] = temp;
				}
			}
		}
		System.out.println("정렬된 숫자");
		for (int x = 0; x < intArr.length; x++) {
			if (x == intArr.length - 1) {
				System.out.print(intArr[x]);
			} else {

				System.out.print(intArr[x] + " , ");
			}
		}

	}
}
