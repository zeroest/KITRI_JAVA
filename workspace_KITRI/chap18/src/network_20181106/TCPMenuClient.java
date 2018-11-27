package network_20181106;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class TCPMenuClient {
public static void main(String[] args) throws IOException {
		
	//1. 클라이언트 접속 요청
	//시작 : 접속 서버의 ip, port 부여하고 접속 시도
	Socket s = new Socket("192.168.15.99", 50001);
	System.out.println("클라이언트 접속 요청");
	
	
	//클라이언트 프로그램 - 키보드 입력 : 로그인 / 회원가입 / 게시물 작성 / quit
	//서버 출력
	System.out.println("로그인 / 회원가입 / 게시물작성");
	Scanner sc = new Scanner(System.in);
	
	OutputStream os = s.getOutputStream();
	String toServer = sc.nextLine();
	byte[] b = toServer.getBytes();
	os.write(b);
	System.out.println("클라이언트가 출력(서버로 전송)");
	
	
	
	
	
	
	
	
	//6. 서버로부터 받은 응답(=입력)
	//6-1. 소켓입력객체 생성
	InputStream is = s.getInputStream();
	//6-2. 입력받은 데이터 저장용 바이트배열 생성
	byte b2[] = new byte[100];
	//6-3. 입력받아서 b배열 저장 , cnt 입력갯수
	int cnt = is.read(b2);//
	//6-4. String.getBytes(); => String 변환
	String input = new String(b2, 0 , cnt);
	System.out.println("클라이언트 입력(서버 출력) = "+input);
	
	
	
	

	
	
	//8. 서버가 접속 요청 클라이언트와 접속해제
	s.close();
	System.out.println("클라이언트 접속 해제");
	
}//main end
}
