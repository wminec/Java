package ch06.example;

public class Triangle extends Shape {
	public Triangle(){
		System.out.println("Triangle ������ ȣ��");
	}
	public void calcArea(float width,float height){
		super.area=width*height*0.5f;
	}
}
