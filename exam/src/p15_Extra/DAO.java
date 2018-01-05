package p15_Extra;

import java.util.ArrayList;

public class DAO {
	
	ArrayList<User> userList = new ArrayList<User>();
	
	public boolean insertUser(User user) {		
		return userList.add(user);		
	}
	
	public boolean removeUser(User user) {		
		return userList.remove(user);		
	}	
	
	
	public ArrayList<User> getUserList(String str) {
		
//		User u = new User("nana", 30);	
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
//		u = new User("koko", 8);		
//		userList.add(u);
		
		return userList;
		
	}
}
