
http 프로토콜 구현 사용 자바 프로그램 >> servlet
tcp socket 생성 - 해제 구현이 내부적으로 되어있다.
이미 멀티쓰레드가 적용되어있어 구현할 필요 없다.


서버 : CartServer + Cart
클라이언트로부터 입력
클라이언트로 출력 ( 삼성마우스 3개 저장 완료)
Cart 객체 생성
컬렉션 저장
5개 or stop 중단

총가격 출력

클라이언트 : CartClient
100 삼성마우스 1000 3 키보드 입력
5개 또는 stop 중단 - 서버로 출력
(서버처리)
서버로부터 입력 모니터 출력

===================================================================



tcp : 전화
1. 연결 요청 - 연결 수락
2. 입출력 - 출력(입력) / 입력(출력)
3. 연결 close

udp : 우편 (대용량 문자 한번에 발송 > 통신회선x) / 비연결지향적
1. 출력데이터 + 보내는 컴퓨터 (IP,PORT) + 받는 컴퓨터 (IP,PORT)
2. 입력데이터 분석 
3. 메세지 순서 없다 / 보내는 측에서는 받는 측에서 받았는지 확인x : 신뢰할 수 없는 통신


====================================================================

- jdbc!!!!!!

JAVA DATABASE CONNECTIVITY
자바프로그램에서 DB 이용 프로그램

영구적 데이터 저장장치 : FILE , DB 
파일 : 확장자에 따라 다양한 포맷문제 
	TXT 문자 내부의 구조를 정형화 할 수 없다.  
	정형화 포맷X, PATTERN 입력
	
RDB : 1가지 형태 / 테이블 형태
	행 / 열
	
자바 --> DB 저장 -- > C, C++, 자바 / 확장성이 좋다

1. 영구적 저장
2. 정형화된 포맷
3. 확장성 

---------------------------------------------------------------------

- java.sql.*

-java.sql.인터페이스들 : 다중상속 , 메소드 구현x
	> 자바 모든 db 다르게 구현 / 공통 기능 포함

-ORACLE 접속 라이브러리 로딩 호출해야 ORACLE 접속 허용
	=>(oracle 11g jdbc driver 설치가 필요하다!)
<오라클> 오라클 db 맞도록 구현 클래스 : 인터페이스 상속 규칙k (oracle 11g jdbc driver)
<mysql> mysql db 맞도록 구현 클래스 : 인터페이스 상속 규칙

JDBC 프로그램
1. jdbc driver 로딩 (설치완료 후)
2. db 연결
----------------loop
3. sql 전송
4. sql 실행결과 검색
----------------loop
5. db 연결해제

oracle - download - java / db
-------------------------------------------------------
C:\oraclexe\app\oracle\product\11.2.0\server\jdbc\lib
ojdbc5 - jdk 1.5버전 까지
ojdbc6_g 디버깅 포함

C:\Program Files\Java\jdk1.8.0_181\jre\lib\ext

jdk 1.8 이니까 ojdbc6 
복사해서 붙여 넣는다
-------------------------------------------------------

필수 api
java.sql.DriverManager 드라이버 호출
	getConnection("db종류:ip:port:이름", "id", "pw");
	"jdbc:oracle:thin@127.0.0.1:1521:xe"
java.sql.Connection db 연결
	close()
	createStatement() / PrepareStatement(sql)
java.sql.Statement / java.sql.PreparedStatement
	executeUpdate(sql) / executeUpdate()
java.sql.ResultSet

====================================================================
package jdbc_20181107;

import java.sql.DriverManager; 
import java.sql.Connection; 
import java.sql.SQLException; 

public class ConnectionTest {
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
====================================================================

		자바				오라클
-------------------------------------
정수		int				number(n)
실수		double			number(n,s)
날짜		java.sql.Date	date
문자열		String			varchar2(n)
-------------------------------------


자바에서 jdbc ddl 작업은 하지 않는게 좋다!!!!!
dcl 이론적으로 가능(system/1234) but 사용하지 않는것이 좋다
tcl : jdbc 프로그램 dml 자동 commit
	(수동 commit 변경 가능)
	sql plus / developer : dml 수동 commit / rollback

==========================================================
<자바>
String s = "select * emp where id = 100";
Statement st = con.createStatement();
int r = st.executeUpdate(s);

<jdbc driver - oracle>
1. sql 구문 분석(parsing)
2. 컴파일
3. 실행(100)

<자바>
String s2 = "select * emp where id = 200";
Statement st2 = con.createStatement();
int r2 = st2.executeUpdate(s2);

<jdbc driver - oracle>
1. sql 구문 분석(parsing)
2. 컴파일
3. 실행(200)
=======================================================변경후
<자바>
String s = "select * emp where id = ?";
PreparedStatement st = con.prepareStatement(s);
st.setInt(1,100);
int r = st.executeUpdate();
st.setInt(1,200);
int r2 = st.executeUpdate();

<jdbc driver - oracle>
1. sql 구문 분석(parsing)
2. 컴파일
3. 2번결과물 임시 저장(caching)
4. 실행(100)
5. 실행(200)

insert into emp values(100,'이자바',sysdate)
=>insert into emp values(?,?,?)


================================================================

mybatis 자바기술 = jdbc 또다른 형태




















