package chap18.java_20181105;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileCopy {
	
	public static void main(String[] args) throws IOException {
		//명령행 매개변수 2개 입력 : a.txt b.txt
		// a.txt파일을 b.txt파일로 복사하면서 라인번호 왼편 추가
		// b.txt 파일 열어보면  a.txt 파일과 같은 내용 저장
		// ===> "파일 복사 완료되었습니다"	
		
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
				
				
				System.out.println("파일복사 완료되었습니다.");
				fr.close();
				fw.close();//버퍼 - 파일최종저장
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}//if end
		
	}

}
