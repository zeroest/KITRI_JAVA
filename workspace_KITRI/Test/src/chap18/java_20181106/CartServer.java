package chap18.java_20181106;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CartServer {
public static void main(String[] args) throws IOException {
		
	ServerSocket ss = new ServerSocket();
	int port = 50001;
	ss.bind(new InetSocketAddress("localhost", port));
	System.out.println("서버가 "+port+"번 포트를 열었습니다.");
	
		
//====================서버개방============================================	
	
	while(true) {
		
		Socket s = ss.accept();
		
		InetSocketAddress ClientIP = 
				(InetSocketAddress)s.getRemoteSocketAddress();
		System.out.println("클라이언트 주소 "+ClientIP+"가 접속했습니다.");
		
		InputStream is = s.getInputStream();
		Scanner sc = new Scanner(is);
		OutputStream os = s.getOutputStream();
		PrintWriter pw = new PrintWriter(os);
		
		
		List<Cart> list = new ArrayList<Cart>(5);
		
			while(sc.hasNextLine()) {
				
				String content = sc.nextLine();
					
				String[] arr = content.split(" ");
				
				Cart c = new Cart(arr);
			
				
				list.add(c);
					
				
		
				pw.println(c);
				pw.flush();
			
				System.out.println(arr[1]+" "+arr[3]+"개 "+c.sum()+"원");
				
			}//inner while end
		
		int totalPay = 0;
		for(Cart c : list) {
			totalPay += c.sum();
		}
		
		
		System.out.println("지불할 총가격 = "+totalPay+" 원 입니다.");
	
		is.close();
		sc.close();
		os.close();
		pw.close();
		
	}//outter while end
	
	
	//ss.close();
	
	
}//main end
}

