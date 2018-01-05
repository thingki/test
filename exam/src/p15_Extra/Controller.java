package p15_Extra;

import java.util.ArrayList;

public class Controller extends Server {
	
//	public void print() {
//		super.print();
//		System.out.println("그리고 컨트롤도 담당합니다. ");
//		
//	}
//	
//	public void print(int a) {
//		
//		super.print();
//		System.out.println("그리고 숫자도 출력합니다. :" + a);
//		
//		
//	}
	
	private Service service;
	
	public Controller() {		
		service = new Service();		
	}
	
	public ArrayList<User> get(String command) {
		
		if(command.equals("List")) {
			
			return getUserList("");
			
		}else if(command.equals("add")) {						
			
		}
		return null;			
	}
	
	
	
	public ArrayList<User> getUserList(String str){		
		return service.getUserList(str);		
	}
	
	public boolean insertUser(User user) {		
		return service.insertUser(user);		
	}
	
	public boolean removeUser(User user) {		
		return service.removeUser(user);		
	}
	

}
