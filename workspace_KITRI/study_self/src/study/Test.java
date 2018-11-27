package study;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Test {
	
	public ArrayList selectsql() {
		ArrayList list = new ArrayList();
		Connection con = null;
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("드라이버 로딩 완료");
		
		con = DriverManager.getConnection
				("jdbc:oracle:thin:@127.0.0.1:1521:xe", "hr", "hr");
		System.out.println("연결 성공");
		
		
		String sql = "select * from departments";
		
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(sql);
		
		while(rs.next()) {
			int deptid = rs.getInt("department_id");
			String name = rs.getString("department_name");
			int manager = rs.getInt("manager_id");
			int location = rs.getInt("location_id");
			
			list.add(deptid);
			list.add(name);
			list.add(manager);
			list.add(location);
			
		}
		
		
		st.close();
		rs.close();
		
		}catch(ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}finally {
			try {
			con.close();
			System.out.println("해제성공");
			}catch(SQLException e){
				System.out.println(e.getMessage());
			}
		}
		
		return list;
		
	}//method end
	
	
	public static void main(String[] args)  {
		
		/*Test t = new Test();
		
		ArrayList list = t.selectsql();
		for(Object obj : list) {
			System.out.println(obj);
		}*/
		
		
		String a = "0";
		Integer b = 0;
		System.out.println(a.equals(b.toString()));
				
		
	}
}
