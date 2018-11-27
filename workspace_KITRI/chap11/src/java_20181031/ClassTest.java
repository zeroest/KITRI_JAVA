package java_20181031;

class A{
	void test() {
		System.out.println(getClass().getName());
	}
}

public class ClassTest {
	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		
		try {
			
			A a1 = new A();
			a1.test();
			
			Class obj = Class.forName("ClassTest");
			obj.getDeclaredConstructors();
			obj.getDeclaredFields();
			obj.getDeclaredMethods();
			
			//java.lang.Object 按眉 积己矫
			//Class target = Class.forName(args[0]);
			//悼利 按眉 积己
			//target.newInstance(); //扁夯积己磊 龋免
			
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
		
		
	}

}
