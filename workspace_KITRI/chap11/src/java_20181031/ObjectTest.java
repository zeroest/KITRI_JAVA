package java_20181031;

public class ObjectTest {
	public static void main(String[] args) {
		
		Object obj = new Object();
		Class c =obj.getClass();
		c.getName();
		obj.getClass().getName();
	
		MyObject mo1 = new MyObject("java");
		MyObject mo2 = new MyObject("java");
		System.out.println(mo1);
		System.out.println(mo2);
		if(mo1 == mo2) {
			System.out.println("==비교 같다"); //주소값 비교 오버라이딩 불가
		}else System.out.println("==비교 다르다");
		if(mo1.equals(mo2)) {
			System.out.println("equals비교 같다"); //오버라이딩하여 기능변경 가능
		}else System.out.println("equals비교 다르다");
		/*주소(오버라이딩 다른...)
		1. mo2 MyObject타입의 객체라면
		2. msg변수값 동일한지
		3. 12모두 만족 : true*/
	}
}

class MyObject extends Object {
	//toString(), equals() 메소드 자동 포함
	
	String msg;
	MyObject(String msg){
		this.msg = msg;
	}
	
	public String toString() {
		return msg+": 오버라이딩";
	}

	public boolean equals(Object obj) {
	if(obj instanceof MyObject) {
		return msg.equals(((MyObject)obj).msg);
	}else return false;
}

/*주소(오버라이딩 다른...)
1. mo2 MyObject타입의 객체라면
2. msg변수값 동일한지
3. 12모두 만족 : true*/

	
/*	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((msg == null) ? 0 : msg.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MyObject other = (MyObject) obj;
		if (msg == null) {
			if (other.msg != null)
				return false;
		} else if (!msg.equals(other.msg))
			return false;
		return true;
	}*/

}
