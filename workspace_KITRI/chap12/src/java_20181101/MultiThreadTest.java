package java_20181101;

class ExampleThread extends Thread{
	
	
	ExampleThread(String name){
		super(name); //Thread (String name)호출
	}
	
	public void run() {
		for(int i = 0; i<=10; i++) {
			System.out.println(getName() + ":" + i);
		}
	}
}



public class MultiThreadTest {

	public static void main(String[] args) {
		
		ExampleThread e1 = new ExampleThread("first");
		ExampleThread e2 = new ExampleThread("second");
		
		e1.start();
		e2.start();
		/*
		e1.run();
		e2.run();
		*/
		System.out.println(Thread.currentThread().getName()+": main종료!");
		
		
		
		
	}
	
}
