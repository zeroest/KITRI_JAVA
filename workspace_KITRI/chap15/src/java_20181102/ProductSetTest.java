package java_20181102;

import java.util.HashSet;
import java.util.Set;

class Product{
   int code;
   String title;
   double price;
   public Product(int code, String title, double price) {
   
      this.code = code;
      this.title = title;
      this.price = price;
   }
   //toString 
   @Override
   public String toString() {
      
      return "ªÛ«∞" +code + ":"+title +":"+price;
   }
   @Override
   public int hashCode() {
      return code;
   }
   @Override
   public boolean equals(Object obj) {
      return title. equals(((Product)obj).title);
   }
   
}


public class ProductSetTest {
   public static void main(String[] args) {
      Set<Product> set = new HashSet<Product>();
      Product p1 =new Product(100,"ªÔº∫tv",100000);
      Product p2 =new Product(200,"ø§¡ˆtv",100000);
      Product p3 =new Product(100,"≈∞∆Æ∏Æ≥√¿Â∞Ì",100000);
      Product p4 =new Product(300,"ªÔº∫ø°æÓƒ¡",100000);
      set.add(p1);
      set.add(p2);
      set.add(p3);
      set.add(p4);
      //set.remove(p4);
      for(Product p :set) {
         System.out.println(p);
      }
      

}

}
