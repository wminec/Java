package sP.week5_2;

class Shape{
	protected int x,y;
	public void draw(){
		System.out.println("Shape Draw");
	}
}//superŬ����

class Rectangle extends Shape implements Drawable{
	private int width, height;
	public void draw(){
		System.out.println("Rectangle Draw");
	}
}//�簢�� Ŭ����

class Triangle extends Shape implements Drawable{
	private int base, height;
	public void draw(){
		System.out.println("Triangle Draw");
	}
}//�ﰢ�� Ŭ����

class Circle extends Shape implements Drawable{
	private int radius;
	public void draw(){
		System.out.println("Circle Draw");
	}
}//�� Ŭ����
public class ShapeTest {
	private static Shape arrayOfShapes[];
	public static void main(String[] args) {
		init(); //�迭�� ��ü �ֱ�
		drawAll(); //�� ��ü�� �´� draw�޼ҵ� ���
		//Drawable d = new Drawable(); �������̽��� ��ü ������ �Ұ����ϴ�.
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