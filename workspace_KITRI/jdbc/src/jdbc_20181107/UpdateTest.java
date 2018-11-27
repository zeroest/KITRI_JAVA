package jdbc_20181107;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class UpdateTest {
public static void main(String[] args) {
	//ojdbc6.jar 내에 포함된 클래스
	Connection con = null;
	try {
		//1. jdbc driver 로딩 명령
	Class.forName("oracle.jdbc.driver.OracleDriver");
	System.out.println("드라이버 로딩 완료");
	
	//2. db 연결 (자바 클라이언트 - db서버)
	con = DriverManager.getConnection
			("jdbc:oracle:thin:@127.0.0.1:1521:xe", "hr", "hr");
	System.out.println("연결성공");
	
	//3. sql 전송
	//3-1. sql 정의
	//키보드입력 :  IT_PROG 80 4001
	
	Scanner sc = new Scanner(System.in);
	
	String toid = sc.next();
	String id = sc.next();

	String sql = 
			//"insert into 테이블명(컬럼명,,,,) values(값,,,)";
/*
"update employees"
+" set job_id = '"+job+"',"
+" department_id = "+dept
+" where employee_id = "+id;*/
			
"update employees"
+" set (department_id , job_id, hire_date) in (select department_id , job_id, hire_date from employees where employee_id = )"+toid
+" where employee_id = "+id;

	//3-2. con 연결 db로 전송 sql 저장 객체
	Statement st = con.createStatement();
	//3-3. sql 연결 전송(실행요청)
	int rowcount = st.executeUpdate(sql);
	
	//4. sql 결과검색
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
