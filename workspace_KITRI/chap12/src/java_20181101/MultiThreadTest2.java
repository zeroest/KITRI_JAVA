package java_20181101;

class ExampleRunnable implements Runnable{
	String msg ;
	
	ExampleRunnable(String msg){
		this.msg = msg;
	}
	
	public void run() {
		for(int i = 0; i<=10; i++) {
			System.out.println(msg + ":" + i);
		}
	}
}



public class MultiThreadTest2 {

	public static void main(String[] args) {
		
		ExampleRunnable e1 = new ExampleRunnable("first");
		ExampleRunnable e2 = new ExampleRunnable("second");
		
		Thread te1 = new Thread(e1);
		Thread te2 = new Thread(e2);
		
		te1.start();
		te2.start();
		
		/*te1.run();
		te2.run();*/
		
		System.out.println("mainÁ¾·á!");
		
		Runnable r = new Runnable() {
			String msg;
			
			public void run() {
				for(int i = 0; i<=10; i++) {
					System.out.println(msg + ":" + i);
				}
			}
			
		};
		
		new Thread(r).start();
		
		
		
	}
	
}
