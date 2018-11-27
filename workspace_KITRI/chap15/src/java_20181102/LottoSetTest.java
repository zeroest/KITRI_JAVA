package java_20181102;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class LottoSetTest {

   public static void main(String[] args) {
   /*   //데이터중복저장x,순서유지x
      Set<Integer> lotto = new HashSet<Integer>(); 
      lotto.add(500);
      lotto.add(100);
      lotto.add(200);
      lotto.add(300);
      lotto.add(100);
      System.out.println(lotto.size());
      
      //Set 조회1 Iterator: add순서 상관없이 Set 저장 데이터들 복사 
      Iterator<Integer> it = lotto.iterator();//반복
      while(it.hasNext()) {
         Integer obj =  it.next();
         //it.next();//읽고 넘어간다 
         System.out.println(obj);
      }
      //while(st.hasMoreTokens()) {st.nextToken();}
      
      
      //Set 조회2 : for반복문
      for(Integer num : lotto) {
         System.out.println(num);
      }
      
      
      */
      
      
      Set<Integer> mylotto =new HashSet<Integer>();


      //6개 mylotto저장구현
      while(true) {
         int number = (int)(Math.random()*45)+1;
         
         mylotto.add(number);
         if(mylotto.size()>5) {
      //System.out.println(number);
            break;
      }
         
         
      }
      for(Integer num : mylotto) {
         System.out.print(num+ "  ");
      }
            
            
      System.out.println();
      //System.out.println(mylotto.size());
   
      
      
      /*
      for() {
         mylotto.add((int)(Math.random()*45)+1));

      }
      */
      
   /*   for(int num ; mylotto.size(); num++) {
         System.out.println(num);
         
         if(mylotto.size()<6) {

         int num = ;
         
            
            
         }
         System.out.println(mylotto.size());
      
   
         
      }*/

            /*
      System.out.println();
      //Set 조회2 : for반복문
         if(mylotto.size()==6) {
            for(Integer num : mylotto) {
               System.out.println(num);
            }
         }else {
            System.out.println("다시실행");*/
            
         
      //lotto 출력: 중복되지 않은 1-45 숫자 6개 출력 

}
}