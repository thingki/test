package p20;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class Service {
	
	DBCon dbcon;
	Service(){
		dbcon = new DBCon();		
	}	
	
	public int updateClassInfo(LinkedHashMap<String, Object> hm) {
		
		int result = 0;		
		String sql = "update class_info \r\n" + 
				"set cidescr = ?\r\n" + 
				"where cino = ?";		
		try {			
			result = dbcon.executeUpdate(sql, hm);
			dbcon.commit();
		} catch (SQLException e) {		
			try {
				dbcon.rollback();
			} catch (SQLException e1) {				
				e1.printStackTrace();
			}
			e.printStackTrace();
		}finally {			
			try {
				dbcon.closeAll();
			} catch (SQLException e) {				
				e.printStackTrace();
			}
		}		
		return result;		
	}
	
	public ArrayList<HashMap<String,Object>> getClassList (){
		String sql = "select * from class_info";	
		ArrayList<HashMap<String,Object>> classList = null;
		try {
			classList = dbcon.executeQuery(sql, null);
		} catch (SQLException e) {			
			e.printStackTrace();
		} finally {
			try {
				dbcon.closeAll();
			} catch (SQLException e) {				
				e.printStackTrace();
			}			
		}		
		return classList;
	}
	
	
	
	public ArrayList<HashMap<String,Object>> getList (LinkedHashMap<String,Object> hm){
		String sql = "select * from class_info\r\n" + 
				"where ciname = ?;";
		ArrayList<HashMap<String,Object>> resultList = null;
		try {
			resultList = dbcon.executeQuery(sql, hm);
		} catch (SQLException e) {			
			e.printStackTrace();
		} finally {
			try {
				dbcon.closeAll();
			} catch (SQLException e) {				
				e.printStackTrace();
			}			
		}		
		return resultList;
	}
	
	
	public int removeClassInfo(LinkedHashMap<String, Object> hm) {
		int result = 0;
		String sql = "delete from class_info\r\n" + 
				"where cino = ?";
		try {
			result = dbcon.executeUpdate(sql, hm);
			dbcon.commit();
		} catch (SQLException e) {			
			e.printStackTrace();
			try {
				dbcon.rollback();
			} catch (SQLException e1) {				
				e1.printStackTrace();
			}
		}finally {
			try {
				dbcon.closeAll();
			} catch (SQLException e) {				
				e.printStackTrace();
			}			
		}		
		return result;		
	}

	public int insertClassInfo(LinkedHashMap<String, Object> hm) {
		
	
		
		int result = 0;		
		String sql = "insert into class_info(ciname, cidescr)\r\n" + 
				"values(?,?);";
		try {
			result = dbcon.executeUpdate(sql, hm);
			dbcon.commit();
		} catch (SQLException e) {			
			e.printStackTrace();
			try {
				dbcon.rollback();
			} catch (SQLException e1) {				
				e1.printStackTrace();
			}
		}finally {
			try {
				dbcon.closeAll();
			} catch (SQLException e) {				
				e.printStackTrace();
			}			
		}		
		return result;	
	}
	
	
		
		
	

}
