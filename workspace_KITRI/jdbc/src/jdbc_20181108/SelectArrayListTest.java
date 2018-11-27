package jdbc_20181108;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class SelectArrayListTest {
	ArrayList useDB(String cit , double pay) {
		Connection con = null;
		ResultSet rs = null;
		ArrayList list= new ArrayList();
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("드라이버 로딩 완료");
		
		con = DriverManager.getConnection
				("jdbc:oracle:thin:@127.0.0.1:1521:xe", "hr", "hr");
		System.out.println("연결성공");
		
		 
		
		//키보드 입력 : seattle 5000
		//seattle 사원중 급여 5000이상인 사원
		//사번 , 성+이름 , 도시, 급여 컬럼
		
		
		String sql = "select employee_id, last_name||'-'||first_name name, city, salary" + 
				" from employees e, departments d, locations l" + 
				" where e.department_id = d.department_id" + 
				" and d.location_id = l.location_id" + 
				" and salary>= ? " + 
				" and city = initcap(?)";
		
		PreparedStatement st = con.prepareStatement(sql);
		st.setDouble(1, pay);
		st.setString(2, cit);
		rs = st.executeQuery();
		
		
		
		int cnt = 0;
		while(rs.next()) { //레코드*4
			int id = rs.getInt("employee_id");
			String name = rs.getString("name");
			String city = rs.getString("city");
			double salary = rs.getDouble("salary");
			
			list.add(id);
			list.add(name);
			list.add(city);
			list.add(salary);
			
		
			//System.out.println
			//(id+":"+name+":"+city+":"+salary);
			cnt++;
		}
		
		System.out.println(cnt+" rows selected.");
		

		rs.close();
		st.close();
		
		
		
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException e) {
			System.out.println("연결정보확인!!!");
			System.out.println(e.getMessage());
		}finally {
			try {
				con.close(); 
			} catch (SQLException e) {  }
			System.out.println("연결해제성공");
		}
		return list;
	}
public static void main(String[] args) throws SQLException {
	SelectArrayListTest t = new SelectArrayListTest();
	
	System.out.println("===city salary===");
	Scanner sc = new Scanner(System.in);
	
	String cit = sc.next();
	double pay = sc.nextDouble();
	
	ArrayList list = t.useDB(cit, pay);
	
	for(Object o : list) {
		System.out.println(o);
	}
	
}
}
