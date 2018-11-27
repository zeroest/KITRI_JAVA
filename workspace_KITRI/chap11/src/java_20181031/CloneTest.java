package java_20181031;

class Test implements Cloneable {
	int a = 10;

	public Object clone() throws CloneNotSupportedException {
		return super.clone();

	}
}

public class CloneTest {
	public static void main(String[] args) {
		try {

			Test t = new Test();
			Test t2 = (Test) t.clone();
			System.out.println(t == t2);
			System.out.println(t.equals(t2));
		} catch (CloneNotSupportedException e) {
			System.out.println(e.getMessage());
		}

	}
}
