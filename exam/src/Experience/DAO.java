package Experience;

import java.util.ArrayList;

public class DAO {
	
	ArrayList<User> userList = new ArrayList<User>();
	

	public User findUser(int no) {
		for(User u : userList) {
			if(u.getNo() == no) {				
				return u;
			}			
		}
		return null;		
	}	
	
	public ArrayList<User> getUserList(String str){	
		if(str == null) {
			return userList;
		}
		else {
			ArrayList<User> userList = findUsers(str);
			return userList;			
		}
							
			
	}		
	
	
	
	
	
	
	
	
	
	public ArrayList<User> findUsers(String name){
		ArrayList<User> userList = new ArrayList<User>();
		for(User u : this.userList) {
			if(u.getName().indexOf(name)>-1) {				
				userList.add(u);				
			}			
		}return userList;
	}
	
	
	
	
//	public User findUser(User user) {
//		for(User u : userList) {
//			if(u.getNo() == user.getNo() && u.getBirth() == user.getBirth() && u.getName() == user.getName() 
//					&& u.getNicName() == user.getNicName() ) {				
//				return u;
//			}			
//		}
//		return null;		
//	}
	
			
	
	
	public boolean insertUser(User user) {		
		return userList.add(user);		
	}
		
	
//	public boolean removeUser(User user) {	
//		User uu = findUser(user);
//		if(uu != null){	
//			return userList.remove(uu);		
//	
//		}	
//		return false; 		
//	}
	
	public boolean removeUser(User user) {
		User uu = findUser(user.getNo());
		if(uu != null) {	
			return userList.remove(uu);									
		}		
		return false;
	}
	
	public boolean updateUser(User user) {
		User uu = findUser(user.getNo());
		if(uu != null) {			
			uu.setBirth(user.getBirth());
			uu.setName(user.getName());
			uu.setNicName(user.getNicName());
			return true;
		}		
		return false;		
	}
	
	
	
	
	

	
	
}
