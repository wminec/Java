package ch08.example;

public class RootTest {

	public static void main(String[] args) {
		int a=7;
		int b=2;
		int c=1;
		
		double result=Math.pow(b,2)-4*a*c;
		
		System.out.printf("�Ǻ��� ���� : %f\n",result);
		
		if(result>0){
			System.out.println("�������� �� �Ǳ��� �����ϴ�.");
		}else if(result==0){
			System.out.println("�������� �߱��� �����ϴ�.");
		}else if(result<0){
			System.out.println("�������� �� ����� �����ϴ�.");
		}
	}

}
