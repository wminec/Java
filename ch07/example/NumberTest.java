package ch07.example;

public class NumberTest {
	public static void main(String[] args){
		System.out.println("numCount의 값: "+Number.numCounter);//클래스명을 이용하여 static 멤버에 접근한다.
		Number number1=new Number();
		number1.increaseNum();
		System.out.println("numCounter의 값: "+Number.getNumCounter());//클래스명을 이용하여 static 멤버에 접근한다.
		
		Number number2=new Number();
		number2.increaseNum();
		number2.increaseNum();
		
		System.out.println("numCounter의 값: "+Number.getNumCounter());
		System.out.println("numCounter의 값: "+number1.getNumCounter());
		System.out.println("numCounter의 값: "+number2.getNumCounter());
	}
}
