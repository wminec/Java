package ch08.example;

public class EmpTest1{

	public static void main(String[] args) {
		Employee1 emp1=new Employee1("������","ȸ���","����",3000000);
		Employee1 emp2=new Employee1("�̼���","������","����",3000000);
		/*
		System.out.println("����� �̸�: "+emp1.name+
							", ����� �μ�: "+emp1.dept+
							", ����� ����: "+emp1.job+
							", ����� �޿���: "+emp1.salary);
		*/
		
		System.out.println(emp1.toString());
		System.out.println(emp1);
		
		System.out.println(emp2.toString());
		System.out.println(emp2);
	}

}
