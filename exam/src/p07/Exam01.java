package p07;

import java.util.Scanner;

public class Exam01 {
	int[] num;
	int cnt;
	
	void inputNums() {
		Scanner s = new Scanner(System.in);	
		num= new int[5];		
		for(int i=0; i<num.length;i++) {
			num[i]=s.nextInt();
		}
//		System.out.println("처음 시작하는 단을 입력하세요.");
//		num[0] = s.nextInt();
//		System.out.println("마지막 단을 입력하세요.");
//		num[1] = s.nextInt();
//		System.out.println("시작하는 열을 입력하세요.");
//		num[2] = s.nextInt();
//		System.out.println("끝나는 열을 입력하세요.");
//		num[3] = s.nextInt();
//		System.out.println("배수처리를 할 숫자를 입력하세요.");
//		num[4] = s.nextInt();
	}
	
	void print() {
		int tmp = 0;
		if(num[0]<num[1]) {
			tmp = num[0];
			num[0] = num[1];
			num[1] = tmp;			
		}
		if(num[2]<num[3]) {
			tmp = num[2];
			num[2] = num[3];
			num[3] = tmp;			
		}
		
//		int num6 = 0;
//		String str2= num[4]+"의 배수";
		
		for(int i=num[0]; i>=num[1]; i--) {			
			for(int j=num[2]; j>=num[3]; j--) {
				String str = i + "X" + j + "=" + i*j;
				if((i*j)%num[4]==0) {
					cnt ++;
					str = num[4]+"의 배수";					
				}
				System.out.print(str);					
				
				if(j!=num[3]) {
					System.out.print(",");
				}
//				if(str2.equals(str)) {
//					++num6;
//				}			
			}System.out.println("");			
		}System.out.println(cnt);
		
		
	}
	
	
	
	
	public static void main(String[] args) {
		Exam01 e = new Exam01();
		e.inputNums();
		e.print();
		
		
		
		
		
		
//		
//		
//		for(int i=9; i>0; i--) {
//			for(int j=9; j>0; j--) {
//				if(i==3 || j==3) {
//					if(i==3 && j==1) {
//						System.out.print("3의 배수");
//						System.out.println("");
//					}else {
//						System.out.print("3의 배수,");	
//					}
//				}else {					
//					if(j==1) {
//						System.out.print(i + "X" + j + "=" + i*j);	
//						System.out.println("");
//						
//					}else {
//						System.out.print(i + "X" + j + "=" + i*j);
//						System.out.print(",");
//					}
//				
//				}
//			}못된거 입니다. --> 1차원 적으로 생각하지말고 깊게 생각하세요.
		
	}
//		}  이거는 잘

}
