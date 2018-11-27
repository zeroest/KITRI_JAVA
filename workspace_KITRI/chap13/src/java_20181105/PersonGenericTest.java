package java_20181105;

class Person<T, K> {

	T ssn;
	K id;

	public Person(T ssn , K id) {
		this.ssn = ssn;
		this.id = id;
	}

	@Override
	public String toString() {
		return getClass().getName()+" : " +  id.toString()+" : " + ssn.toString();
	}

}

public class PersonGenericTest {

	public static void main(String[] args) {

		Person[] p = new Person[4];
		p[0] = new Person<String, String>("100-200", "java");
		p[1] = new Person<Integer, String>(100200, "java2");
		p[2] = new Person<Double, Boolean>(123.4567, true);
		p[3] = new Person<String, Integer>("010828", 1000);

		int cnt = 0;
		for (Person per : p) {
			System.out.println("p[" + cnt + "] = " + per);
			cnt++;
		}

	}

}
