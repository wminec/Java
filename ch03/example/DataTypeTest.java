package ch03.example;

public class DataTypeTest {

	public static void main(String[] args) {
		byte b=100;	//-128~127
		short s=120;	//-32768~32767
		int num=250000;	//-2147483648~2147483647
		
		System.out.println("b의 값은 "+b);
		System.out.println("s의 값은 "+s);
		System.out.println("num의 값은 "+num);
		
		b=(byte)(100+100);
		//s=400000;	정수값 저장하면 오류 발생
		s=(short)(32767+2);
		//num=2147483648;	정수 표현 범위를 넘어서는 값을 저장하면 오류 발생.
		num=2147483647+1;
		
		System.out.println();
		System.out.println("b의 값은 "+b);
		System.out.println("s의 값은 "+s);
		System.out.println("num의 값은 "+num);
	}

}
