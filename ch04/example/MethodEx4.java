package ch04.example;

public class MethodEx4 {
	public int add(int a, int b){
		int c=a+b;
		return c;
		//return 3.5;
	}

	public static void main(String[] args) {
		int num1=10;
		int num2=20;
		int result=0;
		
		MethodEx4 m=new MethodEx4();
		result=m.add(num1, num2);
		
		System.out.println("�� ���� ���� "+result);
		System.out.println("�� ���� ���� "+m.add(100, 300));

	}

}
