package sP.week2;
import java.util.Scanner;
public class SimpleCalc {
	public static void main(String[] args) {
		String operator;
		double num1=0,num2=0,result=0;	//�Է¹��� ���� ����
		
		Scanner input = new Scanner(System.in);
		System.out.print("�����ڸ� �Է��Ͻÿ�: ");
		operator=input.nextLine();
		System.out.print("������ ���� �ΰ��� �Է��Ͻÿ�: ");
		num1=input.nextDouble();
		num2=input.nextDouble();	//�Է�
		if(operator.charAt(0)=='+'){
			result=num1+num2;
			System.out.printf("�����: %f", result);	//'+'�� ���
		}else if(operator.charAt(0)=='-'){
			result=num1-num2;
			System.out.printf("�����: %f", result);	//'-'�� ���
		}else if(operator.charAt(0)=='*'){
			result=num1*num2;
			System.out.printf("�����: %f", result);	//'*'�� ���
		}else if(operator.charAt(0)=='/'){
			if(num2!=0){
				result=num1/num2;
				System.out.printf("�����: %f", result);
				//'/'�� ��� �и� 0���� üũ
			}else{
				System.out.println("�и� 0�� �ǹǷ� ����� �Ұ��� �մϴ�.");
			}//�и� 0�� ��� ���� �޽��� ���
		}
	}
}
