
오라클 RDB : 영구저장 데이터 테이블 구조
자바 : 객체지향 프로그래밍 언어


1장 자바 개념/특성/TOOL
2장 변수
3장 연산자
4장 조건문 / 반복문 / 이동문
====================
5장 참조타입
6장 클래스
7장 상속
8장 인터페이스
9장 중첩 클래스
10장 예외처리
====================

오라클 내장함수 / 프로시져 / 패키지 와 같이
자바가 미리 제공하는 내장 로직 구현 ->자바 라이브러리 = JAVA API
11장 자바 기본 API
12장 멀티 스레드 API
13장,15장 (CURSOR) 여러개의 데이터를 한번에 저장 구조
18장 파일 IO 입력/출력 API , 네트워크 API

14,16,17,19장 제외
+
20장 자바 DB 연결 API
====================




1장
-프로그래밍언어 : 표현 수단/ 의사 소통
 사람 언어 문자 언어
 컴퓨터 언어 : 이진수 형태 
 0/1 : 2가지 정보 이해 / 표현 2^1
 00/01/10/11 : 4가지 정보 이해 / 표현 2^2
 ...
 2출력 기능 표현 이진수 : 0001111110101
 
따라서 변환이 필요하다
1> 새로운 약속(=문법) 문자 언어 정의 = 프로그래밍언어
2> 표현 작성
3> 이진수 = 기계어 변환 = COMPILE
4> 컴퓨터 실행  

자바 = 프로그래밍 언어
프로그램=> 프로그래밍 언어를 사용한 작성물
		컴파일한 결과물

-자바 특성 3~8P
1. C, C++ 언어 문법 구조 유사
2. 자바 platfrom 독립적 언어
 C, C++ : windows 작성 - windows컴파일 - 실행
 C, C++ : linux 작성 - linux컴파일 - 실행
 =>os 종류에 따라 작성 방법 다르다 = os 종속적이다. 
	= PLATFROM에 종속적이다. = 소스 호환 불가능하다.
 
 computer = HW + OS = PLATFROM + 프로그램

 자바 - C(40%), C++(70%) 문법 유사 + 자바 문법 추가
	> windows 작성 - windows컴파일
	> unix, mac, windows 실행
	
	=>os 독립적이다 = os 독립적이다. 
	= PLATFROM에 독립적 = 소스 호환 = 이식성 높다
 write once, run anywhere(wora)

2018년 : 자바를 기반으로 모든 언어를 시작 r, python

servlet, jsp, spring framework > 자바 기반
=====================================================================
-1.3 자바 개발 환경 = tool 설치
//자바 설치 확인법
>java -version

1. jdk tool / oracle db = oracle 사 
java.oracle.com 사이트 다운로드(db/java)


-자바프로그램 실행
1> 자바프로그램 소스파일 작성 
	/ 텍스트 에디터 모두 => 자바소스파일명 .java
2> 컴파일 / javac 
3> 실행 / java

jdk경로 C:\Program Files\Java\jdk1.8.0_181\bin
javac.exe 컴파일러 명령어
	javac 자바소스파일명.java
java.exe 실행 명령어
	java 자바소스파일명


메모장 + 도스
1. jdk 만 설치시 : 별도 편집기 사용 불편
	도스 입력 불편 없애고 메뉴 션택
	+
2.편집기능 + 메뉴 제공 tool
	>이클립스


-자바 소스 분석

class 클래스이름{
	public static void main(String[] args){ //main 메소드는 변하지 않는다.
		System.out.println(123);
	}
}

-실행내용 저장 단위 : statement = 문장
	실행에 영향을 미치지 않는 문장 = 설명문,주석문,comment
	// , /*  */ , /** */
	실행에 영향을 미치는 문장 = 
-문장 모음 : 메소드
-메소드 모음 : 클래스 = 프로그램 


=================================================================
2장 변수와 타입
	변수 : 프로그램 연산 데이터나 연산 결과 저장 메모리 영역 이름;
	
	-변수 선언
	 타입 변수명;
	-변수 값 저장
	 변수명 = 값;
	 
1. 클래스명, 변수명, xxx명 규칙
 1> 숫자+일반문자+_,$ 구성
 2> 숫자로 시작 불가능 
 3> 자바 예약어 불가능 
 4> 대소문자 구분
 5> 무제한 길이 2^16

- 자바 예약어
 1> 50여개
 2> 소문자
 3> 이클립스 색이 변하는 것
 4> this_a 와 같이 변형해서 사용가능
-----------------------------
기본타입				참조타입
논리값		boolean		배열
정수		byte		클래스
		short		인터페이스 
		int		
		long	
실수		float	
		double	
단일문자	char	
------------------------------
boolean b1;
b1 = true;
boolean b2 = false
boolean b3;
default false b3;
true, false 두개만 사용 >1byte

char c1 = 'a';
char c2 = 'A';
char c3 = '\n'; > uni code(utf-8) 2byte

변수타입 변수명 [=값];
boolean 메모리 저장 길이 : 2개 정보 표현 
char : 영문자 / 한글 / 한자 / 다국어

메모리 저장 최소 데이터 단위 : 0/1 자리 저장
= 1bit(2가지 정보)
...
-8bit 묶음 = 1byte = 2^8 = 256가지

-1byte 2^10 묶음 = kb


미국 A-Z a-z 특수문자 0-9 >128개 미만
  따라서 2^7 길이로 표현 가능
유렵 +독자 문자 >128 초과
  따라서 2^8 길이로 표현(256문자)
 == ascii code : 1byte 길이 문자 표현 ==
 
 2^16 = 65526문자 + 확장 가능
 == uni code(utf-8) : 2byte 길이 문자 표현 ==

-------------------------------
기본타입				참조타입
논리값		boolean		배열
정수		byte		클래스
		1byte(8bit)표현정수
		[부호(1bit)][값(7bit)]
		-128~127
		short		인터페이스 
		2byte 표현정수
		[부호(1bit)][값(15bit)]
		-2^15~2^15-1
		int		
		4byte
		[부호(1bit)][값(31bit)]
		-2^32~2^31-1
		long	
		8byte
		[부호(1bit)][값(63bit)]
		-2^63~2^63-1
실수		float	
		4byte
		double	
		8byte
단일문자	char	
-----------------------------------
4가지 타입 : boolean, char, int, double 

'javaprogram' 문자열 저장 변수 기본 타입 존재x
새롭게 정의 && 제공,배포 + 내장 타입 
다른 프로그래머 제공 배포 (jdk 포함): String
참조 타입 String title = "javaprogram";
기본 타입 char c = 'a';

//byte타입 정수 표현 최대값,최소값
System.out.println(Byte.MAX_VALUE);
System.out.println(Byte.MIN_VALUE);

if(1000< Byte.MAX_VALUE) {
			System.out.println("출력가능");
		}else {
			System.out.println("출력불가");
		}

----------------------------------------------
//자바 논리적(가상적) 메모리 구조
class영역			stack영역			heap영역
메소드 문장 저장		변수선언 순서 저장	100address => garbege collector
				d(8byte):6.28	:"java"		  가 메모리 삭제
				s(4byte숫자저장)	200address
				 :100address	:"servlet"
				>200address
				i:4byte:10		
				고정영역/기본타입		참조타입
				프로그램실행중		프로그램실행중이어도
								사용
-----------------------------------------------
>int i = 10;
 String s = "java";
 double d = 3.14;
 s = "servlet";
 d = d+d

 참조타입 변수 = 주소값 저장 성격 변수
 기본타입 변수 = 실제값 저장 성격 변수
-----------------------------------------------
http://192.168.13.27:9090/java/





