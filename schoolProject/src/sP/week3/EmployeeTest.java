package sP.week3;
class Employee{
	private String name;	//��� �̸�
	private String phone;	//��� ��ȭ��ȣ
	private int salary;		//��� ����
	
	public String getName(){ return name;}	//�̸� ������
	public void setName(String n){ name=n; }//�̸� ������
	public String getPhone(){ return phone; }//��ȭ��ȣ ������
	public void setPhone(String p){ phone=p; }//��ȭ��ȣ ������
	public int getSalary(){ return salary; }//���� ������
	public void setSalary(int s){ salary=s; }//���� ������
	
	public String toString(){
		return "�̸�: "+name+",��ȭ��ȣ: "+phone+",����: "+salary;
	}//EmployeeŬ���� ���� ��� �޼ҵ� �����ε�
}
public class EmployeeTest {

	public static void main(String[] args) {
		Employee emp = new Employee();	//��ü ����
		
		emp.setName("������");	//�̸� ����
		emp.setPhone("010-2232-2319");	//��ȭ��ȣ ����
		emp.setSalary(3000);	//���� ����
		
		System.out.println(emp);	//���� ���
	}
}
