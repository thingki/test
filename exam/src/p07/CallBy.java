package p07;

public class CallBy {
	
	
	int[] doFunc(int[] a) {
		a[0] = 3;
		a = new int[a.length];
		a[0] = 3;
		System.out.println(a.length);
		return a;
	}
	public static void main(String[] args) {
		
		int[] a = new int[1];
		int[] b = new int[2];
		b[1] = 1;
		a=b;
		System.out.println(a[0]);
		System.out.println(a==b);
		CallBy cb = new CallBy();		
		int[] c = cb.doFunc(a);	
		System.out.println(c[0]);
//		System.out.println(a[0]);
		
		
		
	}

}
