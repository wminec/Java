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
		System.out.println("1,000 이상이 되게 하는 최초의 n값은 "+n);
		System.out.println("n까지 더한 합은 "+sum);

	}

}
