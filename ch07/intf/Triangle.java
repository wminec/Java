package ch07.intf;

public class Triangle implements Shape{
	public float calcArea(float width, float height){
		float area=width*height*0.5f;
		return area;
	}
}
