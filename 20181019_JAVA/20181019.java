2장 변수

<review>
1. 자바 platfrom 독립적이다. 이식성이 높다.
2. c, c++, java, c# 탄생순서
3. 자바 언어 프로그램 작성 - 실행 결과
	-자바 소스파일 작성
	-컴파일 javac
	-실행 java
4. jdk 1.8~ + eclipse(자바소스 편집기 + 메뉴클릭 + 컴파일자동실행, 소스편집 자동완성)
	설치경로\bin\javac.exe 컴파일
	설치경로\bin\java.exe 실행
5.
-자바소스 파일 작성
class 클래스이름{
	public static void main(String[] args){
		System.out.println();
		실행문장;
	}
}
==>클래스이름.java
	-컴파일
	(도스)javac 클래스이름.java
	(=>클래스이름.class파일생성)
	-실행
	(도스)java 클래스이름
	(=>클래스이름.class 실행)
--------------------------------------------------------------------

1. workspace 생성
	모든 자바 프로그램 - 저장큰폴더 설정 - workspace
2. java project 생성
	file - new - java project
	이름, jdk버전(자동 1.8) -chap1, chap2
	자바프로젝트 \src\*.java 저장
			\bin\*.class 저장(eclipse 내부에서 안보임)
			\system libraries(자바 API 라이브러리, 내장함수)\저장
3. class 생성
	file - new - class :이름, main 체크
	class 이름{
		public static void main(String[] args){
			변수 선언문장;
			변수 값 저장 문장; = 변수값 초기화 문장;
			
			출력문장;
			연산문장;
			조건문장;
			.....
		}
	}

-----------------------------------------------------------------	
	
-변수 : 프로그램 연산데이터나 연산결과 메모리 저장
	메모리:번지,주소,address(이진수:숫자구성), 이름, 성격, 크기 
	메모리 주소의 이름을 변수로 지정
	
	변수선언 문장 => 타입 변수명;
	변수 초기화 문장 => 변수명 = 값;
	변수선언+초기화 => 타입 변수명 = 값; //타입과 값이 일치해야한다.
	
-클래스명, 변수명, 메소드명, 패키지명
1.숫자, 일반문자, _$ 구성(공백불가)
2. 대소문자 구분
3. 예약어 사용불가(색변화)
4. 숫자 시작 불가능
5. 길이 무제한 

-변수타입
변수 = 자바 메모리 공간 모델
클래스영역		stack영역		heap영역
문장 저장공간	변수 저장			
			메모리 정적		메모리 가변적
			순서,크기고정	동적 공간
			실행중 계속저장	실행중이더라도저장값 삭제 가능 - garbege collector

-데이터 타입 종류
논리값 : boolean : 1byte(true/false)
단일문자 : char : 2byte
정수 : byte short int long 
	/ int[부호1bit]{값(2^31bit)}: -2^31~2^31-1 :Byte.MAX_VLAUE
실수 : float:4 double:8byte / [부호(1bit)][.....]  
>>>기본타입 : 표현 성격, 크기 정해져있다.(stack영역 저장 실제값)

>>>참조타입(reference) : stack 저장 주소값 =>주소값 참조시 실제값(heap영역)
문자열 : String : 4byte

+사용자 정의

------------------------------------------------------------------

리터럴 : 소스 코드 내에서 직접 입력된 변수의 초기값
	정수, 실수, 문자, 문자열, 논리 리터럴
	소스 코드 내에서 익숙해 지는 것이 포인트
	
10진수, 2/8/16진수
0x숫자 16진수 헥사데시말?
0숫자 8진수
2진수 자바라이브러리API

ascii code 
1byte 
2^8=256문자
ex)
000000000(10진수 1) : a 
000000001(10진수 2) : b 
48 : 0
65 : A
66 : B
...
97 : a 

(한글 표현 : 코드 컴퓨터마다 다르다)
uni code 
문자 :  2byte

byte:8bit
부호0:양수	0	0	0	0	0	0	0
부호1:음수
0부호0000000 = 0
0부호1111111 = 127
1부호1111111 = -1 (음수 - 2의 보수 변경)

논리값 : 1byte : 8bit
00000000 : false
00000001 : true 
===========================================================

기본타입 8개 + 참조타입 String

2.3 타입 변환 연산자 (=data type casting)

byte(1) < short(2) < int(4) < long(8) < float(4) < double(8)

(데이터타입명) 값;
(데이터타입명) 변수;
int i = 10;
i = (int) 10.99;

1. 기본 타입끼리만 변환
2. boolean 타입 제외
	int i =0;
	boolean bi = (boolean) i; //error;
3. 자동 타입 변환 : 타입 변환 연산자 없어도 자동 변환
	byte(1) < short(2) < int(4) < long(8) < float(4) < double(8)
	int i = 10;
	double d = (double) i;
4. 명시적 형변환 : 타입 변환 연산자 명시해야만 형변환 가능
	double d = 3.14;
	int di = (int)d; //3 - 강제형변환
	
라이브러리 사용 (int)

	int i = 128
	byte b = (byte) i;
	//print > b = -128

	int i = 128; // 00000000 00000000 00000000 11111111
	byte b = (byte)i; //11111111 > -128

//C:\workspace_java\chap2\src\java_20181019\Data_type.java


Casting_test.java - 산술 연산자 결과

정수 연산자 정수 = 정수
실수 연산자 실수 = 실수
정수 연산자 실수 = 실수

C:\workspace_java\chap2\src\java_20181019\Casting_test.java

==================================================================



3장 연산자 : 10+20
-타입/ 형변환
(int)3.14; => 3
-------------------------------------------------------------------
		변환			산술		비교			논리				대입			
단항 연산자	데이터 타입 변환	++,--	X 			not=!			x			
이항 연산자	X 			+-*/%	>,>=/!=,==	and=&&,or=||	=,+=,*=,>=	
삼항 연산자	X 			X 		X 			x				x			
-------------------------------------------------------------------
-조건 삼항
	a?b:c
	a:boolean
	true : b 
	false : c 
	
int x = 5;
	-x가 10보다 크면 크다 x>10
	-x가 10보다 작으면 작다 x<10
String result = x>10?"크다":"작다";
int result = x>10? 1: 0;
	-x가 10보다 크거나 같고 50보다 작으면 결과 1.1 / 0
double result = x>=10 && x<50? 1.1:0;

-연산대입
int i = i+j; => i+=j
	

-산술연산
단항 ++(increment) --(decrement) : 현재 정수값 1씩 증가/감소
i = i + 1; = i++,++i
i = i - 1; = i--,--i
-----------------------------------------
int x = 5;		y = x++;		y = ++x;
int y = 0;		1>y=x;			1>x=x+1;
				2>x=x+1;		2>y=x;
				---------		---------
				x = 6			x = 6
				y = 5			y = 6
------------------------------------------
int x = 5;		y = x--;		y = --x;
int y = 0;		1>y=x;			1>x=x-1;
				2>x=x-1;		2>y=x;
				---------		---------
				x = 4			x = 4
				y = 5			y = 4
------------------------------------------	

			
-이항 /+-*%(mod)

1. int i = 10/3; sysout(i);
	- sysout(i+10);//13 한번 연산한 결과를 재사용 해야할 때
2. sysout(10/3);//3
	- sysout(10/3+10);//13

int i = 10/3; // 정수몫 3
int j = 10%3; // 나머지 1


-비교 같은지 큰지 작은지
1. 동등비교 연산자 : ==
2. 대입 연산자 / 할당연산자 : =

boolean result = 10==5; //false
boolean result = 10 != 5 //true 
boolean result = 10 = 5; //error



연산자 우선순위 (priority)
*,/,% => +,-
대입 < 산술
대입 < 비교
대입 < 논리
대입 < 형변환 //대입은 최후에 된다.
예외 : y = x++;(대입 먼저, 후에 증가연산)
() > 형변환 > 산술 > 비교 > 논리 > 대입
() > 단항 > 이항 > 삼항 > 대입

int result = ((10 * 3) / 4) + (5 * 8) - 10;
-------------------------> 연산방향

- i 는 최대값인지 판단 = i는 j,k 보다 모두 크면
i>j&&i>k
int i = 입력 ;(10)
int j = 입력 ;(5)
int k = 입력 ;(1)

boolean && boolean
true && true => true
true && false => false
false && true => false
false && false => false
---------------> 연산순서
false && 수행하지않음 => false

true & true => true
true & false => false
false & true => false
false & false => false
---------------> 연산순서
false & 앞이 false 여도 판단한다. => false

&& = 단축 and 연산자(경우에 따라 불필요한 연산 생략하고 결과 리턴)


boolean || boolean
true || 수행할필요x => true
true || false => true
false || true => true
false || false => false
---------------> 연산순서
true || 수행하지않음 => true

true | true => true
true | false => true
false | true => true 
false | false => false
---------------> 연산순서
ture | 앞이 true 여도 판단한다 => true

|| = 단축 or 연산자(경우에 따라 불필요한 연산 생략하고 결과 리턴)


!(10>5) ==> 10<=5;

C:\workspace_java\chap2\src\java_20181019\Operator_Test.java
================================================================

-Nan , Infinity 83p

package java_20181019;

public class Nan_infinity {

	public static void main(String[] args) {

		/*
		 * System.out.println(10/0);// ArithmeticException: / by zero
		 * System.out.println(10/0.0);// Infinity 
		 * System.out.println(10%0.0);// NaN
		 */

		String is = Double.isInfinite(10 / 0.0) ? "연산불가" : "연산가능"; //

		String is2 = Double.isNaN(10 % 0.0) ? "나머지못구함" : "나머지구함";

		System.out.println(is);
		System.out.println(is2);

	}
}

3.4.2 86p
+연산자 기능 2개
1. 산술연산 덧셈 : 정수, 실수 + 정수, 실수
2. String 결합: String + String / String + 정수,실수 / 정수,실수 + String


클래스명 : 현실세계표현 - 대문자명사화
변수명 : - 소문자명사화


(int) (Math.round((Math.random()*(최대값-최소값)))+최소값)





