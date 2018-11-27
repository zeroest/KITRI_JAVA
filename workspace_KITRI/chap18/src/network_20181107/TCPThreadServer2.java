package network_20181107;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class TCPThreadServer2 {
	public static void main(String[] args) throws IOException {
//0. 시작:port설정:접속 서비스
		ServerSocket ss = new ServerSocket(50001);
		System.out.println("서버가 50001 포트에서 대기중");
//1. 접속 모니터링 , 감지시 수락
// 네트워크 양끝점 논리적 개념	
		while (true) {
			Socket s = ss.accept();
			Thread t = new TCPThread(s);
			t.start();
		}// outter while end
//	ss.close();
//	System.out.println("서버가 50001 포트에서 종료");

	}
}// class end


class TCPThread extends Thread {
	
	Socket s;
	
	TCPThread (Socket s){
		this.s = s;
	}
	
	public void run() {
		try {
		InetSocketAddress clientip = (InetSocketAddress) s.getRemoteSocketAddress();
		System.out.println(clientip.getHostString() + " 클라이언트 접속 허락");
//2. 클라이언트로부터 문자열 입력
		// 2-1.소켓입력객체 생성
		InputStream is = s.getInputStream();
		Scanner sis = new Scanner(is);

		OutputStream os = s.getOutputStream();
		PrintWriter pw = new PrintWriter(os);

		// 클라이언트 quit 입력 : 서버x
		while (sis.hasNextLine()) {
			String input = sis.nextLine();
			System.out.println("서버 입력(클라이언트에서 출력) = " + input);
/*			if (input.equals("로그인")) {
				input = "hr 아이디 로그인완료";
			} else if (input.equals("회원가입")) {
				input = "java 아이디 가입완료";
			} else if (input.equals("게시물작성")) {
				input = "제목 내용 작성자 필수";
			}*/
//3. 클라이언트에게 전송 내용 확인=서버 출력
			pw.print(input + "(내용확인)");
			// pw.flush();
			System.out.println(input + ": 전송");
		}// inner while end

//8. 서버가 접속 요청 클라이언트와 해제
		pw.close();
		sis.close();
		s.close();
		System.out.println("클라이언트 접속 해제");
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
}
