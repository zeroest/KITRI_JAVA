http://183.101.196.162:9090/java/

//배열 복사
System.arraycopy(origin, 0, newar, 0, origin.length);
				(src, srcPos, dest, destPos, length)

				
//문자열 정수화 실수화	
double sample = Double.parseDouble(args[0]);
int first = Integer.parseInt(args[0]); =>10진수
int first = Integer.parseInt("100",2); =>2진수 변경
int first = Integer.parseInt("100",8); =>8진수 변경
int first = Integer.parseInt("100",16); =>16진수 변경
	

//문자값 비교				
if(s1 == s2) true / if(s1.equls(s2)) true
if(s3 == s4) false / if(s3.equls(s4)) true 
=> 주소값을 참조하여 boolean 하기 때문에 //cf) equalsIgnoreCase()				


//난수 생성
(Math.random()*최대값-시작값(시작값이 1이상일 경우))+시작값
0<random<1


//int 최대,최소값 (Byte, Short, Integer, Long, Float, Double)
Integer.MAX_VALUE
Integer.MIN_VALUE


//upper, lower
변수.toUpperCase()
변수.toLowerCase()
변수.equlsIgnoreCase()


//문자열로 변환
String result = String.valueOf(otherType);
//문자 타입 배열로 변환
char[] digits1 = number.toCharArray();
======>수의 분리 된 숫자를 얻는 방법


//올림 내림 반올림
Math.ceil()
Math.floor()
Math.round()
double pie = 3.14159265358979;
s.o.p(Math.round(pie)); //결과 : 3
s.o.p(Math.round(pie*100)/100.0); //결과 : 3.14
s.o.p(Math.round(pie*1000)/1000.0); //결과 : 3.142
https://coding-factory.tistory.com/250

//String.format()
double pie = 3.14159265358979;
double money = 4424.243423;
s.o.p(String.format("%.2f", pie)); //결과 : 3.14
s.o.p(String.format("%.3f", pie)); //결과 : 3.142
s.o.p(String.format("%,.3f", money)); //결과 : 4,424.243


//
substring(int beginindex, int endindex)
"18-10-10".substring(3,5); = 10월
"오리(꽥꽥이)".substring(3,name.length()-1); = 꽥꽥이
http://jamesdreaming.tistory.com/81
s.substring((s.length()-1) / 2, s.length()/2 + 1);

//Buffered
BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //선언
String s = bf.readLine(); //String
int i = Integer.parseInt(bf.readLine()); //Int

BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));//선언
String s = "abcdefg";//출력할 문자열
bw.write(s+"\n");//출력
bw.flush();//남아있는 데이터를 모두 출력시킴
bw.close();//스트림을 닫음
https://coding-factory.tistory.com/251?category=758267
https://wikidocs.net/227

//비정형 매개변수
void m2(int...i){//배열처럼
(i.length i[0]..)
for(int j = 0 ; j<i.length ; j++){
	sum = sum+i[j];
}
}
m2(1,2,3,4,5);

====================================================================

//System

// 시간측정
long start = System.currentTimeMillis();
long end = System.currentTimeMillis()-start;
		System.out.println(end+"(1/1000초) 소요");

// main 프로그램종료
System.exit(0); 

//getProperty
System.out.println(System.getProperty("os.name"));
System.out.println(System.getProperty("user.name"));
System.out.println(System.getProperty("user.home"));
System.out.println(System.getProperty("java.home"));
System.out.println(System.getProperties());

====================================================================

//Class

class A{
	void test() {
		System.out.println(getClass().getName());
	}
}

Class obj = Class.forName("java.lang.String");
obj.getDeclaredConstructors();
obj.getDeclaredFields();
obj.getDeclaredMethods();
			
//java.lang.Object 객체 생성시
Class target = Class.forName(args[0]);
target.newInstance(); //기본생성자 호출

====================================================================

//String

String s1 = "java"; //new 키워드 없이 객체 생성 가능;
String s2 = new String("java");

byte[] b = {65,66,67,68}; // -128~127 정수 배열
		//	A  B  C  D
String s3 = new String(b); // "ABCD"
System.out.println(s3);

char c[] = {'a','b','c','d'};
String s4 = new String(c);
System.out.println(s4);

String s5 = new String(b, 0, 2); //"AB"
System.out.println(s5);
	
//String s6 = new String("자바".getBytes("8859_1"),"utf-8");
	
System.out.println(s1.equals(s2));
System.out.println(s3.equals(s4));
System.out.println(s3.equalsIgnoreCase(s4));
System.out.println(s3.equals(s4.toUpperCase()));
		
//s4, s5 문자열 갯수 큰 변수 문자열 출력
if(s4.length() >= s5.length()){
System.out.println(s4);
}else System.out.println(s5);
System.out.println(s1.substring(1)); //1 "ava"
System.out.println(s1.substring(1,3)); //1,2 "av"

System.out.println(s1.charAt(0)); //"j"
System.out.println(s1.charAt(s1.length()-1)); // "a"
		
System.out.println("servletjspspringandroid".indexOf('e')); // 1
System.out.println("servletjsp".replace("jsp", "spring")); // servletspring
		
System.out.println("--"+"   servlet jsp   ".trim()+"--"); 
System.out.println(String.valueOf(100)+100); // 정수를 스트링으로


====================================================================
//String.split() : 결과를 배열로 받아 사용
String address2 = "서울시-구로구/구로동;코오롱밸리:5강의장-키트리";
		
String[] add2 = address2.split("[-/;:]"); //공백문자 : \s => "\\s"
		
for(int i = 0 ; i<add2.length ; i++) {
	System.out.println(add[i]);
}


StringTokenizer st2 = new StringTokenizer(address2, "-:;/");

int cnt = 0;
while(st2.hasMoreTokens()) {
	System.out.println(st2.nextToken());
	cnt++;
}
System.out.println(cnt);

StringBuffer : 문자열 + 버퍼 (문자열 길이 변경 가능)
	
	StringBuffer sb = new StringBuffer("java", 10);
	sb.append("program"); => "javaprogram"
	heap 영역에 java와 함께 10개의 추가 메모리를 함께 저장
	따라서 주소값 변화 없이 program을 추가로 저장할 수 있다.
	자바가 스스로 버퍼공간을 추가로 확보한다
	(+연산자 : heap 영역에 메모리가 점점 쌓여갈것 따라서 자주 바뀌는 문자열은 StringBuffer로 저장하자!)
	sb.reverse();

=========================================================================
//정규표현식
포함내용들			횟수					
[A-Za-z0-9]		{1}					+ : 1개이상
\w 위와같다		{1,} 1개이상 = +		* : 0개이상
[0-9]=\d		{3,6} 3개이상 6개이하	\w: 숫자 알파벳
				{0,} = *			\d: 숫자	
	
String email = "MYmail@Kitri11.co.kr";
String reg = "\\w+@\\w*.(com|co.kr)";
System.out.println(Pattern.matches(reg, email));	

String phonenum1 = "010-222-4444";	
String regphone = "(010|02)-\\d{3,4}-[0-9]{4}";	
System.out.println(Pattern.matches(regphone, phonenum1));		
