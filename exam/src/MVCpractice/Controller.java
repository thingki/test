package MVCpractice;

import java.util.ArrayList;

public class Controller {
	
	public Service service;
	
	public Controller() {		
		service = new Service();			
	}
	
	
	public ArrayList<User> get(String command, User user) {
		
		if(command.equals("List")) {			
			return getUserList(command,user);			
		}
		
		else if(command.equals("add")) {
			boolean isOk = insertUser(user);
			if(isOk) {				
				System.out.println(user.getNicName() + " add 됬음!");				
			}else {				
				System.out.println(user.getNicName() + " add 실패!");				
			}			
			
		}		
		else if(command.equals("remove")) {
			boolean isOk = removeUser(user);
			if(isOk) {				
				System.out.println(user.getNo() +"번  " + " remove 됬음!");				
			}else {
				System.out.println(user.getNo() +"번  "+ " remove 실패!");					
			}			
		}
		else if(command.equals("update")) {
			boolean isOk = updateUser(user);
			if(isOk) {
				System.out.println(user.getNo()+ "변이 " + user.getNicName() + "으로 update 됬음!");				
			}else {
				System.out.println(user.getNicName() + "으로 update 됬음!");				
			}			
		}		
		return null;		
	}
	
	
		
	public boolean insertUser(User user) {		
		return service.insertUser(user);		
	}
	
	public boolean removeUser(User user) {		
		return service.removeUser(user);		
	}
	
	public ArrayList<User> getUserList(String str, User user){		
		return service.getUserList(str, user);		
	}
	
	public boolean updateUser(User user) {		
		return service.updateUser(user);		
	}
	
	
	
	
	
	
	
	
	

}
