package ch05.example;

public class MyUtil {
	public void summarize(int num1){
		int sum=0;
		for(int i=1; i<=num1;i++){
			sum+=i;
		}
		
		System.out.println("1���� "+num1+"���̿� �ִ� �ڿ������� ���� "+sum);
	}

	//public void summarize2(int num1, int num2){
	public void summarize(int num1, int num2){
		int sum=0;
		for(int i=num1; i<=num2;i++){
				sum+=i;
		}
		
		System.out.println(num1+"�� "+num2+"���̿� �ִ� �ڿ������� ���� "+sum);
	}
}