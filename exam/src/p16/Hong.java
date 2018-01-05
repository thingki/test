package p16;

public class Hong extends Person{
	
	public Hong(String name, int age, int height, String email) {
		
		this.name = name;
		this.age = age;
		this.height = height;
		this.email = email;		
		
		
	}
	
	public void eat() {
		
		System.out.println("밥먹기 시름");
		
	}
	
	public void eat(String spam) {
		
		System.out.println("스펨 줘랑");  // Excute에 Action을 기반으로 생성자를 만들었기에 불가능하다.
										// Hong을 기반으로 생성자를 만들어야된다.
		
	}
	
	
}
