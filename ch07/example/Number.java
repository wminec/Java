package ch07.example;

public class Number {
	private int num;//인스턴스변수
	static int numCounter=10;
	public Number(){
		num=numCounter;
	}
	public static int getNumCounter(){
		return numCounter;
	}
	/*public static int getNumber(){
		int num1=0;
		num1=numCounter;
		return num; //인스턴스 변수는 static 메서드 내에서 사용할 수 없다.
	}*/
	public void increaseNum(){
		numCounter++;
	}
}
