Object 
	public STring toString() : 객체 출력 이전에 자동 먼저 호출 객체 출력 내용 변경의도
	public boolean equals(Object obj) : 주소가 아닌 다른부분(직접 설정) 비교 변경의도
------------------------------------------------------------------	
System
	System.out.println() : 모니터 출력
	System.in.read() : 키보드 입력
	System.exit(0) : >main 메서드 종료! return>메서드만 종료 break>반복문만 종료 
	System.currentTimeMillis(); 1/1000 초 현재시간
	1970/01/01 ~ 기준 현재경과
------------------------------------------------------------------	
Class 클래스 정보
	존재 여부 / 변수 메소드 생성자(reflection) / 객체 생성
	getClass().getName():클래스이름
	Class c = Class.forName("A");
	c.newinstance(); => new A(); : 기본 생성자만 가능하다
	Field[] <=c.getDeclaredFields()
	Method[] <=c.getDeclaredmethods()
	Constructor[] <=c.getDeclaredConstructors()
------------------------------------------------------------------		
String : 내용 객체 불변
	(+, replace : 새로운 문자열 새주소값의 메모리 저장)
StringBuffer : 문자열 내용 수정 =>문자열+16버퍼공간

StringTokenizer : 문자열 token으로 분리
	StringTokenizer st = new StringTokenizer("String","Token");
	while(st.hasMoreTokens()){
		st.nextToken();
	}
	
split("[구분자]")
	
Regular Expression(정규표현식) : 문자열 특정양식 맞도록 작성 검사
	포함내용들			횟수					
	[A-Za-z0-9]		{1}					+ : 1개이상
	\w 위와같다		{1,} 1개이상 = +		* : 0개이상
	[0-9]=\d		{3,6} 3개이상 6개이하	\w: 숫자 알파벳
					{0,} = *			\d: 숫자

	String reg = "[a-zA-Z0-9]{3,6}-\\w+-\\d*-(.com|.net)";		
------------------------------------------------------------------	
int Integer
double Double	


======================================================================

Math 클래스 : static final 
1. 상속불가
2. 객체생성 필요 없다.
3. Math.xxx

11장 날자 포맷 클래스

java.util.Date

Date d = new Date(); //현재시간과 날짜정보
Date d = new Date(2018,10,31,12,12,12); //시간과 날짜정보 설정
Date d = new Date(long); //1970년1월1일 ~ 1/1000초 단위 경과 날짜

//생성자나 메소드 : deprecated 선언 : 사용자 제한권고
		Date d1 = new Date();
		Date d2 = new Date(999999999999L);
		Date d3 = new Date(2018,10,1,12,12,12);
		
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		System.out.println(d1.getTime());


변수
메소드

java.util.Calendar : Date의 문제점을 보완한 클래스

//Calendar cal = new Calendar(); 
//=>추상클래스
//=> 생성자가 private(다른 클래스에서 생성자 호출x)
Calendar cal = Calendar.getInstance();
//=>public static 메소드 : 생성자 호출 .getInstance()
		System.out.println(cal);
		/*java.util.GregorianCalendar
		[time=1541037178451,areFieldsSet=true,areAllFieldsSet=true,
		lenient=true,zone=sun.util.calendar.ZoneInfo[id="Asia/Seoul",
		offset=32400000,dstSavings=0,useDaylight=false,transitions=22,
		lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,
		YEAR=2018,MONTH=10,WEEK_OF_YEAR=44,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,
		DAY_OF_YEAR=305,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,
		HOUR=10,HOUR_OF_DAY=10,MINUTE=52,SECOND=58,MILLISECOND=451,
		ZONE_OFFSET=32400000,DST_OFFSET=0]*/
		
		int year =cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1; //10 11월이나 0부터 시작
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		int min = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		System.out.println(
				"오늘은 "+year+"년도"+month+"월"+day+"일"
						+hour+"시"+min+"분"+second+"초 입니다.");
		
		cal.set(Calendar.DAY_OF_MONTH, day+7);
		year =cal.get(Calendar.YEAR);
		month = cal.get(Calendar.MONTH)+1; //10 11월이나 0부터 시작
		day = cal.get(Calendar.DAY_OF_MONTH);
		hour = cal.get(Calendar.HOUR_OF_DAY);
		min = cal.get(Calendar.MINUTE);
		second = cal.get(Calendar.SECOND);
		System.out.println(
				"오늘은 "+year+"년도"+month+"월"+day+"일"
						+hour+"시"+min+"분"+second+"초 입니다.");


java.text.SimpleDateFormat
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss E");
		String date = sdf.format(cal.getTime());
		System.out.println(date);


java.text.DecimalFormat
		DecimalFormat df = new DecimalFormat("#.##");
		double d = 1234.56789;
		String sd = df.format(d);
		System.out.println(sd);



======================================================================

12장 멀티스레드 개념 / 필요 / api / 순서

program : cpu가 실행 가능한 이진 코드 집합체


process : 현재 cpu가 실행 중인 프로그램
ex) ie 웹서핑 , word 문서작업 , eclipse 자바소스
	
	multi process : 3개 작업이 동시에 실행 되는것 처럼 보이나
		1개의 cpu가 3개 작업 적절히 시간 분배 실행

thread : 1개 프로세스 내부 작업 단위

	multi thread : 1개 프로세스 여러개 스레드 동시 실행 구조(번갈아가며 시간 분배)
	ie프로세스 음악 사이트 thread = class 객체.run(){}
			다운로드 사이트 thread = class 객체.run2(){}
			뉴스게시판 사이트 thread = class 객체

	구현
	1. 자바방식
	2. win,unix 자바소스 동일 but 결과값 서로 다르다 => 결과 예측할 수 없다.
	
-자바 스레드 구현 api
:java.lang.Thread클래스
:java.lang.Runnable인터페이스

===Thread 클래스===
1. 멀티스레드 클래스 정의 : 변수 + 메소드
	class A extends Thread{
		변수 + 생성자 + 다른메소드+...
		public void run(){
			음악-다운로드-뉴스 동시 실행 문장
		}//의무적으로 오버라이딩 하자
	}
2. 멀티스레드 객체 생성
	A a1 = new A();
	또는
	Thread t1 = new A();
3. 멀티스레드 메소드 실행 (번갈아가며 동시에)
	a1.start(); //run시작 메소드
	t1.start(); //멀티스레드 배열 저장 run();

	a1.run() // 멀티스레드 동작이 아닌 싱글 스레드로 작업 

===Runnable 인터페이스===
이미 상위 클래스를 상속받으면서 멀티스레드를 적용하고 싶을때
1. 멀티스레드 클래스 정의 : 변수 + 메소드
	class A extends C implements Runnable{
		변수 + 생성자 + 다른메소드+...
		public void run(){
			음악-다운로드-뉴스 동시 실행 문장
		}//의무적으로 오버라이딩 하자
	}
2. 멀티스레드 객체 생성
	2-1 Runnable 타입 객체 생성 = Runnable 구현 클래스 객체생성
	A a1 = new A();
	또는
	Runnable r1 = new A();
	2-2 Thread 타입 변환(Thread 생성자(Runnable))
	Thread ta1 = new Thread(a1);
	Thread tr1 = new Thread(r1);
	
3. 멀티스레드 메소드 실행 (번갈아가며 동시에)
	ta1.start(); //run시작 메소드
	tr1.start(); //멀티스레드 배열 저장 run();

	a1.run() // 멀티스레드 동작이 아닌 싱글 스레드로 작업 

Runnable 하위 객체 생성 = Runnable 구현 클래스 객체 생성
Runnable 타입 객체 생성 


java.lang.Thread				java.lang.Runnable
----------------------------------------------------------------
public void run()				public void run()
오버라이딩							오버라이딩	
start():호출
setName()/getName()
Thread.CurrentThread()
현재실행중인 스레드 객체

setPriority()
getPriority()




new Thread:생성상태 => start()호출:대기상태 => run()실행중:실행상태 => run()완료:종료상태
		자동우선순위(5)					|
-스레드 스케줄러 : Thread 실행 순서를 지정해준다!
1. 우선순위 높은 것 먼저 실행 
2. setPriority(1) / setPriority(10) getPriority()
3. time slice = round robin(시간 분배) os가 설정

우선순위
10	t1(5초),t2(5초)
5	t3(3초)
1	t4(1초)



일시중지상태 : 중지후 다시 대기상태로 돌아가게 된다.
sleep / join / synchronized

1. sleep(1/1000초) : 1/1000초 경과후 대기상태로
2. join() : 다른 스레드의 결과값이 필요한 경우 필요한 스레드.join()하여 먼저 실행하고 필요한 나는 중지
			필요한 스레드 완료후 다시 재개
3. synchronized

===================================================================

1. 스레드 결과 불분명
"여러개 스레드 동시 실행"
2. run() /start() / sleep() / join()
3. synchronized / wait / notify / ...
4. servlet / jsp :웹서버 실행 자바 프로그램들 > 이미 멀티스레드 구현 상태 api
5. 1개의 프로그램이 여러 서비스를 요구하는 클라이언트 프로그램을 상대할 때 멀티스레드
6. 
