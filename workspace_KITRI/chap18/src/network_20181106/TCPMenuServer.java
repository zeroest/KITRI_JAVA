package network_20181106;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPMenuServer {
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
		
		
		
		
		
		
		InputStream is = s.getInputStream();
		//4-2. 입력받은 데이터 저장용 바이트배열 생성
		byte b[] = new byte[100];
		//4-3. 입력받아서 b배열 저장 , cnt 입력갯수
		int cnt = is.read(b);//
		//4-4. String.getBytes(); => String 변환
		String input = new String(b, 0 , cnt);
		System.out.println("서버 입력(클라이언트에서 출력) = "+input);
		
		
		//서버 프로그램 - hr아이디 로그인 완료
					//java아이디 가입완료
					//제목 내용 작성자 필수
		//클라이언트로 출력
		
		OutputStream os = s.getOutputStream();
		String answer = "";
		switch(input){
			case "로그인" :
				answer = "hr 아이디 로그인 완료";
				break;
			case "회원가입" :
				answer = "java 아이디 가입완료";
				break;
			case "게시물작성" :
				answer = "제목 내용 작성자 필수";
				break;
			default :
				answer = "다시 입력해 주세요!";
				break;
		}
		
		
		byte[] b2 = answer.getBytes();
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
