7장 상속
객체타입변환규칙
1.인터페이스 구현 클래스 / 상위 클래스 상속 하위 클래스 상속관계 객체들
2. 자동형변환
	상위인터페이스 변수명 = new 하위객체();
	상위클래스 변수명 = new 하위객체();
	abstract 상위 클래스 변수명 = new 하위객체();
	
3. 자동형변환된 다음에 접근 영역
	상위 클래스 변수명 = new 하위객체();
	변수명.필드변수 > 상위클래스
	변수명.non-overriding메소드 > 상위클래스
	변수명.overriding메소드 > 하위클래스
	
	상위 인터페이스 변수명 = new 하위객체();
	변수명.(모든)overriding메소드 > 하위클래스
	인터페이스명.필드변수
	
4. 하위클래스 객체 내부 필드변수나 메소드 접근 필요: 명시적 형변환
	자동형변환되었다가 다시 원래 타입 복원
	상위클래스 변수명1 = new 하위객체();
	하위클래스 변수명2 = (하위클래스명)변수명1;
	변수명2.필드변수
	변수명2.메소드
	
5. instanceof (boolean)
	변수명 instanceof 클래스명 > 변수는 클래스타입 객체 참조할 수 있나
	
	abstract메소드: 메소드선언부+메소드구현부x
	abstract클래스: abstract메소드 1개이상 포함 클래스
	>상속으로 제한하여 사용, 반드시 구현 내용 명세
	>서로 다른 객체에 공통 기능 필요 (기능 서로 다르다)

8장 인터페이스

interface I{
	[public static final] 변수;
	[public abstract] void m1();
	void m2();
}//기본 생성자 없다

interface I2{
	void m2();
}

class AI implements I,I2{ // 다중 상속가능
	void m1(){}
	void m2(){}
}
	
1. 다중상속
2. 모든 메소드 추상 메소드
3. 생성자 없다.
4. static final 변수
5. 객체 형변환 규칙

형변환 필요
1. 필드변수 다양 객체 포함 필요
2. 메소드 매개변수 다양 객체 필요
3. 배열 다양 객체 필요
===> 객체 타입 다양> 통일시키기 위해!!!

interface J{mj();}
interface I extends J,...{mi();}
class A{ma(){}}
class B extends A implements I{
	
	mi(){} overriding
	mj(){} overriding
	
}
extends 확장 연장 추가
implements 구현하다.
상위인터페이스 - 하위인터페이스 상속 : extends!!! 다중상속 가능
상위인터페이스 - 하위클래스 상속(=구현) : implements 다중상속
상위클래스 - 하위클래스 상속 : extends 단일상속
상위클래스 - 하위인터페이스 상속 : 존재할 수 없다.
class C{mc(){구현}}
interface CI extends C{mc(){구현}} => XXX

jdk 1.8 버전 이후 인터페이스 추가 변경 문법
interface 이름{
	public static final 변수
	생성자 없다.
	public abstract 메소드();
	***
	default void 이름(){구현문장;}
	
}


interface Inter{
	void m1();
	default void m2(){
		sop("m2");
	}
}

class A implements Inter{
	void m1(){sop("A");}
	//m2 선택적 오버라이딩
}
	
class B implements Inter{
	void m1(){sop("b");}
	//m2 선택적 오버라이딩
}


-객체지향언어
1. 캡슐화(=클래스) = 은닉데이터 + 공개기능묶음 (private~public)
2. 상속-inheritance / 단일,다중상속
3. 다형성-polymorphism / 1개 이름 - 여러가지 유형 결과 (overriding, overloading)
4. 객체간의 형변환 A a1=new (A하위객체들) / (A상위클래스명)a2=new A();

==============================================================


9장 중첩 클래스 / 중첩 인터페이스 : 클래스 내부에 또다른 클래스 포함

class A 

	class C implements Runnable{

		public void run() {
			System.out.println("run실행중");
		}
		
	}
	
	class B extends P{}
	class D extends Q{}
=================>


	

	
	
class A extends P,Q implements Runnable

		public void run() {
			System.out.println("run실행중");
		}
		
================================================================

자바언어 프로그램 종류
1. 웹서버 내부 동작 웹브라우저 결과 출력 자바 프로그램 : jsp, servlet, spring
2. 모바일 환경 스마트폰 앱 출력 : 안드로이드
3. 자바프로그램 컴퓨터 내 도스(+이클립스 콘솔)출력 : 자바 어플리케이션

웹 관련 라이브러리
스마트폰 라이브러리
자바 어플리케이션 라이브러리 11장

===================================================================

10장 예외처리 = Exception
컴파일, 런타임 프로그램 오동작들 = 오류

-"자바 견고한 언어이다" 미리 예방하자
-예외발생상황 = 객체 = 예외클래스로 정의
-예외 직접처리 : try-catch-finally
	=>예외발생 문장을 포함한 메소드 내부 처리
-예외 간접처리 : throws
	=>예외발생 문장을 포함한 메소드를 호출하는 다른 메소드 내부 처리
1. 컴파일타임 예외 : 자바소스 원천적 수정할 때까지 계속 발생
	문법오류 = syntax error
2. 런타임 오류 : 실행 환경에 따라 발생 가능한 오류
	int i = 100/Integer.parseInt(args[0]);
	args[0] : null
	args[0] : "aa"
	args[0] : "0"

	try{
		예외발생가능성문장 정의
		예외발생 o : try 중단하고 catch이동
		예외발생 x : try 블럭 실행
	}catch{
	}finally{
	}

finally
파일,네트워크,db : 컴퓨터 내부 다른 프로그램들 같이 사용 resource(자원)
windows : 파일 사용 권한 획득 - 입출력 - 종료 알려줌(권한 반납) - 다른 프로그램 넘겨줌
try{
FileReader fr = new FileReader("a.txt");
fr.read()
}catch(IOException e){
}finally{
fr.close(); => 실행하지 않으면 무한대기 (파일 사용 종료 "반드시")
}

=================================================================

throw : 예외 의도적 발생 키워드

	void m4(int i) throws ClassNotFoundException {
		if(i==0) {
			//의도적 예외 발생
			//java.lang.ClassNotFoundException
			Exception e = new ArithmeticException();
			throw e;
			throw new ClassNotFoundException("i가 0이면 수행 불가");
			
		}
		System.out.println(i);
	}

	try {
			//Class.forName("oracle.jdbc.driver.OracleDriver");
			t1.m4(0);
		} catch (ClassNotFoundException e) {
			System.out.println(e.toString());
		}


----------------------------------------------------------------

-사용자 예외 클래스 정의
class AException extends Exception{
	변수
	메소드
	생성자()
	생성자("")
}

-사용자 예외 객체 의도적 생성

void m2(){
	try{
		m1();
	}catch(AException e){
		e.getmessage()
	}
}

void m1() throws AException{
	throw new AException();
}














	
	
