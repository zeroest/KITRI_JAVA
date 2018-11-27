package network_20181106;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
public static void main(String[] args) throws IOException {
	//(시작 : port 설정 : 접속 서비스)
	ServerSocket ss = new ServerSocket(50001);
	System.out.println("서버가 50001 포트에서 대기중");
	
	//2. 접속수락(모니터링 , 감지시 수락)
	//네트워크 양끝점 논리적 개념
	while(true) {
		Socket s = ss.accept();
		InetSocketAddress clientip = 
				(InetSocketAddress)s.getRemoteSocketAddress();
		System.out.println(clientip.getHostName()+"클라이언트 접속 허락");
		
		
		
		
		
		//4. 클라이언트로부터 문자열 입력
		//4-1. 소켓입력객체 생성
		InputStream is = s.getInputStream();
		//4-2. 입력받은 데이터 저장용 바이트배열 생성
		byte b[] = new byte[100];
		//4-3. 입력받아서 b배열 저장 , cnt 입력갯수
		int cnt = is.read(b);//
		//4-4. String.getBytes(); => String 변환
		String input = new String(b, 0 , cnt);
		System.out.println("서버 입력(클라이언트에서 출력) = "+input);
		
		
		
		
		
		//5. 응답 클라이언트 리턴
		//클라이언트에게 전송 내용 확인 =서버 출력
		//5-1. 클라이언트로 출력객체 생성
		OutputStream os = s.getOutputStream();
		//5-2. 바이트배열 생성
		input += "(전송내용확인)";
		byte[] b2 = input.getBytes();
		//3-4. 서버출력객체 바이트배열 저장
		os.write(b2);
		System.out.println("서버가 출력(클라이언트로 전송)");
		
		
		
		
		
		//8. 서버가 접속 요청 클라이언트와 접속해제
		s.close();
		System.out.println("클라이언트 접속 해제");
	}//while end
	
//	ss.close(); //서버 자체를 종료해버린다 
//	System.out.println("서버가 50001 포트에서 종료");
	
	
}//main end
}
