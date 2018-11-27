package java_20181102;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PhoneMapTest {
   public static void main(String[] args) {
      Map<String,String[]> phones =
            new HashMap<String,String[]>();
      
      String [] p1 =
      {"010-222-3333", "02-2222-3333","java@mail.com"};
      String [] p2 =
         {"010-222-3544", "02-222-3353","031-2636-4743 ","jsp@mail.com"};
      String [] p3 =
         {"010-222-3425", "oracle@mail.com"};
   
      phones.put("이자바",p1);
      phones.put("홍길동",p2);
      phones.put("김유진",p3);
      phones.put("이자바",p3);//키가 동일x : 해당 키 값 변경
      phones.put("박자바",p3);//값 동일 : 허용 추가
      //phones.remove("박자바");
      // map 키 동일 판단
      //1.hashCode() 숫자 같다 2> equals() true 
      System.out.println(phones.size());
      
      /*//args[0] : 이자바 키(검색)
      String[] result =phones.get(args[0]);
      for(String s : result) {
         System.out.println(args[0] + ":"+s);
      }*/

      //모든 전화번호부 목록
      //Map 키 중복 허용x :Set처럼
      //안드로이드폰: 자바 Map
      Set<String> keys = phones.keySet();
      for (String k : keys) {
         //System.out.println(k);
         String[] result = phones.get(k);
         System.out.print(k + " -- ");
         for(String s : result) {
            System.out.print(s + "/");
         }
         System.out.println();
      }
}
}
