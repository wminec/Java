package ch04.example;

public class IfTest6 {

	public static void main(String[] args) {
		int num1=10;
		int num2=15;
		
		if(num1%2==0){
			if(num1%5==0){
				System.out.println(num1+"�� 2�� ����̰� 5�� ����Դϴ�.");
			}else{
				System.out.println(num1+"�� 2�� ����̳� 5�� ����� �ƴմϴ�.");
			}
		}else{
			System.out.println(num1+"�� 2�� ����� �ƴմϴ�.");
		}
		
		if(num2%2==0 && num2%5==0){
			System.out.println(num2+"�� 2�� ����̰� 5�� ����Դϴ�.");
		}else if(num2%2==0){
			System.out.println(num2+"�� 2�� ����̳� 5�� ����� �ƴմϴ�.");
		}else{
			System.out.println(num2+"�� 2�� ����� �ƴϰ� 5�� ����� �ƴմϴ�.");
		}
	}

}
