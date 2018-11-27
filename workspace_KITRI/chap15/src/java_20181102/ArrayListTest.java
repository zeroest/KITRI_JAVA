package java_20181102;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

class Employee{
   int id;
   String name;
   double pay;
   
   public Employee(int id, String name, double pay) {
      this.id = id;
      this.name = name;
      this.pay = pay;
   }

   @Override
   public String toString() {
      return "회사원객체:"+id+":"+name+":"+pay;
   }
   
      
}

public class ArrayListTest {
   public static void main(String[] args) {
      //1. 타입 지정x 자바 모든/특정 타입 객체, 크기 5개+5
      //List list = new Vector(5,3);
      //ArrayList list =new  ArrayList(5);
      //List<Integer> list =new ArrayList<Employee>(5);
      List<Employee> list =new ArrayList<Employee>(5);
      //List list =new  LinkedList();
      
      //list.add("java");//String
      //list.add(100);//int=Integer
      //list.add(3.14);//Double
      Employee e1 = new Employee(100,"이사원",45000.77);
      Employee e2 = new Employee(200,"김대리",45000.99);
      Employee e3 = new Employee(300,"박과정",65000.77);
      list.add(e1);
      list.add(e2);
      list.add(e3);//5개 더 크기 증가
      //list.set(1,"리스트");
      //list.remove(1);
      //list.add(1,"추가");
      System.out.println(list.size());
      
      for(int i= 0; i < list.size();i++) {
         //id:name:pay
         System.out.println(list.get(i));
      }
      //명령행 매개변수 : java : 리스트 포함 
      //System.out.println(list.contains(args[0]));
      
      //명령행 매개변수 : 100 입력
      //리스트 내부 사번 100 Employee 객체 포함
      
      for(int i= 0; i < list.size();i++) {
         //if(list.get(i) instanceof Employee) {
         boolean result =
         list.get(i).id == Integer.parseInt(args[0]);
         //((Employee)list.get(i)).id == Integer.parseInt(args[0]);
         System.out.println(result);
         //}
      }
      //ArrayList --> 배열 변경
      Object[] o =list.toArray();
      
      //ArrayList list =new ArrayList(5);
      //ArrayList list =new ArrayList();
            
}
}