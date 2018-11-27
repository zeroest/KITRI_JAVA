package java_20181102;

//=====
//챕터에 파일(mydb.properties)을 만들고 
//dbname=oracle xe
//version=11g
//account=hr
//password=hr
//=====
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesTest {
 public static void main(String[] args) {
    try {
    Properties prop =new Properties();
    FileReader fr = new FileReader("mydb.properties.txt");
    prop.load(fr);
    System.out.println(prop.getProperty("dbname"));
    System.out.println(prop.getProperty("version"));
    System.out.println(prop.getProperty("account"));
    System.out.println(prop.getProperty("password"));
    
    }catch(IOException e) {
       e.printStackTrace();
    }

}
 
}