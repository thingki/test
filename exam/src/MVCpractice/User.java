package MVCpractice;

public class User {
	
	private String nicName;
	private int age;
	private int no;
	
	public User(String nicname, int age, int no) {
		this.nicName = nicname;
		this.age = age;
		this.no = no;		
		
	}
	
	public User(int no) {		
		this.no= no;		
	}	
	
	public User(String nicName) {		
		this.nicName = nicName;		
	}
	
	
	
	
	public String getNicName() {
		return nicName;
	}
	public void setNicName(String nicName) {
		this.nicName = nicName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	
	
	@Override
	public String toString() {
		return "User [nicName=" + nicName + ", age=" + age + ", no=" + no + "]";
	}
	
	
	
	

}
