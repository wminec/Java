package ch06.example;

public class Rectangle extends Shape{
	public Rectangle(){
		System.out.println("Rectangle ������ ȣ��");
	}
	public void calcArea(float width,float height){
		super.area=width*height;
	}
}
