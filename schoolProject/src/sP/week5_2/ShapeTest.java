package sP.week5_2;

class Shape{
	protected int x,y;
	public void draw(){
		System.out.println("Shape Draw");
	}
}//super클래스

class Rectangle extends Shape implements Drawable{
	private int width, height;
	public void draw(){
		System.out.println("Rectangle Draw");
	}
}//사각형 클래스

class Triangle extends Shape implements Drawable{
	private int base, height;
	public void draw(){
		System.out.println("Triangle Draw");
	}
}//삼각형 클래스

class Circle extends Shape implements Drawable{
	private int radius;
	public void draw(){
		System.out.println("Circle Draw");
	}
}//원 클래스
public class ShapeTest {
	private static Shape arrayOfShapes[];
	public static void main(String[] args) {
		init(); //배열에 객체 넣기
		drawAll(); //각 객체에 맞는 draw메소드 출력
		//Drawable d = new Drawable(); 인터페이스는 객체 생성이 불가능하다.
	}
	
	public static void init(){
		arrayOfShapes=new Shape[3];
		arrayOfShapes[0]=new Rectangle();
		arrayOfShapes[1]=new Triangle();
		arrayOfShapes[2]=new Circle(); 
	}
	
	public static void drawAll(){
		for(int i=0; i<arrayOfShapes.length; i++){
			arrayOfShapes[i].draw();
		}
	}
}