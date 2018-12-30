package ch08.example;

public class WrapperTest {
	public static void main(String[] args){
		System.out.println("int 의 최댓값>"+Integer.MAX_VALUE);
		System.out.println("int 의 최솟값>"+Integer.MIN_VALUE);
		
		String num="98";
		String num2=num+2;
		System.out.println("num2>"+num2);
		
		int num3=Integer.parseInt(num)+2;
		//num=Integer.paraseInt("hello")+2;
		System.out.println("num3>"+num3);
		
		System.out.println("2진수로 변환하기");
		System.out.println(num3+"-->"+Integer.toBinaryString(num3));
		
		int num4=123;
		String num5=Integer.toString(num4);
		System.out.println("num5>"+num5);
	}
}
