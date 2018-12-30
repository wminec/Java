package ch06.example;

public class Rectangle extends Shape{
	public Rectangle(){
		System.out.println("Rectangle 생성자 호출");
	}
	public void calcArea(float width,float height){
		super.area=width*height;
	}
}
