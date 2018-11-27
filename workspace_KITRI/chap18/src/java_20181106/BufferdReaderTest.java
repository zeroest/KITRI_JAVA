package java_20181106;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferdReaderTest {

	public static void main(String[] args) throws IOException {
		
		FileReader fr = new FileReader("sample.ppt");
		// 버퍼 없이 파일입력 테스트1
		long start = System.currentTimeMillis();
		while(true)
		{
			int result = fr.read();
			//System.out.println(result);
			if (result == -1)
				break;
		}
		
		long end = System.currentTimeMillis() - start;
		System.out.println("소요시간(버퍼없이) = " + end);
		fr.close();
		
		
		
		
		
		
		//버퍼 저장 입력 테스트 2
		
		
		FileReader fr2 = new FileReader("sample.ppt");
		BufferedReader br2 = new BufferedReader(fr2);
		// 버퍼 없이 파일입력 테스트1
		long start2 = System.currentTimeMillis();
		while(true)
		{
			String result = br2.readLine();
			//System.out.println(result);
			if (result == null)	break;
		}
		
		long end2 = System.currentTimeMillis() - start2;
		System.out.println("소요시간(버퍼저장) = " + end2);
		br2.close();
		fr2.close();

	}
}
