
java.lang.*
java.util.*
java.text.xxxFormat
java.util.regex.Pattern

15장 
java.util.* - 날짜시간표현 / 컬렉션
배열:정적크기, 동일타입
컬렉션: 동적크기, 여러가지 다양한 타입
class xxx implements Set
=>(값) : 데이터순서없다, index없다 / 중복x
class xxx implements List
=>(값) : 데이터저장순서있다,(add()).index있다 / 중복o
class xxx implements Map 
=>(키, 값) : 값 저장 순서 없다. / 키 중복 x, 값 중복 o

HashSet/HashMap/Properties/ArrayList

List list = new ArrayList();
list.add(Object) / Object : list.get(i);

List<generic(type parameter)> list = new ArrayList<generic>();
list.add(generic) / generic : list.get(i);

====================================================================

13장 generic : 일반적인
-jdk 1.5 이후 

class A{
	<type parameter> id;
}

A<Integer> a1 = new A<Integer>();
A<String> a2 = new A<String>();


class Box<T super ?>
=>T의 상위클래스들

class Box<? extends T>
=>T의 하위클래스들

class Child<T, V, C> extends Parent<T,V>

=======================================================================
18장 
java.io.* : 입출력 클래스
java.net.* : tcp, udp 네트워크 클래스

<servlet,jsp>
javax.servlet.* : http 웹 네트워크 클래스
-----------------------------------

java.io.* 50 여개 클래스
입출력 개념

입력		--->자바프로그램--->		출력
---------------------------------------------
키보드			java.io			모니터	
파일			java.io			파일		
db			java.sql		db	
다른컴퓨터		java.net		다른컴퓨터	
---------------------------------------------

a -> 1byte
가 -> window 2byte 
가 -> window 2byte - 같은 2byte but 결과값이 다르다
					따라서 자바에 같은 값으로 변경해야한다

입력 데이터 흐름(덩어리) / 출력 데이터 흐름(덩어리) = 입출력 stream

					입력					출력
------------------------------------------------------------
1byte				InputStream(Class)	OutputStream(Class)			
(이미지파일)			xxxInputStream	
------------------------------------------------------------
2byte				Reader(Class)		Writer(Class)				
(텍스트파일)			xxxReader		
------------------------------------------------------------					
파일 디렉토리정보 제공 클래스	File
------------------------------------------------------------

-다른 하위 클래스 상속

File클래스
키보드입력클래스
모니터출력클래스
파일1/2입력클래스
파일1/2출력클래스

					입력						출력
------------------------------------------------------------
1byte		InputStream(Class)				OutputStream(Class)			
(이미지파일)			
			read():키보드글자 1바이트				write(int i)			
			read(byte[]) : 입력값 바이트배열에 저장	write(~127)
			read(byte[],index,length)		write(byte [])
			close()							close()
------------------------------------------------------------
2byte		Reader(Class)					Writer(Class)				
(텍스트파일)	
			read():키보드글자 2바이트				write(int i)
			read(char[]) : 입력값 캐릭터배열에 저장	write(~65536)
			read(char[],index,length)		write(char[])
			close()							write(String)
											close()
------------------------------------------------------------	

InputStream i = new InputStream(); =>불가! 
abstract 클래스 InputStream 
abstract 메소드 i.read();

class FileInputStream extends 
read(){파일이름, 처음-끝...}

---------------------------------------

콘솔 입출력 : 키보드입력클래스 / 모니터출력클래스
표준입력도구 = 키보드 입력 
표준출력도구 = 모니터 출력 

System 클래스 : 자바 실행 컴퓨터 정보

System.out변수 : 모니터 PrintStream(OutputStream)
System.out.println();

System.in변수 : 키보드 InputStream
System.in.read() : 키보드 입력

int read() : a ->97 'o'->48 'A' ->


InputStreamReader : 1byte -> 2byte 변환 입력 : 한글가능, 정수 실수 불가
DataInputStream : 데이터타입 변환 int, double : 키보드입력불가능
	DataOutputStream 객체를 통해 출력한 것만

jdk 1.5버전 부터
java.util.Scanner 클래스
자바 데이터타입 입력 가능 객체

생성자
Scanner sc = new Scanner(System.in);

InputStreamReader : 한글
DataInputStream : 자바 데이터타입



메소드
sc.nextInt() // 공백 이전 입력 정수
sc.nextDouble() // 공백 이전 입력 실수
sc.nextBoolean() // 공백 이전 입력 논리값
sc.next() // 공백 이전 입력 String
sc.nextLine() // 엔터 이전 입력 문자열 String




System.out
PrintStream extends OutputStream



Consile s = Systme.console(); // 도스창에서만 실행가능
s.readLine() : 라인
s.readPassword() : *****

=====================================================================

File 클래스 : 입출력기능x
			파일시스템 정보 제공 클래스
파일 시스템 : os 파일시스템관리
(window : 탐색기)
파일 시스템 = 파일 + 디렉토리
파일길이 / 수정가능 / 읽기전용 / 

File f1 = new File("a.txt");
=>프로젝트/src/패키지명/ *.java
=>프로젝트/a.txt 존재

File f2 = new File("C:/test/a.txt"); => 절대경로
=>프로젝트/src/패키지명/ *.java
=>C:/test/a.txt 존재

File f3 = new File("../a.txt"); => 상대경로
=>프로젝트/src/패키지명/ *.java
=>workspace/a.txt 존재

File f4 = new File("./a.txt"); => 상대경로
=>프로젝트/src/패키지명/ *.java
=>프로젝트 경로

File f4 = new File("C:/aaa"); => 상대경로
=>프로젝트/src/패키지명/ *.java
=>C:/aaa 경로

// .:현재디렉토리  ..:상위디렉토리

---------------------------------------------------

메소드

f5.exists() : t/f
f5.isFile()
f5.isDirectory()
f5.length()
f5.getName()
f5.getxxxPath()
f5.canRead()
f5.canWrite()
f5.lastModified()
f5.mkdir()
f5.delete()
f5.list()

C:\temp\file.txt
c:/temp/file.txt
C:\\temp\\file.txt

------------------------------------------------------------------


FileInputStream 
FileOutputStream 
-------------------------------
read()			write(byte[])
read(byte[])
close()

FileReader
FileWriter
-------------------------------
read()			write(Char[])
read(char[]) 
close()
*.gif, jpg, png 이미지 : 
*.txt 텍스트 : reader writer

파일 입출력
1. 파일 오픈: 파일 이름 window 자바 프로그램 사용 권한 전달
FileReader fr = new FileReader("a.txt");
FileInputStream fis = new FileInputStream("a.gif");

File f = new File("a.txt");
FileReader fr = new FileReader(f);

2. 파일 입력 (-1 : end of file(eof))
while(r=fr.read() != -1){
	sop((char)r); 
}
3. 파일 닫기 : 자바 프로그램 사용 권한 window로 전달
fr.close();


while(sc.hasNextLine()) {
	String[] student =new String[sc.nextLine().length()];
	for(int i = 0 ; i<sc.nextLine().length() ; i++) {
		student[i] += sc.nextLine();
		//System.out.println(student[i]);
		Scanner sc2 = new Scanner(student[i]);
		String[] info = new String[sc2.next().length()];
		for(int j = 1; j<sc2.next().length(); j++) {
			info[j] += sc2.next();
			int sum = 0;
			sum +=  Integer.parseInt(info[j]);
			System.out.println(sum);
		}
	}
}
--------------------------------------------------------------

2. 파일 출력
fr.write(97); //a
fr.write("java"); //java

3. 파일 닫기 : 자바 프로그램 사용 권한 window로 전달
fr.close();


















