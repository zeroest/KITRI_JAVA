package java_20181105;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriterTest {

	public static void main(String[] args) throws IOException { // 예외메시지출력(or try-catch로 메세지 설정)

		// FileWriter 파일존재 x : empty 파일 생성
		// FileWriter 파일존재o : 기존 파일 재저장
		// 파일 저장 내용 유지하며 + 추가 출력 (true)
		// 파일 저장 내용 삭제하고 + 출력 (false)
		FileWriter fw = new FileWriter("score.txt", true);
		/*fw.write('A'); // a
		fw.write(98); // b
		fw.write(99); // c
		fw.write(100); // d
		fw.write("\r\njava 프로그래밍\r\n");*/
		//키보드 입력 학생명 점수1 점수2 점수3
		
		Scanner sc = new Scanner(System.in);
		fw.write("\r\n"+sc.nextLine());
		
		//fw.write("\r\n이학생 91 45 69");
		fw.close(); //close하지 않을시 임시저장 데이터를 삭제함 rollback;

	}

}
