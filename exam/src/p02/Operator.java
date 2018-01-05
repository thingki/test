package p02;

public class Operator {
	
	public static void main(String[] args) {
		int a = 3;
		int b = a;
		int c = b;
		
		boolean b1 = a==b;
		System.out.println(b1);
		System.out.println(a==b);		
		
		for(int i=1; i<10; i++) {
			if(i%2==0) {
				System.out.println((i)+".a와 b는 같습니다.");
			}
		}
		for(int i=10; i>0; i--) {
			if(i%2==1) {
				System.out.println(i+".a와 b는 같습니다.");
			}
		}
		
		int len = 7;
		String[] strArr = new String[7];
		for(int i=0; i<strArr.length; i++) {
			strArr[i] = (i+1)+"0";
			System.out.println("strArr["+i+"]=" + strArr[i]);
		}
		for(int i=strArr.length-1; i>=0 ; i--) {
			System.out.println("strArr["+i+"]=" + strArr[i]);
		}
		for(int i=5; i<=100; i+=5) {
			System.out.println(i);
		}
		for(int i=10; i<=100; i+=10) {
			System.out.println(i);
		}
		for(int i=5; i<=100; i+=10) {
			System.out.println(i);
		}
		for(int i=100; i>0; i-=5) {
			System.out.println(i);
		}
		
	}
}		



//if(b1) {
//System.out.println("a와 b는 같습니다.");
//}
//System.out.println(a==b);
//System.out.println(a>b);
//System.out.println(a<=b);
//System.out.println(a>=b);
//System.out.println(a<b);
//System.out.println(a!=b);

//int a = 4;
//a = a+1;
//a++;		
//++a;
//a+=1;
//a = a+2;
//a+=2;
//System.out.println(a);
//	
//int b = 2;
//b = b-1;
//b--;
//--b;
//b-=2;

//
//
//System.out.println(a+b);
//System.out.println(a-b);
//System.out.println(a*b);
//System.out.println(a/b);
//System.out.println(a%b);

//System.out.printf("%d, %d, %d",a,b,c);
//System.out.println("");
//boolean b1 = c==b;
//b = 4;
//System.out.println(b1);
//System.out.printf("%d, %d, %d",a,b,c);


//
//if(a==b) {
//	System.out.println("a와 b는 같습니다.");
//}

//String str = "123";
//System.out.println(str.length();
