package p16;

import java.util.ArrayList;
import java.util.Scanner;

import com.google.common.collect.Lists;


public class Exam {
	
	// 1. 총 5명의 학생의 점수를 Scanner 해서 입력 --> 총점과 평균을 구하고 점수를 낮은 순서 대로 입력해라;
	// 30 50 60 70 100
	
	ArrayList<Integer> al;
	
	Exam(){
		al = new ArrayList<Integer>();		
	}
	
	void inputNums() {
		
		Scanner s = new Scanner(System.in);
		System.out.println("재열이의 점수");
		al.add(Integer.parseInt(s.nextLine()));	
		System.out.println("명훈이의 점수");
		al.add(Integer.parseInt(s.nextLine()));	
		System.out.println("희주의 점수");
		al.add(Integer.parseInt(s.nextLine()));	
		System.out.println("명재의 점수");
		al.add(Integer.parseInt(s.nextLine()));	
		System.out.println("재형이의 점수");
		al.add(Integer.parseInt(s.nextLine()));				
		
	}	
	
	void arrangeNums() {
		
		for(int i=0; i<al.size(); i++) {
			for(int j=i+1; j<al.size(); j++) {
				
				if(al.get(i)> al.get(j)){
					Integer it = al.get(i);
					Integer itt = al.get(j);
					
					al.set(i, itt);
					al.set(j, it);					
				}				
			}			
		}		
	}
	
	void print() {
		int sum = 0;
		for(int i=0; i<al.size(); i++) {			
			sum += al.get(i);			
		}
		
		System.out.println(al);		
		System.out.println("합은 : " + sum);
		System.out.println("평균은 : " + sum/al.size());
		
		
	}
	
	
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		Integer[] nums = new Integer[5];
	
		
		for(int i=0; i<5; i++) {			
			System.out.println(i + " 번째 학생 점수 입력");
			nums[i] = Integer.parseInt(s.nextLine());			
		}		
		
		ArrayList<Integer> numList = Lists.newArrayList(nums);
		
		
		
		System.out.println(numList);
		
		
		
		
//		Exam ex = new Exam();
//		ex.inputNums();
//		ex.arrangeNums();
//		ex.print();
//		
		
		
		
		
		
		
		
	}

}
