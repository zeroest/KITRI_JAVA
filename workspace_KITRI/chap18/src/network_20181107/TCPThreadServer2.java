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
//0. ����:port����:���� ����
		ServerSocket ss = new ServerSocket(50001);
		System.out.println("������ 50001 ��Ʈ���� �����");
//1. ���� ����͸� , ������ ����
// ��Ʈ��ũ �糡�� ������ ����	
		while (true) {
			Socket s = ss.accept();
			Thread t = new TCPThread(s);
			t.start();
		}// outter while end
//	ss.close();
//	System.out.println("������ 50001 ��Ʈ���� ����");

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
		System.out.println(clientip.getHostString() + " Ŭ���̾�Ʈ ���� ���");
//2. Ŭ���̾�Ʈ�κ��� ���ڿ� �Է�
		// 2-1.�����Է°�ü ����
		InputStream is = s.getInputStream();
		Scanner sis = new Scanner(is);

		OutputStream os = s.getOutputStream();
		PrintWriter pw = new PrintWriter(os);

		// Ŭ���̾�Ʈ quit �Է� : ����x
		while (sis.hasNextLine()) {
			String input = sis.nextLine();
			System.out.println("���� �Է�(Ŭ���̾�Ʈ���� ���) = " + input);
/*			if (input.equals("�α���")) {
				input = "hr ���̵� �α��οϷ�";
			} else if (input.equals("ȸ������")) {
				input = "java ���̵� ���ԿϷ�";
			} else if (input.equals("�Խù��ۼ�")) {
				input = "���� ���� �ۼ��� �ʼ�";
			}*/
//3. Ŭ���̾�Ʈ���� ���� ���� Ȯ��=���� ���
			pw.print(input + "(����Ȯ��)");
			// pw.flush();
			System.out.println(input + ": ����");
		}// inner while end

//8. ������ ���� ��û Ŭ���̾�Ʈ�� ����
		pw.close();
		sis.close();
		s.close();
		System.out.println("Ŭ���̾�Ʈ ���� ����");
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
}