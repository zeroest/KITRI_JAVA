<보조 스트림>

키보드 / 파일  > Scanner > 자바
키보드 / 파일 : 데이터원본source 
Scanner : 원본 데이터타입변환 parsing

InputStreamReader / OutputStreamWriter : 한글 입출력
DataInputStream / DataOutputStream: 자바 데이터타입 입출력

------------------------------------------------------------------------

1. 파일 입력
	1> 파일 디스크 접근 수행속도 떨어진다
	2> 메모리 접근 / cpu 수행 속도
	=>디스크 접근 횟수 줄이자!
	
파일			> 메모리 >			자바
FileReader 	파일을 모두 저장		자바는 메모리에서 데이터를 가져온다

BufferdReader / BufferdWriter
BufferdInputStream / BufferdOutputStream

BufferdReader br = new BufferdReader(파일입력객체);
파일 처음~ 끝 메모리에 저장
br.readLine();


System.out.printf()


Class Stu{
	String name;
	int kor, eng, mat, sum, avg;
}
score.txt 파일 읽은 한줄 계산 > Stu객체 생성
Stu.toString() 오버라이딩
FileWriter.write(Stu[.toString()])
=> ObjectInputStream / ObjectOutputStream


18.6 네트워크 기초

네트워크 : 여러대의 컴퓨터를 통신 회선으로 연결한 시스템
홈 네트워크 / lan 지역네트워크 => 인터넷

서버 : 클라이언트 요청 처리 컴퓨터 
클라이언트 : 다른 컴퓨터 요청

1개 서버 - 다수의 클라이언트 상대 처리 

동일 네트워크상 컴퓨터 식별할 수 있는 이름 필요하다 (식별자 : ip)
IPv4 : 0-255.0-255.0-255.0-255
	256^4
	
IPv6 

http://183.101.196.162:9090/java/
:9090 => 서비스 번호

oracle db 서비스 :1521
파일 공유 서비스 :9090

IP address : 컴퓨터 식별자
PORT Number : 1개 IP컴퓨터 여러 서비스 식별변호
(대표번호 - 구내번호)

http://www.daum.net/ ==>DOMAIN(IP address 문자 이름)
	=> 도메인단체 등록 허용 비용

IP address : 변경불가
2^16 공간 저장 = 0~65535 : 포트번호 가능 범위
0~1023 : 알려진 다른 네트워크 사용중 (절대 사용하지 말자) (http FTP TEL)
1024~50000 : 키트리 네트워크 회사 차원 네트워크 단체 사용
50000~ 65535 : 개인 사용자

====================================================================

java.net.InetAddress : ip 주소와 domain 정보 객체
windows 제공 : ipconfig/all
자바프로그램 내부 : ip 

-자바 네트워크 방식 2분류
tcp(대다수) / udp(가끔)

프로토콜 : 네트워크간 약속 규칙(네트워크 언어/방식?)

tcp 동작원리 + web >  http 네트워크방식
tcp 동작원리 + 파일 전달 >  ftp 네트워크방식
tcp 동작원리 + 원격컴퓨터 접속 >  telnet 네트워크방식


tcp 프로토콜 : 전화방식
전화 걸다 - 통화중/메세지 주고받다(다른사람과 통화x) - 전화 끊다
-----------------------------------------------------------
tcp 클라이언트 프로그램			|		tcp 서버 프로그램
-----------------------------------------------------------
									서버 늘 가동(시작:port 설정)
1. 클라이언트 접속 요청(ip,port)			2. 접속 수락
3. 업무 서버에게 요청(=출력)				4. 업무 처리(=입력)
6. 서버로부터 받은 응답(=입력)				5. 응답 클라이언트 리턴(=출력)
7. 접속 해제 요청						8. 서버 접속 해제
-----------------------------------------------------------

tcp 자바 api
java.net.ServerSocket : 서버프로그램만 구현
java.net.Socket : 서버, 클라이언트 구현


"183.101.196.162"
"192.168.15.99"












































