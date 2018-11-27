package chap18.java_20181106;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class CartClient {

	public static void main(String[] args) throws IOException {

		Socket s = new Socket();
		String ip = "127.0.0.1";
		int port = 50001;
		s.connect(new InetSocketAddress(ip , port));
		System.out.println(ip+" 컴퓨터에 "+port+"번 포트로 접속합니다.");

//=====================서버 접속 ===========================================

		System.out.println("===카트번호:상품명:가격:수량===");

		OutputStream os = s.getOutputStream();
		PrintWriter pw = new PrintWriter(os);
		//PrintWriter pw = new PrintWriter(s.getOutputStream());
		InputStream is = s.getInputStream();
		Scanner sis = new Scanner(is);
		//Scanner sis = new Scanner(s.getInputStream());
		Scanner sc = new Scanner(System.in);

		int cnt = 1;
		while (cnt < 6) {

			String content = sc.nextLine();
			String[] arr = content.split(" ");

			if (arr.length == 4) {
				if (isint(arr[0], arr[2], arr[3])) {
					pw.println(content);
					pw.flush();
					System.out.println("Server Output Success");
					

					String result = sis.nextLine();
					System.out.println(result);
				} else
					System.out.println("다시 입력해 주세요");
			} else if (content.equals("stop")) {
				System.out.println("입력을 중단합니다.");
				break;
			} else
				System.out.println("다시 입력해 주세요");
			cnt++;
			if(cnt == 5) System.out.println("5개 입력 완료하셨습니다.");
		}

		s.close();
		sc.close();
		os.close();
		pw.close();
		is.close();
		sis.close();

	}// main end

	public static boolean isint(String str1, String str2, String str3) {
		try {
			Integer.parseInt(str1);
			Integer.parseInt(str2);
			Integer.parseInt(str3);
			return true;
		} catch (Exception e) {
			return false;
		}
	} // method end

}
