package jdbc_20181107;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionTest {
public static void main(String[] args) {
	//ojdbc6.jar 내에 포함된 클래스
	Connection con = null;
	try {
		//1. jdbc driver 로딩 명령
	Class.forName("oracle.jdbc.driver.OracleDriver");
	System.out.println("드라이버 로딩 완료");
	
	for(int i = 1 ; i <=100; i++) {
	
	//2. db 연결 (자바 클라이언트 - db서버)
	con = DriverManager.getConnection
			("jdbc:oracle:thin:@127.0.0.1:1521:xe", "hr", "hr");
	System.out.println(i+"번째  con 연결성공");
	}
	//3. sql 전송
	
	
	
	//4. sql 결과검색
	
	
	
	
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
