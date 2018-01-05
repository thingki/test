package Experience;

import java.util.ArrayList;

public class Excute {
	
	
	public static void main(String[] args) {
		
		Controller c = new Controller();		
		
		User u = new User("최재열", "관종", 26, 0);		
		c.get("add", u);
		
		u = new User("김재열", "부종", 28, 1);		
		c.get("add", u);
		
		u = new User("박재희", "겅주", 29, 2);		
		c.get("add", u);
		
		u = new User("강재미", "갈갈", 29, 3);		
		c.get("add", u);
		
		u = new User("홍재코", "빨간코", 29, 4);		
		c.get("add", u);
		ArrayList<User> au = new ArrayList<User>();
		
		au = c.get("List", null );
		
//		System.out.println(au);
		
		for(User us : au) {			
			System.out.println(us);
		}
		
		User ru = new User(2);
		
		c.get("remove", ru);
		
		for(User us : au) {			
			System.out.println(us);
		}
		
		User du = new User("최재희", "핸썸", 26, 1);		
		c.get("update", du);
		
		for(User us : au) {			
			System.out.println(us);
		}
		
		User fu = new User("최재열");		
		ArrayList<User> fuA = c.get("List", fu);
		
		System.out.println(fuA);
	}

}
