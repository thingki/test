package forTest;

import java.util.ArrayList;
import java.util.Scanner;

public class one {
	public ArrayList<Integer> alInt;
	
	public one(){		
		alInt = new ArrayList<Integer>();
	}	
	
	public void inputNums() {
		
		Scanner s = new Scanner(System.in);
		for(int i=0; i<5; i++) {
			System.out.println("학생 " + (i+1) + "의 점수를 입력하세요");
			try {
			Integer n = Integer.parseInt(s.nextLine());	
			alInt.add(n);
			}catch (Exception e) {			
				System.out.println("숫자가 아닙니다.");
				System.out.println("숫자를 입력해주세요.");
				Integer n = Integer.parseInt(s.nextLine());				
				alInt.add(n);
			}							
		}		
	}
	
	public void arrangeNums() {
		
		for(int i=0; i<alInt.size(); i++) {
			for(int j=i+1; j<alInt.size(); j++) {
				if(alInt.get(i)> alInt.get(j)) {
					Integer d = alInt.get(i);
					Integer dt = alInt.get(j);					
					alInt.set(i, dt);
					alInt.set(j, d);					
				}				
			}			
		}		
	}	
	
	public void print() {		
		System.out.println(alInt);		
	}	
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		one o = new one();	
		o.inputNums();		
		o.arrangeNums();
		o.print();		
	}
}
