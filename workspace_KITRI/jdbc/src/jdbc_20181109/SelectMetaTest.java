package jdbc_20181109;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class SelectMetaTest {
public static void main(String[] args) {
	Connection con = null;
	try {
	Class.forName("oracle.jdbc.driver.OracleDriver");
	System.out.println("드라이버 로딩 완료");
	
	con = DriverManager.getConnection
			("jdbc:oracle:thin:@127.0.0.1:1521:xe", "hr", "hr");
	System.out.println("con 연결성공");
	
	
	
	
	
	
	Scanner sc = new Scanner(System.in);
	System.out.println("테이블명을 입력하세요");
	String tablename = sc.nextLine();
	
	String sql = "select * from " + tablename ;
	
	Statement st = con.createStatement();
	ResultSet rs = st.executeQuery(sql);
	
	ResultSetMetaData meta = rs.getMetaData();
	
	
	//컬럼명 : null여부 : 타입 (길이)
	
	int count = meta.getColumnCount();
	for(int i = 1; i<=count; i++) {
		String colName = meta.getColumnName(i);
		int isNull = meta.isNullable(i);
		String isNullString = "";
		if(isNull == 0) {
			isNullString = "NOT NULL";
		}else if(isNull == 1) {
			isNullString = "NULL 허용";
		}else {
			isNullString = "알 수 없음";
		}
		String typeName = meta.getColumnTypeName(i);
		int size = meta.getPrecision(i);
		
		System.out.println(colName +":"+ isNullString +":"+ typeName +"("+ size +")");
		
	
	}
	
	
	rs.close();
	st.close();
	sc.close();
	
	}catch(ClassNotFoundException e) {
		e.printStackTrace();
	}catch(SQLException e) {
		System.out.println("연결정보확인!!!");
		System.out.println(e.getMessage());
		e.printStackTrace();
	}finally {
		try {
			con.close();
		} catch (SQLException e) {  }
		System.out.println("연결해제성공");
	}
	
}
}
