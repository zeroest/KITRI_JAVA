-메소드
[modifier]class 이름{
	필드변수 = 객체 상태 속성 정보 데이터
	메소드 = 객체 동적 기능 행위 동작 표현 문장들
	생성자 = 객체 생성(=클래스 복사 메모리 저장)시 필드변수값 세팅
		바로 객체 사용 준비 ( 필드변수값 초기화 )
		
}



-형태
메소드 선언부/{메소드 구현부}
[modifier] 리턴타입 이름([매개변수]){
	메소드 지역변수 
	if(){if 지역변수}
	for(){for 지역변수}
}


-클래스이름, 변수이름, 메소드이름
1. 숫자 시작 불가
2. 대소문자 구분
3. 예약어 불가
4. 숫자, 일반문자, _$구성
5. 컴파일오류x but 약속
	클래스 이름 : 명사 대문자시작 단어
	변수 이름 : 명사 소문자시작 단어
	메소드 이름 : 동사 소문자시작 단어


- 리턴타입
메소드 기능 구현 결과물 타입 설정
기본타입(8가지) + String,Arrary,클래스,...
	static int m1(){
		int i = 10;
		return i*i;
	}

	main(){
		int r1 = 0;
		int r1 = m1(); =>메소드 호출, 실행;
		
	}
	
					returntypetest.java
----------------------------------------


리턴타입 메소드(형식매개변수){
	기능...
	return i;
}

메소드 호출 실행:
객체참조변수명.메소드(실매개변수);

**********************************************************
==========================================================
https://blog.perfectacle.com/2017/10/30/js-014-call-by-value-vs-call-by-reference/
http://mussebio.blogspot.com/2012/05/java-call-by-valuereference.html

자바 메소드 생성자 호출 실행 매개변수값 전달 원리!
call by value 방식:
실매개변수의 값을 복사하여 형식매개변수로 전달

기본타입 : 실제값 복사 전달
참조타입 : 주소값 복사 전달

(call by reference, call by name)

class Sample{
	int  a = 10;
}

class Test{
	
	void add1(int i) {
		System.out.println("add1메소드 = "+i++);
	}
	
	void add2(Sample s) {
		System.out.println("add2메소드= "+s.a ++);
		
	}
	
}

public class CallByValueTest {

	public static void main(String[] args) {
		
		Test t = new Test();
		
		//기본형변수 전달
		/*int j = 10;
		t.add1(j);
		System.out.println("add1호출 후의 j= "+j);*/
		
		Sample sam = new Sample();
		t.add2(sam);
		System.out.println("add2호출 후의 sam.a= "+sam.a);
		
	}
}

stack 						heap
i:10 > 11
j:10
t:100						100: add1(int i){sop(""+i++);} //i=10
								add2(Sample s){sop(""+s.a++);}
sam:200						200: int a =10 >11
s:200								
								
								
call by value
-기본타입
	실매개변수(j)의 실제값을 형식매개변수(i)로 복사 전달.
	전달 이후에 메소드 내부 형식매개변수(i)값 변경 되면 실매개변수(j) 영향x

call by reference
-참조타입
	실매개변수(sam) 주소값을 형식매개변수(s) 복사 전달
	sam, s는 같은 객체 참조중(동일 객체 내부 포함)
	형식매개변수 참조객체 내부 변수값(s.a) 변경시
	실매개변수 참조객체 내부 변수값(sam.a)도 변경

=============================================================
*************************************************************

method overloading
같은 클래스 내에 같은 이름 but 매개변수 리스트(순서, 타입, 갯수) 다르게 정의


class A{
	int i = 20; //필드변수(클래스 모든 메소드 사용)
	
	void m1(int j){//매개변수 : 외부입력, 메소드내부
		int i =10; //지역변수 : 메소드 내부 임시적, 메소드내부
		sop(i+i); //20
		sop(this.i+i); //30
	}

	coid m2(_{
		sop(i);
		sop(i+k); // k가 m2 내부에 없기 때문에 오류
	}
}
-------------------------------------------------------


[modifier] 
		modifier	class	변수		메소드		생성자
접근제한	public		o		o		o		o	
		protected	x		o		o		o
		private		x		o		o		o
		
활용방법	static		x		o		o		x
		final		o		o		o		x
		abstract	o		x		o		x

static : 정적 <-> 동적
1. heap영역 (필요시) 객체 생성 - 소멸(g/c)-생성-소멸
main시작 ~ 종료 유지x => 동적


class 한국사람{
	String 이름;
	int 나이;
	static String 국적 = 한국; ->객체생성이전 국적 정해지고 - 유지
			->모든 사람 객체들은 국적 한국 통일	
}
PersonTest.java


run
1. static 변수 / 메소드 메모리 할당
2. 코드 검증
3. main : 객체생성


-필드변수
------------------------------------------------------
Non-static					static
인스턴스(=객체)변수				클래스변수			
객체생성이후 사용					객체생성이전 사용		
클래스명.non-static변수(X)		클래스명.static변수명							
객체참조변수명.non-static변수명		객체참조변수명.non-static변수명						
객체영역 포함					클래스영역 포함							
여러개/객체고유값					1개/공유
							static 변수만 사용할 메소드 정의
								=>static메소드
------------------------------------------------------


class 계산기{
	String 브랜드;
	static double 원주율 = 3.14;	
}

class 학생{
	학번 이름 전공
	static String 학교명 = "대한대학교";
}

========================================================

final : 변수값 수정 불가능
1. 절대불변의 진리값 저장 변수

class 원{
	int 반지름;
	final double 원주율 = 3.14;
	
	면적구하기(){
		원주율 +=1 ;
		반지름*반지름*원주율
	}
}

2. static 변수 공유 변수값 수정 불가능
final static int pi = 3.14;

========================================================

package 의미 : 유사한 성격의 클래스 모임 = 폴더구조
클래스 포함 = 변수 + 메소드 + 생성자

클래스 = 파일구조
클래스 모아서 분류 = 폴더구조

폴더(\) : windows
디렉토리(/) : unix
package(.) : 플랫폼 독립적 용어

게시물 관련 클래스 10개 : shopping.board.boardinsert 게시물
+ 상품 관련 클래스 5개 : shopping\board\상품
+ 회원 관련 클래스 10개 : shopping\board\회원

========================================================

접근제한자

public : 무제한 모든 클래스
protected : 변수 선언 패키지 + 다른 패키지의 상속받은 클래스 사용가능(extends)
default(no modifier) : 선언 패키지 내부에서만 사용 가능
private : 변수 선언 클래스 낸부 사용 가능

------------------------------------------------------------
package p;				|	package q;
public class A{			|	class C{
	int i = 10;			|	...	
	void ma(){			|	A a1 = new A();	//불가(default때문)
		sop(i);			|	sop(a1.i);	
}}						|	}
------------------------------------------------------------
class B{				|	class D extends A{//불가 class가 default
...						|	...
A a1 = new A();//가능		|			
sop(a1.i);				|	sop(i);
}						|	}
------------------------------------------------------------


class Account{
	String num;
	private int pw;
	readPw(){sop(pw);}
	updatePw(){pw=4321;}
	...
}

class AccountTest{
	main(){
		Account a = new Account("1111",1234);
	a.pw = 4321 // 불가! private
	}
}


==============================
-잘된 설계 프로그래밍

필드값을 최대한 감추고 (private)
메소드를 통로로 만들어라
getter
setter
==============================



-private 같은 변수에 접근할때 get변수명 set변수명 으로 메소드를 설정하자
getter
setter



비정형 매개변수
void m2(int...i){//배열처럼
(i.length i[0]..)
for(int j = 0 ; j<i.length ; j++){
	sum = sum+i[j];
}
}










































