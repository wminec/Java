package ch04.example;

public class SwitchTest {

	public static void main(String[] args) {
		int num=2;
		String name="ȫ�浿";
		
		switch(num){
		case 1:
			System.out.println("num�� ���� "+num);
			break;
		case 2:
			System.out.println("num�� ���� "+num);
			break;
		default:
			System.out.println("��ġ�ϴ� ���� �����ϴ�.");
		}
		
		switch(name){
		case "ȫ�浿":
			System.out.println("�̸��� "+name);
			break;
		case "�̼���":
			System.out.println("�̸���"+name);
			break;
			
		default:
			System.out.println("��ġ�ϴ� ����� �����ϴ�.");
		}

	}

}
