package MVCpractice;

import java.util.ArrayList;

public class Excute {
	
	public static void main(String[] args) {
		
		Controller c = new Controller();
		
		ArrayList<User> alUser = c.get("List", null);
		
		User mu = new User("노답", 26, 0);
		c.get("add", mu);
		
		mu = new User("관종", 12, 1);
		c.get("add", mu);
		
		mu = new User("뻐드렁", 15, 2);
		c.get("add", mu);
		
		mu = new User("관종", 12, 3);
		c.get("add", mu);
		
		mu = new User("관종", 12, 4);
		c.get("add", mu);
		
		mu = new User("관종", 12, 5);
		c.get("add", mu);
		
		for(User pu : alUser) {			
			System.out.println(pu);			
		}
		
		mu = new User(2);
		c.get("remove", mu);		
		
		for(User pu : alUser) {			
			System.out.println(pu);			
		}
		
		mu = new User("알고보니 천재", 27, 0);
		c.get("update", mu);
		
		for(User pu : alUser) {			
			System.out.println(pu);			
		}
		System.out.println();
		
		mu = new User("관종");		
		
		ArrayList<User> alUser2 = c.get("List", mu);
		
		for(User pu : alUser2) {			
			System.out.println(pu);			
		}
		
		
		
		
	}

}
