package ch07.example;

public class Number {
	private int num;//�ν��Ͻ�����
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
		return num; //�ν��Ͻ� ������ static �޼��� ������ ����� �� ����.
	}*/
	public void increaseNum(){
		numCounter++;
	}
}
