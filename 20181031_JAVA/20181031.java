11장 기본 api : 자주 사용, 데이터 타입, Object...

java.lang.*
1. Object
	-별도 import 필요 없다. =>java.lang.* 모든 클래스
	-별도 상속 extends 필요 없다
	-자바 상속구조 최상위 root클래스
	-Object (non-private) 모든 메소드(변수 없다) : 다른 클래스 사용 가능
	-메소드 오버라이딩 1 equals 2 toString
	
	자바객체 동등성 비교 연산자 : == 객체주소
	
	Object
	
	
	class String extends Object{
		equals() : 오버라이딩(원래 주소 비교=>문자열 비교)
	}
	-----------------------------------------	
	s2=s1; thin clone
	s2=s1.clone(); deep clone
	-----------------------------------------
	
	finalize() : 오버라이딩 정의 " 자동" g/c
	
	class Member{
		A a; = new A();
		
		void finalize(){
			al = null;
		}
	}
	class main{
		...
		Member m = new Member();
		m=null; => 필요없다
	}
	----------------------------------------------
	
	System : 자바 프로그램 실행 컴퓨터 시스템 정보 / 하드웨어 출력 (모든 메소드 static)
	
	class System{
		printStream out = 모니터연결변수
		InputStream in = 키보드연결변수
		gc(){ g/c 요청 but "즉각적으로 반응하지 x"}
		exit(){프로그램 종료}
		currentTimeMillis(){1/1000초 단위}
		getProperty()
	}
	
	class PrintStream{
		println()
	}
	
	
	System.out.println(obj);
	System.in.read();
	---------------------------------------------------
	
	Class 클래스 정보 제공 클래스
	
	-존재여부, 변수, 메소드, 생성자 정보 얻어올 수 있다.
	-라이브러리 도움말 자바 구현
	
	
==================================================================	
	
2. String / StringTokenizer / StringBuffer
<문자열 자주 사용 기능>
	1. new 연산자 없이도 문자열 메모리 저장
	2.String 객체 내용 불변 : 고정
	

	-문자열 취급 조작 기능 구현 클래스
	String : 가장 일반 문자열 기능
		생성자 : 생성자 오버로딩
		변수 : 1개 > 대소문자 연관변수
		메소드 : 
		대소문자변경 : toUpperCasem, toLowerCase
		문자열 내용 동등성 비교 : equals ( equalsIgnoreCase )
		문자열 길이 : length()
	
	String s2 = "servletjsp";
	sop(s2.replace("jsp","spring")); //serveletspring
	sop(s2); // "servletjsp";
	
	
	StringTokenizer : 문자열 분리 기능
		문자열 분리 기능(배열로 결과물을 받아온다) : String split() 
		문자열 문리 기능만 : StringTokenizer
	
	StringBuffer : 문자열 + 버퍼 (문자열 길이 변경 가능) =StringBuilder
	
	StringBuffer sb = new StringBuffer("java", 10);
	sb.append("program"); => "javaprogram"
	heap 영역에 java와 함께 10개의 추가 메모리를 함께 저장
	따라서 주소값 변화 없이 program을 추가로 저장할 수 있다.
	자바가 스스로 버퍼공간을 추가로 확보한다
	(+연산자 : heap 영역에 메모리가 점점 쌓여갈것 따라서 자주 바뀌는 문자열은 StringBuffer로 저장하자!)
	sb.reverse();



3. System
4. Class
5. Date
6. SimpleDateFormat / DecimalFormat

=====================================================================
regular expression 정규표현식
-정규표현식개념(html5, javascript : 졍규표현식)

"javaprogram".indexof("java") : 0 / -1



//정규표현식
포함내용들			횟수					
[A-Za-z0-9]		{1}					+ : 1개이상
\w 위와같다		{1,} 1개이상 = +		* : 0개이상
[0-9]=\d		{3,6} 3개이상 6개이하	\w: 숫자 알파벳
				{0,} = *			\d: 숫자
									
									
									
									
									
"3~10자리아상영문@5자리아상영문.com" = 문자 형식지정하고 싶다!!!
						= 변수 내용이 이메일 양식표현에 맞는지 확인
String reg = "[a-zA-Z]{3,10}@\\w+.(com|co.kr)";
String email = "aaaa@kitri.com";
Pattern.matches(reg, email);

java.util.regex.Pattern

==================================================================

wrapper클래스 포장 클래스 개념

int i = 10;
int j = 20;
i+j;
String s = "20";
i+Integer.parseInt(s); 30

1. 산술연산 덧셈 연산자 제공
2. String > int 연산자 x : 기능 구현 : 메소드 = 클래스정의

기본형변수 연산자 제공 기능
기본형변수 연산자 제공 x : 미리 구현 제공 클래스 = 포장클래스

기본형변수			클래스타입변수
boolean			java.lang.Boolean
char			Character
byte			Byte
short			Short
int 			Integer
long			Long
float			Float
double			Double

10진수 2진수로 변경
Integer.toBinaryString(-100) 메소드사용

//jdk 1.5 이후 : auto unboxing / boxing
int i = new Integer(100); //unboxing 객체형태를 기본형변수로 변경
Integer i = 100; //boxing 기본형변수를 객체형태로 변환


















