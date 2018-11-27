dml / tcl :
1. jdbc
2. sql plus
=>lock 조심하자


- dml 의 경우
Connection con = ...;
Statement st - con.createStatement();
int 변화행갯수 = st.executeUpdate(sql);

- select 의 경우
ResultSet 조회테이블 = st.executeQuery(sql);


========================================================================

String s = "select...";
PreparedStatement st = con.prepareStatement(s);
st.setxxx(index, 값);
ResultSet rs = st.executeQuery();


select id, name, pay, from emp

100		이자바		56000.77
200		홍길동		60000.66

1. 첫번째 행부터 이동 : rs.next() = t/f
2. 해당행의 컬럼들 차례로 조회 : 
	rs.getInt(1) / rs.getInt("id")
	rs.getString(2)
	rs.getDouble(3)
	===<rs.getString(1):사번의 경우 연산을 하지 않기에 보통 String으로 받음
						필요시 Integer.parseInt();
	while(rs.next()){
		int id = rs.getInt(1)
		String name = rs.getString(2)
		double sal = rs.getDouble(3)
	}
	

jdbc 자바 connection 갯수 최대치가 정해져있다

	con.....
	
	PreparedStatement st = con.prepareStatement(sql);
	st.setDouble(1, pay);
	st.setString(2, cit);
	ResultSet rs = st.executeQuery();
	//조회1
	con 해제
	
	jdbc 무관작업
	
	con.....
	PreparedStatement st = con.prepareStatement(sql);
	st.setDouble(1, pay);
	st.setString(2, cit);
	ResultSet rs = st.executeQuery();
	//조회2
	con 해제
	
connection 해제시에도 ResultSet 다시 조회하고 싶다면
배열, 컬렉션에 변경해서 저장

	
1. connection 최대 허용 갯수 제한 있다
2. 허용 갯수 내에서 조회 결과 여러번 재사용
	= 조회 결과가 con 해제 이후 사용
3. rs : db 메모리참조 => (배열, 컬렉션)자바 메모리참조
4. 메소드 단위 : con 생성 - 컬렉션 복사 - con 해제 - 컬렉션 리턴
	
	
	
DTO : DATA TRANSFER OBJECT 
VO : VAULE OBJECT (값 저장 객체)
DAO : DATA ACCESS 	
	
	
	
====================================================================

TCL
1. jdbc : auto commit(default)
2. 수동 트랜잭션 처리 가능
3. Connection : 
con.getAutoCommit(); >t/f (true 기본상태)
con.setAutoCommit(); >t/f
 => false 수동상태로 변경 

dml 1 실행
dml 2 실행
con.commit();
-------------새로운 트랜잭션 시작
dml 3 실행
dml 4 실행
con.rollback();
--------------

con.close() => 자동 commit;	
	
========================================================

계좌이체
계좌테이블
a-b 이체
-------con.setAutoCommit(false);
a출금 ok 
b입금	 x
-------con.rollback();

	
create table account(
id varchar2(20) ,
pw varchar2(10) , 
balance number(10,2));

insert into account
values ( '123-456', 'qwer', 1000);	
insert into account
values ( '456-123', 'qwer', 5000);		
	
	
update account
set balance = balance + 1000
where id = '123-456';

update accoun
set balance = balance - 1000
where id = '456-123';	
	
	
=====================================================================


java.sql.ResultSetMetaData

-desc 테이블명
1. 컬럼명
2. null 여부
3. 타입
4. 길이

키보드 : member
ResultSet rs <= select * from member;	
rs.next()
rs.getxxx()
	
ResultSetMetaData meta <= rs.getMetaData();	
int count <= meta.getColumnCount()
String name <= meta.getColumnName(1)
String type <= meta.getColumnTupeName(1)
int precision <= meta.getPrecision(1)
int null <= meta.isNullable(1)
	0 : not null
	1 : null 허용
	2 : jdbc driver 구현x, db 오픈x = 모른다
	
	
====================================================================
select * from user_tables;
select * from user_constraints;	

desc user_tables	
	
	
	
=====================================================================


jdbc ==> spring dao / mybatis
	
DTO : DATA TRANSFER OBJECT 
VO : VAULE OBJECT (값 저장 객체)
DAO : DATA ACCESS 		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	