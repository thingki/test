package Experience;

public class User {
	
	private String nicName;
	private String name;
	private int birth;
	private int no;
	
	public User(String name, String nicName, int birth, int no) {
		this.name = name;
		this.nicName = nicName;
		this.birth = birth;
		this.no = no;
		
	}
	
	public User(int no) {		
		this.no = no;
		
	}
	
	public User(String name) {		
		this.name = name;
		
	}
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getNicName() {
		return nicName;
	}
	public void setNicName(String nicName) {
		this.nicName = nicName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBirth() {
		return birth;
	}
	public void setBirth(int birth) {
		this.birth = birth;
	}

	@Override
	public String toString() {
		return "User [nicName=" + nicName + ", name=" + name + ", birth=" + birth + ", no=" + no + "]";
	}
	
	
	
	
	
	
	
	

}
