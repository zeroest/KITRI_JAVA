package chap15.java_20181102;
import java.util.ArrayList;
import java.util.List;

class SameSentence{
String[] compare(List<String> list1, List<String> list2){
	String[] result = new String[10];
	//같은 문자열 저장 ArrayList
	ArrayList<String> list3 = new ArrayList<String>();
	//1.데이터갯수 : size()
	if(list1.size() >= list2.size()) {
		for(int i = 0; i < list2.size(); i++) {
			if(list1.get(i).equals(list2.get(i))) {
				list3.add(list1.get(i));
			}
		}
	}
	result = new String[list3.size()];
	list3.toArray(result);//list3 문자열 result 복사
	return result;
}
}
public class SameSentenceTest {
public static void main(String[] args) {
	ArrayList<String> list1 = new ArrayList<String>();
	list1.add("자바는 객체지향 언어입니다");
	list1.add("우리는 키트리에서 자바를 배우는 중입니다");
	list1.add("오늘은 컬렉션 프레임워크를 배우죠! ");
	list1.add("내일은 입출력과 네트워크를 배울 예정입니다 ");
	
	ArrayList<String> list2 = new ArrayList<String>();
	list2.add("자바는 객체지향 언어입니다");
	list2.add("우리는 kitri에서 자바를 배우는 중입니다");
	list2.add("오늘은 콜렉션 프레임워크를 배우죠! ");
	list2.add("내일은 입출력과 네트워크를 배울 예정입니다 ");
	
	ArrayList<String> list3 = new ArrayList<String>();
	list3.add("자바는 객체지향 언어입니다");
	list3.add("우리는 kitri에서 자바를 배우는 중입니다");
	list3.add("오늘은 콜렉션 프레임워크를 배우죠! ");
	
	SameSentence ss = new SameSentence();
	String result1 [] = ss.compare(list1, list2);//2
	for(String s : result1) {
		System.out.println(s);
	}
	//list1, list2에서 같은 내용 출력
	System.out.println("====================");
	String result2 [] = ss.compare(list1, list3);
	for(String s : result2) {
		System.out.println(s);
	}
	//1
	//list3의 갯수만큼만 같은 내용 출력	
	
}
}
