package ch08.example;

public class StringTest1 {

	public static void main(String[] args) {
		int a=3;
		int b=0;
		
		b=a;
		
		System.out.println("a= "+a);
		System.out.println("b= "+b);
		
		String name="Hong";
		String fullName=name.concat("kil Dong");
		System.out.println(name);
		System.out.println(fullName);
	}

}
