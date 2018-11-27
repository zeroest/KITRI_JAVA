package chap15.java_20181102;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

class Student {
	private int id;
	private String name;
	private int kor, eng, mat, sum, avg;

	public Student(int id, String name, int kor, int eng, int mat) {
		this.id = id;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}

	public int getId() {
		return id;
	}

	public int getSum() {
		return sum;
	}

	public void setSum() {
		sum = kor + eng + mat;
	}

	public int getAvg() {
		return avg;
	}

	public void setAvg() {
		avg = sum / 3;
	}

	@Override
	public String toString() {
		return id + " : " + name + " : " + sum;
	}

	// toString
	// hashCode
	// equals

}

public class StudentMapTest {
	public static void main(String[] args) {
		Student s1 = new Student(1000, "송혜교", 88, 67, 99);
		Student s2 = new Student(2000, "전지현", 100, 66, 99);
		Student s3 = new Student(3000, "김태리", 89, 67, 82);
		Student s4 = new Student(3000, "이자바", 56, 90, 82);
		// 키 Student객체id값, 값 Student객체로 정의 수정
		Map<Integer, Student> map = new HashMap<Integer, Student>();
		// set/get 메소드 호출 수정
		map.put(s1.getId(), s1);
		map.put(s2.getId(), s2);
		map.put(s3.getId(), s3);
		map.put(s4.getId(), s4);
		// map객체들 kor, eng, mat 더하여 sum , avg 계산
		for (Integer k : map.keySet()) {
			map.get(k).setSum();
			map.get(k).setAvg();
			System.out.println(map.get(k));
		}
		// Map데이터를 list형태 변경(key제외, value)
		Collection<Student> col = map.values();
		ArrayList<Student> sort = new ArrayList<Student>(col);
		for (int i = 0; i < sort.size() - 1; i++) {
			for (int j = i + 1; j < sort.size(); j++) {
				int sum1 = sort.get(i).getSum();
				int sum2 = sort.get(j).getSum();
				if (sum1 < sum2) {
					Student temp = sort.get(i);
					sort.set(i, sort.get(j));
					sort.set(j, temp);
				}
			}
		}

		int cnt = 0;
		for (Student s : sort) {
			System.out.println(++cnt + "등 : " + s);
		}

		// Collection상위타입 : Set , List, Map 상속
		// sum 많은 순서대로 석차 구하자
		// 1등 : id : name : sum
		// 2등 :
		// 3등 :
	}
}