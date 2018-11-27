
자바의 변수
기본 타입 : 자바 기본 내장 제공 타입
표현 종류, 길이 정해져있다.
논리값 boolean
단일문자 char
정수 int
실수 double
---------------------------------

5장 참조타입

정수 10개 묶음 1개 변수: 4byte* 10개 =>40 byte
실수 50 : 8byte * 50 => 400
학생정보 = 학번, 이름, 성적, 전공, 폰번 : 5개 데이터 묶음

1.길이가 다양 (기본타입 : 8byte 길이 최대)
2. 길이 대용량

-기본 타입에 제공되지 않는 유형 사용자 정의
1. 배열
2. 클래스 = 자바 프로그램 단위
3. 인터페이스

자바가 프로그램 실행 코드 문장, 데이터, 연산 결과를 저장하는 메모리 영역
------------------------------------------------------
class 영역		stack 영역		heap 영역(동적 영역)
=method 영역						
실행코드 문장저장		변수 저장			100address	 => garbege collector(g/c)가 메모리 삭제
				기본+참조 타입		:"java"			heap 영역 저장 데이터를 일괄 삭제 처리과정
				d(8byte):6.28	200address
				s(4byte숫자저장)	:"servlet"
				:100address
				>200address
				i:4byte:10	
------------------------------------------------------
 참조타입 변수 = 주소값 저장 성격 변수
 기본타입 변수 = 실제값 저장 성격 변수
 
stack : 먼저 저장 데이터는 가장 나중에 사용 가능
	( ex)먼저 담은 물건은 장바구니 가장 밑에 깔려 있다 )
	last in first out(lifo)
	따라서 정확한 데이터 용량이 정해져 있어야 한다.
	
Math.random();
Math 클래스에 포함된 random()메소드 호출

5.5 String 클래스 타입 :문자열 표현 조작 기능 제공 클래스
char 단일문자 표현 한계
String 여러개 문자열 표현 정의 라이브러리 제공
jdk tool 설치: javac.exe, java.exe, + 라이브러리

String s1 = "java";
String s2 = "java";
String s3 = new String("java");
String s4 = new String("java");
if(s1 == s2) true / if(s1.equls(s2)) true
if(s3 == s4) false / if(s3.equls(s4)) true
=> 주소값을 참조하여 boolean 하기 때문에

==,!= 동등비교 연산자 : stack 주소 같은지 비교
equls() 메소드 : heap 저장 실제 데이터 같은지 비교 if(!s3.equls(s4))

stack						heap
s4:300번지
s3:200번지					100번지:java
s2:100번지					200번지:java
s1:100번지					300번지:java


======================================================
참조타입

1. 배열 : "동일" 타입의 데이터를 여러개 모아놓은 참조형 변수

-배열 사용
1. 배열 변수 선언 : 데이터타입 변수명 [];, 데이터타입 [] 변수명;
int ar [];

2. 배열 생성 : 변수명 = new 데이터타입 [길이]
ar = new int[5]; 
new 키워드 : heap영역 참조데이터 생성!
1+2 >int ar[] = new ar[5];

3. 변수값 초기화

int ar[] = {1,2,3,4,5};
ar[0] = 10;
	0 => index : ar.length-1

	
	int 배열
	배열.length
	배열[0]~배열[length-1]
	
	ar = new int[5];
	ar = new int[]{1,2,3,4,5};
	int ar[] = {1,2,3,4,5};
--------------------------------------------------	
	
-최대값 / 최소값
	배열 [0] : 배열[나머지인덱스]
	
-오름차순 정렬
	반복=배열 [0] > 배열[나머지인덱스] : 배열[0] 대입
	반복=배열 [1] > 배열[나머지인덱스] : 배열[1] 대입
	반복=배열 [2] > 배열[나머지인덱스] : 배열[2] 대입
	...
	
---------------------------------------------------


String names[] = new String[12];
stack				heap
names:300			300:["홍길동"][]...[][]

*
**
***
****
***** =>배열에 저장해 출력해보자	
<일차원 배열>
String star[][] = new String[2]; =>2개 문자열 저장
<이차원 배열>
String star[][] = new String[2][3]; 
=> 	[ [이곳][][] ] [ [][][] ]

star[0][0] ="이곳"
star[0][1] ="*"
star[0][2] ="*"
star[1][0] ="*"	
star[1][1] ="*"
star[1][2] ="*"


- 커맨드라인입력 : command line argument
	전달저장 : String 
class A{
	public static void main (String[] args){
		
	}
} => A.java
javac A.java (=>A.class 파일생성)
java A[.main()] 자동실행

java A 
=> jdk가 자동으로) args = new String[0];
java A 자바 오라클 이클립스
=> args = new String[3];
	args[0] = 자바;
	args[1] = 오라클;
	args[2] = 이클립스;
	
	
형변환연산자 : '기본형변수' 만 사용가능

해당 언어 제공 연산자 연산식
기능 제공 연산자 없다 	

int first = Integer.parseInt(args[0]);
double sample = Double.parseDouble(args[0]);
	
-------------------------------------------------------


배열 복사
1.
int origin[] = {1,2,3,4,5}; 
	:address 100 > {1,2,3,4,5}
origin = new int[10];
	:address 200 > [10]
=>따라서 기존의 {1,2,3,4,5}는 사라진다

2.
int origin[] = {1,2,3,4,5};
int newar[] = new int[10];
System.arraycopy(origin, 0, newar, 0, origin.length);
				(src, srcPos, dest, destPos, length)
=>배열 복사: 		origin배열 0번째 부터 newar 0번째부터 오리진끝까지



