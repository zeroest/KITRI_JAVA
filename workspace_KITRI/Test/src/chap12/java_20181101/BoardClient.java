package chap12.java_20181101;

public class BoardClient extends Thread {
	
	public void run() {
		for(int i =1; i<=5 ; i++) {
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("게시물" +i+"번 작성합니다");
		}
	}//run end

}//class end
