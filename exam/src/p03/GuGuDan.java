package p03;

public class GuGuDan {
	
	public void printLoop(ObjectExam oe) { 
		
		for(int i=1; i<oe.num1; i++) {
			for(int j=1; j<oe.num2; j++) {
//				System.out.print(j+"X"+i+"="+(i*j) + ",");
//				System.out.print(j+"X"+i+"=");
				System.out.print("["+i+","+j+"]");
//				if(j==9) {
//					System.out.print(j+"X"+i+"="+(i*j));
//				}
			}System.out.println();
		}
	}
	public static void main(String[] args) {
		
//		for(int i=1; i<10; i++) {
//			System.out.print("1X" + i + "=" + i+",");
//		}for(int i=1; i<10; i++) {
//			System.out.print("2X" + i + "=" + 2*i+",");
//		}
		
	}				
}


