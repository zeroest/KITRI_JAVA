package java_20181029;

abstract class Shape{
	
	String test = "일반 필드변수도 추가할 수 있다";
	
	Shape(int a){
		System.out.println("생성자도 가질 수 있다");
	}
	
	abstract void area();
	abstract void circum();
	
	void test1() {
		System.out.println("일반 메소드 입력 가능!!!");
	}
	
}

class Circle extends Shape{
	int radius;// 반지름 필드변수
	
	Circle(int radius){
		super(radius);
		this.radius=radius;
	}
	
	void area() {
		System.out.println("반지름이 "+radius+"인 원의 면적="+
				Math.ceil(radius*radius*Math.PI*100)/100);
	}
	void circum() {
		System.out.println("반지름이 "+radius+"인 원의 둘레="+
				String.format("%.2f", (2*radius*Math.PI*100)/100));
	}
}

class Rectangle extends Shape{
	int width, height;
	
	Rectangle(int width, int height){
		super(width);
		this.width=width;
		this.height=height;
	}
	void area() {
		System.out.println("가로="+width+" 세로="+height+" 인 사각형의 면적="+width*height);
	}
	void circum() {
		System.out.println("가로="+width+" 세로="+height+" 인 사각형의 둘레="+(width+height)*2);
	}
}



public class ShapeTest {
	public static void main(String[] args) {
		//명령행 매개변수 2개 : circle 5(반지름 5인 원 객체 생성)
		//명령행 매개변수 3개 : rect 6 8(가로6 세로8 사각형 객체 생성)
		Shape s = null;
		if(args.length == 2 && args[0].equals("circle")) {
			s = new Circle(Integer.parseInt(args[1]));
		}else if(args.length == 3 && args[0].equals("rect")) {
			s= new Rectangle(Integer.parseInt(args[1]),
								Integer.parseInt(args[2]));
		}/*else if (getClass().getName().equals(args[0]);) {
			
		}*/
		s.area();
		//반지름이 xxx인 원의 면적=
		//가로=xxx 세로=xxx 인 사각형의 면적=
		s.circum();
		//반지름이 xxx인 원의 둘레=
		//가로=xxx 세로=xxx 인 사각형의 둘레=
		
		s.test1();
		System.out.println(s.test);
	}
}
