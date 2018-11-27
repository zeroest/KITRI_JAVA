package java_20181031;



public class SystemTest {
	
	void test() {
		int random = (int)(Math.random()*100)+1;
		System.out.println(random);
		//1970년 1월 1일 0 0 0 ~ 현재 경과 1/1000초
		long start = System.currentTimeMillis();
		
		for(int i = 1 ; i <= 1000; i++) {
			//random i 같으면 프로그램중단
			//if(random == i) System.exit(0); //--------------------
			System.out.println(i);
		}
		long end = System.currentTimeMillis()-start;
		System.out.println(end+"(1/1000초) 소요");
		
		System.out.println("반복문 이후 실행");
	}

	public static void main(String[] args) {

		SystemTest st = new SystemTest();
		System.out.println("test호출이전");
		
		System.out.println();
		st.test();
		System.out.println("test호출이후");
		
		System.out.println(System.getProperty("os.name"));
		System.out.println(System.getProperty("user.name"));
		System.out.println(System.getProperty("user.home"));
		System.out.println(System.getProperty("java.home"));
		System.out.println(System.getProperties());


	}

}
