package MVCpractice;

import java.util.ArrayList;

public class DAO {
	
	
	ArrayList<User> alUser = new ArrayList<User>();
	ArrayList<User> alUserD = alUser;
	
	public User findUser(int no) {
		for(User u : alUser) {
			if(u.getNo() == no) {
				return u;				
			}			
		}return null;		
	}

	public ArrayList<User> findUser(String nicName) {
		ArrayList<User> alUser = new ArrayList<User>();
		for(int i=0; i<alUserD.size(); i++) {
			User u = alUserD.get(i);
			if(u.getNicName().indexOf(nicName)>-1) {				
				alUser.add(u);
				alUserD.remove(u);
				i=-1;				
			}
			
			
		}return alUser;
	}
	
	
	
	
	
	
	public boolean insertUser(User user) {	
		
		return alUser.add(user);	
		
	}
	
	public boolean removeUser(User user) {	
		User u = findUser(user.getNo());
		if(u != null) {
			return alUser.remove(u);	
		}		
		return false;	
	}
	
	public ArrayList<User> getUserList(String str, User user){
		if(user == null) {
			return alUser;
		}
		else {
			ArrayList<User> alUser = new ArrayList<User>();
			alUser = findUser(user.getNicName());
			
			return alUser;			
		}
	}
	
	public boolean updateUser(User user) {	
		User u = findUser(user.getNo());
		if(u != null) {
			u.setNicName(user.getNicName());
			u.setAge(user.getAge());
			return true;			
		}		
		return	false;
	}
	
	
	
	

}
