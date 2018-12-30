package ch04.example;

public class MethodEx5 {
	public int summarize(int a){
		int sum=0;
		for(int i=1; i<=a;i++)
			sum+=i;
		return sum;
	}

	public static void main(String[] args) {
		int num1=10;
		int num2=20;
		int result=0;
		
		MethodEx5 m=new MethodEx5();
		
		result = m.summarize(num1);
		System.out.println("1에서 10까지의 합은 "+result);
		
		result=m.summarize(num2);
		System.out.println("1에서 20까지의 합은 "+result);

		System.out.println("1에서 100까지의 합은 "+m.summarize(100));
	}

}
