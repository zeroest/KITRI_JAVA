package network_20181106;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class TCPClient {
public static void main(String[] args) throws IOException {
		
	//1. 클라이언트 접속 요청
	//시작 : 접속 서버의 ip, port 부여하고 접속 시도
	Socket s = new Socket("192.168.15.99", 50001);
	System.out.println("클라이언트 접속 요청");
	
	
	
	
	// 업무요청 - 서버처리 - 응답 결과 리턴
	//3.업무 서버에게 요청(=출력)
	//"Hello 서버" 문자열 전송 = 서버로 출력
	//3-1. 서버출력객체 생성
	OutputStream os = s.getOutputStream();
	//3-2. 서버출력 문자열 생성
	String toServer = "Hello 서버";
	//3-3. 바이트배열 생성
	byte[] b = toServer.getBytes();
	//3-4. 서버출력객체 바이트배열 저장
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
