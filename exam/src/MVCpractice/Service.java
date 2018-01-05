package MVCpractice;

import java.util.ArrayList;

public class Service {
	
	
	public DAO dao;
	
	public Service() {		
		dao = new DAO();		
	}
	
	
	
	
	
	public boolean insertUser(User user) {		
		return dao.insertUser(user);		
	}
	
	public boolean removeUser(User user) {		
		return dao.removeUser(user);		
	}
	
	public ArrayList<User> getUserList(String str, User user){		
		return dao.getUserList(str, user);		
	}
	public boolean updateUser(User user) {		
		return dao.updateUser(user);		
	}
	
	

}
