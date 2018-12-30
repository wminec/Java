package ch08.example;

public class WrapperTest2 {

	public static void main(String[] args) {
		System.out.println("Float ÀÇ ÃÖ´ñ°ª>"+Float.MAX_VALUE);
		System.out.println("Float ÀÇ ÃÖ¼Ú°ª>"+Float.MIN_VALUE);
		
		String num="3.14f";
		String num2=num+2.0f;
		System.out.println("num2>"+num2);
		
		float num3=Float.parseFloat(num)+2.0f;
		System.out.println("num3>"+num3);
		float num4=123.345f;
		
		String num5=Float.toString(num4);
		System.out.println("num5>"+num5);
	}

}
