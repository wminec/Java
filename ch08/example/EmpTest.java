package ch08.example;

public class EmpTest {

	public static void main(String[] args) {
		Employee emp1=new Employee("������","ȸ���","����",3000000);
		Employee emp2=new Employee("�̼���","������","����",3000000);
		Employee emp3=new Employee("�Ӳ���","�ѹ���","����",3500000);
		
		if(emp1==emp2){
			System.out.println("�� ����� ���ް� �޿��� �����ϴ�.");
		}else{
			System.out.println("�� ����� ���ް� �޿��� �ٸ��ϴ�.");
		}
		if(emp1.equals(emp2)){
			System.out.println("�� ����� ���ް� �޿��� �����ϴ�.");
		}else{
			System.out.println("�� ����� ���ް� �޿��� �ٸ��ϴ�.");
		}
		if(emp1.equals(emp3)){
			System.out.println("�� ����� ���ް� �޿��� �����ϴ�.");
		}else{
			System.out.println("�� ����� ���ް� �޿��� �ٸ��ϴ�.");
		}
	}

}
