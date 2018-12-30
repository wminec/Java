package ch07.intf;

public class ShapeTest {

	public static void main(String[] args) {
		float area=0.0f;
		int width=20;
		int height=30;
		
		Shape s = new Rectangle(); //인터페이스 타입은 업캐스팅으로 사용할 수 있다.
		
		area=s.calcArea(width, height);
		
		System.out.println("사각형의 넓이는 "+area);
		
		s=new Triangle();
		area=s.calcArea(width, height);
		System.out.println("삼각형의 넓이는 "+area);
	}

}
