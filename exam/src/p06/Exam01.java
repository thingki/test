package p06;

public class Exam01 {
	
	public static void main(String[] args) {
		
		for(int i=9; i>0; i--) {
			for(int j=9; j>0; j--) {
				String str = i + "X" + j + "=" + i*j;
				if((i*j)%3==0) {
					str = "3의 배수";
				}System.out.print(str);
				if(j!=1) {
					System.out.print(",");
				}				
			}System.out.println("");
		}
		
		
		
		
		
		
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
