package p16;

import java.util.Scanner;

public class ExceptionExam {
	
	
	
	public void convertAndPrint(String numStr) throws Exception{
		System.out.println(Integer.parseInt(numStr) + 1);
		
//		try {
//			System.out.println(Integer.parseInt(numStr) + 1);
//			
//		}catch(Exception e) {			
//			System.out.println("숫자를 적어야지 임마");	
//			
//		}				
		
	}
	
	
	
	
	public static void main(String[] args) {
		ExceptionExam ee = new ExceptionExam();
		System.out.println("숫자를 입력해줭");	
		Scanner s = new Scanner(System.in);		
		String str = s.nextLine();					
		try {
			ee.convertAndPrint(str);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("숫자를 적어달라고 하찮은");
			System.out.println("숫자 다시 입력 ㄱㄱ");
			str = s.nextLine();
			try {
				ee.convertAndPrint(str);				
			}catch(Exception e1){
				System.out.println("숫자를 적어달라고 하찮은");				
			}
		}		
	}
}
