package ch04.example;

public class IfTest5 {

	public static void main(String[] args) {
		int a=1;
		int b=2;
		int c=1;
		
		int result=b*b-4*a*c;
		
		if(result>0){
			System.out.println("�������� �� �Ǳ��� �����ϴ�.");
		}
		else if(result==0){
			System.out.println("�������� �߱��� �����ϴ�.");
		}
		else{
			System.out.println("�������� �� ����� �����ϴ�.");
		}

	}

}
