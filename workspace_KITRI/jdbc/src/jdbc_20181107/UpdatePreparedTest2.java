package jdbc_20181107;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdatePreparedTest2 {
public static void main(String[] args) {
	Connection con = null;
	try {
	Class.forName("oracle.jdbc.driver.OracleDriver");
	System.out.println("드라이버 로딩 완료");
	
	con = DriverManager.getConnection
			("jdbc:oracle:thin:@127.0.0.1:1521:xe", "hr", "hr");
	System.out.println("연결성공");
	
	/*PreparedStatement 이용
	키보드 입력 : kelly
	first_name kelly 인 사원과 같은 입사월에 입사한
	사원의 급여를 10% 인상*/
	
	/*update employees
	set salary = salary*1
	where to_char(hire_date, 'mm') =
	(select to_char(hire_date, 'mm')
	from employees
	where first_name = 'Kelly'));*/
	
	Scanner sc = new Scanner(System.in);
	
	String name = sc.nextLine();

	String sql = 
			
"update employees set salary = salary*1	where to_char(hire_date, 'mm') ="
+ " (select to_char(hire_date, 'mm')"
+ " from employees where first_name = initcap(?))";

	PreparedStatement st = con.prepareStatement(sql);
	st.setString(1, name);
	int rowcount = st.executeUpdate();
	
	System.out.println("수정된행의 갯수 = "+rowcount);
	
	
	sc.close();
	
	}catch(ClassNotFoundException e) {
		e.printStackTrace();
	}catch(SQLException e) {
		System.out.println("연결정보확인!!!");
		System.out.println(e.getMessage());
	}finally {
		//예외발생 - try중단 - catch이동
		//5. 연결해제, 파일 close 소켓 close
		try {
			con.close(); //상황에 따른 문제 / 자바의 문제가 아니다
		} catch (SQLException e) {  }
		System.out.println("연결해제성공");
	}
	
}
}
