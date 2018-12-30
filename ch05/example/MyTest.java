package ch05.example;

public class MyTest {

	public static void main(String[] args) {
		int num1=1;
		int num2=100;
		MyUtil my=new MyUtil();
		
		my.summarize(num2);
		my.summarize(num1,num2);
	}

}
