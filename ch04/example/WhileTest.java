package ch04.example;

public class WhileTest {

	public static void main(String[] args) {
		int n=0;
		int sum=0;
		while(true){
			sum+=n;
			if(sum>=1000)
				break;
			else
				n++;
		}
		System.out.println("1,000 �̻��� �ǰ� �ϴ� ������ n���� "+n);
		System.out.println("n���� ���� ���� "+sum);

	}

}
