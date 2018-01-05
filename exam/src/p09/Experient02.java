package p09;

public class Experient02 extends Experient {
	
	
	
	
	
	public Experient02(int length, int maxNum) {
		super(length, maxNum);
		// TODO Auto-generated constructor stub
	}




	void getSetNums(int[] a, int[] b ) {
		
		int cnt = 0;
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<b.length; j++) {
				if(a[i] == b[j]) {
					cnt++;
				}				
			}			
		}
		System.out.println("중복은 갯수는 " + cnt + "입니다.");
	}
	
	
	

	public static void main(String[] args) {
		Experient02 ext = new Experient02(6, 45);
		ext.castNum();
		ext.print();
		
		Experient ex = new Experient(6, 45);
		ex.castNum();
		ex.print();
		System.out.println("");
		ext.getSetNums(ext.num, ex.num);
		
	}

	
	
	

}
