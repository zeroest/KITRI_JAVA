package java_20181101;

class JoinThread extends Thread{
	
	int sum=0;
	
	public void run() {
		for(int i = 0 ; i<=100; i++) {
			sum+=i;
			System.out.println(sum);
		}
	}
}


public class JoinThreadTest {
	
	public static void main(String[] args) {
		
		JoinThread jt = new JoinThread();
		//jt생성  main실행
		
		jt.start(); // run() 실행
		//jt대기 main실행(jt, main 번갈아가며 실행)
		
		try {
			jt.join();
		} catch (InterruptedException e) {
			System.out.println("조인스레드실행불가");
		}
		//jt실행  main일시중지
		
		System.out.println("1-100총합 = "+jt.sum);
		//jt종료  main실행
		System.out.println("메인종료");
		//main종료
		
		
	}

}
