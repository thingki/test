package Experience;

import java.util.ArrayList;

public class Controller {
	
	public Service service;
	
	public Controller() {		
		service = new Service();		
		
	}
	
	
	
	
	
	
	public ArrayList<User> get(String command, User user) {
		if(command.equals("List")) {			
			if(user == null) {
				return getUserList(null);			
			}return getUserList(user.getName());
		}
		
		else if(command.equals("add")) {
			boolean isOk = insertUser(user);
			if(isOk) {				
				System.out.println(user.getName()+ "추가됬슘");				
			}
			else {				
				System.out.println("add 잘못됨");				
			}			
		}
		
		else if(command.equals("remove")) {
			boolean isOk = removeUser(user);
			if(isOk) {				
				System.out.println(user.getNo()+ "번 지워졌슘");					
			}			
			else {				
				System.out.println("remove 잘못됨");	
			}
			
		}
		
		else if(command.equals("update")) {
			boolean isOk = updateUser(user);
			if(isOk) {				
				System.out.println(user.getNo()+ "번 수정했슘");
			}
			else {				
				System.out.println("update 실패함 ㅋ");	
			}			
		}
		return null;		
		
	}
	
	
	
	
	public ArrayList<User> getUserList(String str) {		
		return service.getUserList(str);		
	}
			
	public boolean insertUser(User user) {		
		return service.insertUser(user);		
	}
	
	public boolean removeUser(User user) {		
		return service.removeUser(user);		
	}
	
	public boolean updateUser(User user) {		
		return service.updateUser(user);		
	}
	
	

}
