package ch07.example;

public class NumberTest {
	public static void main(String[] args){
		System.out.println("numCount�� ��: "+Number.numCounter);//Ŭ�������� �̿��Ͽ� static ����� �����Ѵ�.
		Number number1=new Number();
		number1.increaseNum();
		System.out.println("numCounter�� ��: "+Number.getNumCounter());//Ŭ�������� �̿��Ͽ� static ����� �����Ѵ�.
		
		Number number2=new Number();
		number2.increaseNum();
		number2.increaseNum();
		
		System.out.println("numCounter�� ��: "+Number.getNumCounter());
		System.out.println("numCounter�� ��: "+number1.getNumCounter());
		System.out.println("numCounter�� ��: "+number2.getNumCounter());
	}
}
