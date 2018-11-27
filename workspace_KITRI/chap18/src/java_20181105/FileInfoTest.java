package java_20181105;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class FileInfoTest {
	
	public static void main(String[] args) {
		
		//명령행매개변수 : 미리 필요 입력값 제공
		//키보드 : 대화즉각
		
		System.out.println("파일명이나 디렉토리명을 입력하시오");
		System.out.print("파일명: ");
		
		Scanner sc = new Scanner(System.in);
		
		String name = sc.nextLine();
		
		File f1 = new File(name);
		if(f1.exists()) {
			
			if(f1.isFile()) {
				//파일
				try {
					System.out.println("파일경로 = "+f1.getCanonicalPath());
				} catch (IOException e) {
					System.out.println(e.getMessage());
				}
				System.out.println("파일길이(byte단위= "+f1.length());
				System.out.println("파일읽기여부 = "+f1.canRead());
				System.out.println("파일쓰기(파일출력)여부 = "+f1.canWrite());
				
				Date last = new Date(f1.lastModified());
				SimpleDateFormat sdf = new SimpleDateFormat
						("yyyy년 MM월 dd일 HH시 mm분 ss초");
				System.out.println("최종파일 수정시각 = "+sdf.format(last));
				
			}else {
				//디렉토리
				try {
					System.out.println("파일경로 = "+f1.getCanonicalPath());
				} catch (IOException e) {
					System.out.println(e.getMessage());
				}
				String[] files = f1.list();
				for(String s : files) {
					File fs = new File(s);
					/*if(fs.isFile()) { //파일만 출력
						System.out.println(s);
					}*/
					if(fs.isDirectory()) { //디렉토리만 출력
						System.out.println(s);
						String[] fsfiles = fs.list();
						for(String ss : fsfiles) {
							System.out.println(ss);
						}
						
					}
				}
			}
		}else {
			System.out.println("파일명 또는 디렉토리명 확인");
		}
		
		
	}

}
