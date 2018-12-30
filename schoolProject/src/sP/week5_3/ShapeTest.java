package sP.week5_3;
abstract class Shape{
	protected String color;
	//색깔 변수 선언
	public Shape(){
		
	}//디폴트 생성자
	public Shape(String c){
		color=c;
	}//매개변수가 1개인 생성자
	
	public String getColor() {
		return color;
	}
	public void setColor(String c) {
		color = c;
	}
	//색깔 변수의 설정자 접근자
	public abstract double calcArea();
	//면적 구하는 추상메소드
	@Override
	public String toString() {
		return "Shape [color=" + color + "]";
	}//정보 출력
}

class Rectangle extends Shape{
	//추상 클래스 Shape를 상속받는 클래스
	private double length;
	private double width;
	//길이와 너비 변수 선언
	public Rectangle(){
		
	}//디폴트 생성자
	public Rectangle(double l, double w){
		length=l;
		width=w;
	}//매개변수가 2개인 생성자
	
	public double getLength() {
		return length;
	}
	public void setLength(double l) {
		length = l;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double w) {
		width = w;
	}
	//설정자 접근자
	public double calcArea(){
		return length*width;
	}//면적 계산하는 메소드
	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", width=" + width + "]";
	}//정보 출력
}

class Triangle extends Shape{
	//추상 클래스 Shape를 상속받는 클래스
	private double base;
	private double height;
	//변수 선언
	public Triangle(){
		
	}//디폴트 생성자
	public Triangle(double b, double h){
		base=b;
		height=h;
	}//매개변수가 2개인 생성자
	public double getBase() {
		return base;
	}
	public void setBase(double b) {
		base = b;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double h) {
		height = h;
	}
	//접근자 설정자
	public double calcArea(){
		return (base*height)/2;
	}//면적 구하는 메소드
	@Override
	public String toString() {
		return "Triangle [base=" + base + ", height=" + height + "]";
	}//정보 출력
	
}
public class ShapeTest {

	public static void main(String[] args) {
		Shape r = new Rectangle(2,4);
		//Rectangle 클래스를 가르키는 Shape객체
		Shape t = new Triangle(5,9);
		//Triangle 클래스를 가르키는 Shape객체
		
		System.out.println(r.calcArea());
		System.out.println(t.calcArea());
	}

}