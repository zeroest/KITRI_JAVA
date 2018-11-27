package chap18.java_20181105;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileCopy {
	
	public static void main(String[] args) throws IOException {
		//������ �Ű����� 2�� �Է� : a.txt b.txt
		// a.txt������ b.txt���Ϸ� �����ϸ鼭 ���ι�ȣ ���� �߰�
		// b.txt ���� �����  a.txt ���ϰ� ���� ���� ����
		// ===> "���� ���� �Ϸ�Ǿ����ϴ�"	
		
		if(args.length>=2) {
			File filea = new File(args[0]);
			File fileb = new File(args[1]);
			try {
				FileReader fr = new FileReader(filea);
				FileWriter fw = new FileWriter(fileb);
				
				
				int cnt = 0;
				Scanner sc = new Scanner(fr);
				
				while(sc.hasNextLine()) {
					String line = ++cnt+": "+sc.nextLine();
									System.out.println(line);
					fw.write(line+"\r\n");
				}
				
				
				System.out.println("���Ϻ��� �Ϸ�Ǿ����ϴ�.");
				fr.close();
				fw.close();//���� - ������������
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}//if end
		
	}

}