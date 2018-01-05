package Practice;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Array {
	
	
	
	ArrayList<String> alName;
	ArrayList<Integer> alLotto; 
	
	Array(){
		alName =  new ArrayList<String>();
		alLotto = new ArrayList<Integer>(); 
	}
	
	boolean isDupl(ArrayList<Integer> alLotto, int n) {
		for(int i=0; i<alLotto.size(); i++) {		
			if(alLotto.get(i) == n) {					
				return true;
			}						
		}return false;		
	}	
	
	void inputeValue() {
		
		Scanner s = new Scanner(System.in);
		System.out.println("몇개나 넣을 꺼냐?");
		int cnt = s.nextInt();	
		s.nextLine();
		for(int i=0; i<cnt; i++) {						
			int nums = new Random().nextInt(45)+1;			
			if(isDupl(alLotto, nums)) {
				i--;				
			}else {
				System.out.println(i+1 + " 번째 이름 입력 ㄱㄱ");
				String str = s.nextLine();
				alName.add(str);
				alLotto.add(nums);				
			}
		}		
	}				
	
	void print() {
		System.out.println(alName);
		System.out.println(alLotto);			
	}
			
	public static void main(String[] args) {
		Array ar = new Array();
		ar.inputeValue();
		ar.print();		
	}

}
