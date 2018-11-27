-상속 개념

1. is a 관계
	기존 정의 클래스에 변수나 메소드들이 새롭게 정의 클래스 또 필요-자동포함
2. class A extends B
3. non-private 변수,메소드 제외
	하위 클래스에서 상속 변수,메소드 사용 가능
4. 하위 클래스에서 상속받은 변수,메소드 이름이 하위클래스 선언된 변수나 메소드와 같은 이름 사용가능
	구분 / 우선 : 변수 메소드 : 하위
		super.변수, super.메소드 : 상위
5. 상위 클래스 상속 메소드 내용 하위 클래스 그대로 사용 / 재정의
6. modifier 같거나 더 넓고 리턴타입, 이름, 매개변수 리스트 동일 - overriding
7. 하위클래스 내부 생성자 첫문장 super(); 자동정의
	하위클래스 생성자 호출 = 하위클래스 객체 생성 = 하위클래스 변수 메소드 메모리 할당
	상위클래스 생성자 호출 = 상위클래스 객체 생성 = 상위클래스 변수 메소드 메모리 할당
	
	class Parent extends Object{
		Parent(){super();}
		Parent(int i){super(); i=100};
	}
	class Child extends Parent{
		//Child(){super();}
		Child(String s){super(200); s="sub";}
	}
	//Child c = new Child();
	//Object -> Parent -> Child
	Child c2 = new Child("a");
	Object -> Parent -> Child
	
super.변수명 : 상위클래스
super.메소드명 : 상위클래스
super() : 생성자 첫문장 자동정의, 상위개본생성자 호출
super(매개변수) : 생성자 첫문장 명시적 정의, 상위매개변수 정의 생성자 호출

-final
final 변수 : 변수값 수정 불가능 = 상수
final 메소드 : 메소드 오버라이딩금지
final 클래스 : 상속금지(모든메소드 오버라이딩금지) =>객체생성, 메소드호출

===============================================================


//boolean 제외
//byte>short>int>long>float>double
-객체들 형변환 
1. 상속관계
2. 자동형변환
	하위 객체 생성하여 상위클래스 변환
	: 상위클래스 변수명 = 하위클래스 객체
3. 자동형변환되면 상위클래스객체처럼 취급
	상위클래스 변수, 메소드 사용 가능
	단, 오버라이딩 메소드 하위클래스 메소드 사용 가능
	(하위 변수나 하위 추가 메소드 : x)
4. 명시적형변환
	자동형변환되었다가 다시 원래의 하위클래스 변환 (객체 복원 restore)
5. 명시적형변환되면 다시 원래 하위타입 취급 (하위 변수나 메소드 사용 필요)
	하위클래스 변수 + 하위클래스 메소드 + 하위클래스 overriding메소드
	+ 상위 변수 + 상위 메소드

---------------------------------------------------------
	
class 자동차{
	핸들
	타이어[] t = new 타이어 [4];
	t[0] = new 한국타이어();
	t[1] = new 한국타이어();
	t[2] = new 금호타이어();
	t[3] = new 한국타이어();
}
class 타이어{}
class 한국타이어 extends 타이어{}
class 금호타이어 extends 타이어{}

-필드변수 여러가지 객체타입 => 통일
	Tire t = new HankookTire();
-배열 내부 여러가지 객체타입 => 통일
	Tire[] t = new Tire[4]
-매개변수가 여러가지 객체 타입을 받아야 하기 때문에 => 통일
	void changeTire(Tire t){}
	
--------------------------------------	
class A{}
class B extends A{}
class C extends A{}
class D extends C{}
A a1 = new A(); //형변환 필요없는 문장
A a2 = new B(); //자동 형변환
A a3 = new C(); //자동 형변환
A a4 = new D(); //자동 형변환

B b1 = new A(); //불가능
B b2 = new C(); //불가능
B b3 = new D(); //불가능

C c1 = new C(); //형변환 필요없는 문장
A a5 = c1; //자동 형변환
--------------------------------------
class A{i, ma(){}, mc(){x;}}
class B extends A{j, mb(){}, mc(){x+y;}}

A a1 = new B(); //자동 형변환 가능

상위클래스.변수;
상위클래스.non-overriding메소드
하위클래스.overriding메소드

a1.i
a1.j//불가
a1.ma();
a1.mb();//불가
a1.mc(); //x+y 하위 메소드 우선!!!

B b1 = (B)a1; //명시적 형변환 가능(객체 복원 restore) B클래스 + 
B b2 = (B) new A(); //명시적 형변환 불가능
---------------------------------------
class A{}
class B extends A{}
class C extends A{}
class D extends C{}

type? obj[] = {new A(), new B(), new C(), new D()}

=> A obj[] = new A[4];
obj[0] = new A(); //형변환 필요x
obj[1] = new B(); //자동 형변환
obj[2] = new C(); //자동 형변환
obj[3] = new D(); //자동 

test(new A())
test(new B())
test(new C())

//A, 하위클래스 객체 모두 매개변수
test(A a1)정의
//test(B a1)정의
//test(C a1)정의
==============================================================
CastingTest.java

class Parent{
	int su = 10;
	void print() {
		System.out.println(su);
	}
	void mp() {
		System.out.println("Parent");
	}
}

class Child extends Parent{
	int su = 20;
	void print() {
		System.out.println(su);
	}

	void mc() {
		System.out.println("Child");
	}
}

	Parent p1 = new Parent();
	System.out.println(p1.su);
	p1.print();
	
	//Child c22 = (Child) p1;
	//c22.mc(); // => 컴파일 타임에 오류가 없으나 런타임 에러
		
	Child c1 = new Child();
	System.out.println(c1.su);
	c1.print();
	
	Parent p2 = new Child();
	System.out.println(p2.su);
	p2.print();	
	((Child)p2).mc(); //임시적 하위객체 메소드 호출
	
	Parent[] list = new Parent[2];
		list[0] = new Parent();
		list[1] = new Child();

stack							heap
-------------------------------------------------------------
p1 : 100						200:Object	<----
	--------------------------->100:su=10	----|
								print(){sop(su)}
								void mp(){}			<---|
														|
c1 : 500 												|
	--------------------------->500:su=10	------------|
								print(){sop(su)}
								void mc(){}
						
-------------------------------------------------------------								

stack							heap
-------------------------------------------------------------
p2 : 100						200:Object	<----
	--------------------------->100:su=10	----|
								print(){sop(su)}	----|
								void mp(){}				|
														|
								500:su=20				|
								print(){sop(su)} <-------
								void mc(){}
												
-------------------------------------------------------------

Object[] list2 = new Object[10];
		list2[0] = new Parent();
		list2[1] = new String();
Object.equals(Object o); => 자바의 모든 타입 들어갈 수 있다는 표시
Object test() {
	return 자바 모든 타입 가능;
}

-------------------------------------------------------------

-instanceof 객체연산자 = 변수가 특정 객체 타입인지 조사(객체타입 형변환 가능 여부)
변수명 instanceof 클래스명

System.out.println(p2 instanceof Child);
if(p2 instanceof Child) {
	System.out.println("p2는 Child 객체입니다");
	((Child)p2).mc();//임시적 하위객체 메소드 호출
}


==================================================================

-abstract modifier
abstract 메소드 : 선언부만 있고 구현부 없는 메소드
abstract class : 추상메소드 1개 이상 포함 클래스

1. 기능 구현 = 메소드 구현 : 객체 유형마다 서로 다르다: abstract 메소드
2. 추상 메소드 1개 이상 포함 클래스 : abstract 클래스
	추상 메소드가 없는 클래스에도 abstract 를 클래스에 선언 가능하다(상속용도 제한)
3. 객체 생성 불가능
4. 상속 의무화 > 오버라이딩 의무화
5. abstract - final 동시 선언 불가능(의미 모순) [static 불가]
6. 서로 다른 여러가지 객체에 공통 기능의 메소드 통일 정의, 각 객체들마다 구현 방법 다르다
	abstract 클래스 : 공통 기능 스펙 / 명세서 정의
---------------------------------------------------------------
final 클래스 = 상속불가능, 객체 생성 <-----------------|
abstract class 도형{ //객체 생성 불가능, 상속 의무화 <--|
	
	int PI ;
	
	abstract 면적(){}
	abstract 둘레(){}
	void 출력(){
		sop(면적= , 둘레= );
	}
}

class 사각형 extends 도형{
	int 가로;
	면적(){가로*세로;}
	둘레(){(가로+세로)*2}
}

class 원 extends 도형{
	면적(){반지름*반지름*3.14;}
	둘레(){2*반지름*3.14;}
	void 출력(){
		sop(면적= , 둘레= );
	}
}
---------------------------------------------------
-도형 shape = new 도형();
도형 메소드+변수 메모리 할당 불가능 => 추상클래스를 인스턴스화 할 수 없다.

************************but 
도형 shape = new 원(); =>가능!
도형 shape = new 사각형(); =>가능!

===============================================================

-인터페이스(Interface) = 다중 상속!!!



interface 학생{
	[public static final]필드변수 가능
	//생성자 없다.
	[public abstract] void 공부하다();
	[public abstract] void 점심먹다();
}

interface 교직원{
	void 일하다();
	void 점심먹다();
}

class 조교 implements 학생, 교직원{
	//오버라이딩 의무화
	공부하다(){}
	점심먹다(){} //중복 메소드의 경우 한번만 오버라이딩
	일하다(){}
}

조교 s = new 조교();
s.공부하다()
s.일하다() 
s.점심먹다()







































