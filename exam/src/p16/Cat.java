package p16;

public class Cat extends Animal{


	
	
	public Cat(String name, int age, int height) {
		this.name = name;
		this.age = age;
		this.height = height;		
	}

	
	
	public void eat() {
		
		System.out.println(name + "먹습니다.");
		
	}
	
	public void sleep() {
		
		System.out.println(name + "잡니다.");
		
	}

	
	public void walk() {
	
		System.out.println(name + "겁습니다.");
	
	}
	

}
