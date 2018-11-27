package java_20181025;

class Person {// 사람 객체 표현

	String name;
	int age;
	static String nation = "대한민국";

	void introduce() {

		System.out.println(" 객체의 이름은 " + name + " 이고 나이는 " + age + " 이며 국적은 " + nation + " 입니다.");
	}
	/*static void printNation(){
		System.out.println(nation+"은 공통");
	}*/

}

public class PersonTest {

	public static void main(String[] args) {

//		System.out.println(Person.nation);
		/*Person.printNation();*/

		Person p1 = new Person();

		p1.name = "홍길동";
		p1.age = 25;

		p1.introduce();


		Person p2 = new Person();

		p2.name = "이자바";
		p2.age = 35;

		p2.introduce();
		/*
		 * System.out.println("p2 참조 객체의 이름은 " + p2.name + " 이고 나이는 " + p2.age +
		 * " 이며 국적은 " + p2.nation + " 입니다.");
		 */

	}
}
