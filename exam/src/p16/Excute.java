package p16;

public class Excute {
	
	
	
	public void printAction(Action act) {
		
		act.eat();
		act.sleep();
		act.walk();
		
	}
	
	public static void main(String[] args) {
		
//		Person p = new Hong("Hong", 20, 180, "hong@gmail.com"); 
		Action act = new Hong("Hong", 20, 180, "hong@gmail.com"); //인터페이스 이후로 Action을 기반으로 생성자를 생성할 수 있다. 
		Hong h = new Hong("Hong", 20, 180, "hong@gmail.com");
//		System.out.println(p);
//		((Hong)p).eat("");
//		p.sleep();
//		p.walk();		
		Excute e = new Excute();
		e.printAction(h);
		Cat c = new Cat("고양이", 3, 100);
		e.printAction(c);
		
		
		
		
		
	}
}
