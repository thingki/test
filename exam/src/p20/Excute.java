package p20;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class Excute {
	
	public static void setHm(LinkedHashMap<String, Object> hm) {		
		
		hm.put("ciname", "명훈이반");
		hm.put("cidescr", "담배");		
	}
	
	
	
	
	public static void print(ArrayList<HashMap<String,Object>> classList) {
		
//		System.out.println(classList);
		
		for(HashMap<String,Object> cl : classList) {			
			System.out.println(cl);
		}
		
	}
	
	public static void main(String[] args) {
		
		Service s = new Service();	
		LinkedHashMap<String, Object> hm ;
//		= new LinkedHashMap<String, Object>();
//		hm.put("cidescr", "네트워크보안반");
//		hm.put("cino", 3);	
		
//		int result = s.updateClassInfo(hm);		
//		if(result == 1 ) {			
//			System.out.println("업데이트 잘됬음!");
//		}
		
//		hm = new LinkedHashMap<String, Object>();
//		setHm(hm);
//		
//		hm = new LinkedHashMap<String, Object>();
//		setHm(hm);	
//		
//		s.insertClassInfo(hm);		
		
		
//		hm = new LinkedHashMap<String, Object>();
//		hm.put("a", 17);
		
		
		

//		s.removeClassInfo(hm);
		

//		hm = new LinkedHashMap<String, Object>();
			
//		System.out.println("");
//		
//		hm = new LinkedHashMap<String, Object>();
//		hm.put("ciname", "정보보안");


		
		
		

		
		ArrayList<HashMap<String,Object>> classList = s.getClassList();
		print(classList);
//		
//		System.out.println("");
//		
//		hm = new LinkedHashMap<String, Object>();
//		hm.put("ciname", "정보보안");		
//		
//		ArrayList<HashMap<String,Object>> findDataa = s.getList(hm);
//		print(findDataa);
		
		
		
		
		
		
		
//		hm = new LinkedHashMap<String, Object>();
//		hm.put("cino", 7);
//		s.removeClassInfo(hm);
//		
//		int removeResult = s.removeClassInfo(hm);		
//		if(removeResult == 2 ) {			
//			System.out.println("잘지워졌음! 잘됬음!");
//		}
		
	}






	
}
