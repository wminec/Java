package sP.week5;
import java.util.*;
class Shape{
	protected double pointX;
	protected double pointY;
	protected static double sizeX;
	protected static double sizeY;
	
	public Shape(){
	}
	public Shape(double px, double py , double sx, double sy){
		pointX=px;
		pointY=py;
		sizeX=sx;
		sizeY=sy;
	}
	
	public static double getCalcCircumference(){
		return (sizeX*2)+(sizeY*2);
	}
	public double getCalcArea(){
		return sizeX*sizeY;
	}
	
	public double getPointX() {
		return pointX;
	}
	public void setPointX(double px) {
		pointX = px;
	}
	public double getPointY() {
		return pointY;
	}
	public void setPointY(double py) {
		pointY = py;
	}
	public double getSizeX() {
		return sizeX;
	}
	public void setSizeX(double sx) {
		sizeX = sx;
	}
	public double getSizeY() {
		return sizeY;
	}
	public void setSizeY(double sy) {
		sizeY = sy;
	}
	@Override
	public String toString() {
		return "Shape [pointX=" + pointX + ", pointY=" + pointY + ", sizeX=" + sizeX + ", sizeY=" + sizeY + "]";
	}
}
class Triangle extends Shape{
	public double getCalcArea(){
		return (sizeX*sizeY)/2;
	}
	public static double getCalcCircumference(){
		return sizeX+sizeY+Math.sqrt((sizeX*sizeX)+(sizeY*sizeY));
	}
	
}
public class ShapeTest {

	public static void main(String[] args) {
		Shape s = new Shape(1,2,4,5);
		Triangle t = new Triangle();
		System.out.println(s);
		System.out.println(t);
	}
}