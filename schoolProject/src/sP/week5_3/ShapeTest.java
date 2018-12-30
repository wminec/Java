package sP.week5_3;
abstract class Shape{
	protected String color;
	//���� ���� ����
	public Shape(){
		
	}//����Ʈ ������
	public Shape(String c){
		color=c;
	}//�Ű������� 1���� ������
	
	public String getColor() {
		return color;
	}
	public void setColor(String c) {
		color = c;
	}
	//���� ������ ������ ������
	public abstract double calcArea();
	//���� ���ϴ� �߻�޼ҵ�
	@Override
	public String toString() {
		return "Shape [color=" + color + "]";
	}//���� ���
}

class Rectangle extends Shape{
	//�߻� Ŭ���� Shape�� ��ӹ޴� Ŭ����
	private double length;
	private double width;
	//���̿� �ʺ� ���� ����
	public Rectangle(){
		
	}//����Ʈ ������
	public Rectangle(double l, double w){
		length=l;
		width=w;
	}//�Ű������� 2���� ������
	
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
	//������ ������
	public double calcArea(){
		return length*width;
	}//���� ����ϴ� �޼ҵ�
	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", width=" + width + "]";
	}//���� ���
}

class Triangle extends Shape{
	//�߻� Ŭ���� Shape�� ��ӹ޴� Ŭ����
	private double base;
	private double height;
	//���� ����
	public Triangle(){
		
	}//����Ʈ ������
	public Triangle(double b, double h){
		base=b;
		height=h;
	}//�Ű������� 2���� ������
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
	//������ ������
	public double calcArea(){
		return (base*height)/2;
	}//���� ���ϴ� �޼ҵ�
	@Override
	public String toString() {
		return "Triangle [base=" + base + ", height=" + height + "]";
	}//���� ���
	
}
public class ShapeTest {

	public static void main(String[] args) {
		Shape r = new Rectangle(2,4);
		//Rectangle Ŭ������ ����Ű�� Shape��ü
		Shape t = new Triangle(5,9);
		//Triangle Ŭ������ ����Ű�� Shape��ü
		
		System.out.println(r.calcArea());
		System.out.println(t.calcArea());
	}

}