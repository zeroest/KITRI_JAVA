package java_20181106;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class IPinfoTest {
	public static void main(String[] args) throws UnknownHostException {
		
		InetAddress myip = InetAddress.getLocalHost();
		System.out.println(myip.getHostAddress());
		//www.daum.net : ip
		
		InetAddress daum = InetAddress.getByName("www.daum.net");
		System.out.println(daum);
		System.out.println();
		
		InetAddress[] ips = InetAddress.getAllByName("www.daum.net");
		for(InetAddress inet : ips) {
			System.out.println(inet.getHostAddress());
		}
		
	}
}
