package sP.week2;
import java.util.*;
public class CharSwitch {

	public static void main(String[] args) {
		String inputChar;	//�Է¹��� ���� ����

		
		System.out.print("������ �ϳ��� �Է��Ͻÿ�: ");
		Scanner scan = new Scanner(System.in);
		inputChar=scan.nextLine(); //�Է�
		switch(inputChar){
		case "a":	case "e":	case "i":	case "o":	case "u":
			System.out.println("�Է��� ���ڴ� �����Դϴ�.");
			break;			//a,e,i,o,u:����
		default :
				System.out.println("�Է��� ���ڴ� �����Դϴ�.");
				break;		//�������� ���� �̹Ƿ� default�� ��� ����
		}
	}
}