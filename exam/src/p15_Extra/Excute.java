package p15_Extra;

import java.util.ArrayList;

public class Excute {
	
	
//	public static void print(Server s1) {				
//	s1.print();		
//		if( s1 instanceof Controller) {
//			((Controller)s1).print(1);
//			Controller c = (Controller)s1;
//			c.print(1);			
//		}else{			
//			s1.print();			
//		}		
//	}
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
//		User u = new User("nana", 30);
//		System.out.println(u);
//		
//		ArrayList<User> userList = new ArrayList<User>();
//		
//		userList.add(u);
//		
//		u = new User("mimi", 20);		
//		userList.add(u);
//		
//		u = new User("popo", 10);		
//		userList.add(u);
//		
//		for(User uu : userList) {
//			
//			System.out.println(uu);
//		}
		
		
		
//		DAO dao = new DAO();
//		
//		ArrayList<User> userList = dao.getUserList("");
		
		
		
		Controller c = new Controller();
		ArrayList<User> userList = c.get("List");
		
		for(User uu : userList) {			
			System.out.println(uu);			
		}
		
		
		
		
		
		
//		Server s1 = new Controller();
//		Server s2 = new Service();
//		print(s1);  // Server를 Controller로 casting 할 수 있다.
//		print(s2);  // 요기서는 Service가 Controller로 casting 할수 없다.
		
		
		
		
		
		
		
		
		
	}

}
