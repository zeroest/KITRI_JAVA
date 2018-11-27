package jdbc_20181107;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertPreparedTest {
public static void main(String[] args) {
	//ojdbc6.jar 내에 포함된 클래스
	Connection con = null;
	try {
	Class.forName("oracle.jdbc.driver.OracleDriver");
	System.out.println("드라이버 로딩 완료");
	
	con = DriverManager.getConnection
			("jdbc:oracle:thin:@127.0.0.1:1521:xe", "hr", "hr");
	System.out.println("연결성공");
	
	
	//키보드입력 : 4003 홍3 hong3@a.com IT_MAN 100
	
	Scanner sc = new Scanner(System.in);
	int id = sc.nextInt();
	String name = sc.next();
	String email = sc.next();
	String job = sc.next();

	java.sql.Date now = 
		new java.sql.Date(new java.util.Date().getTime());
	
	String sql = 
"insert into employees"
+ " (employee_id, last_name, email, hire_date, job_id) "
+ " values(?,?,?,?,?)";

	
	PreparedStatement st = con.prepareStatement(sql);
	//sql 입력 파라미터값 세팅
	st.setInt(1, id);
	st.setString(2, name);
	st.setString(3, email);
	st.setDate(4, now);
	st.setString(5, job);
	
	int rowcount = st.executeUpdate();
	
	System.out.println("삽입행의 갯수 = "+rowcount);
	
	
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
