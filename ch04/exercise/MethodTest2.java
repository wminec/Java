package ch04.exercise;

public class MethodTest2 {
	public void summarize(int a, int b){
		int sum=0;
		for(int i=0; i<=b; i++){
			sum+=i;
		}
		
		System.out.println(a+"�� "+b+"������ �ڿ����� ���� "+sum);
	}

	public static void main(String[] args) {
		int num1=7;
		int num2=87;
		
		MethodTest2 t=new MethodTest2();
		
		t.summarize(num1, num2);
		t.summarize(1, 100);
		t.summarize(100, 1);

	}

}
