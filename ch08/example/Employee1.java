package ch08.example;

public class Employee1 {
	private String name;
	private String dept;
	private String job;
	private int salary;
	
	public Employee1(String name,String dept,String job,int salary){
		this.name=name;
		this.dept=dept;
		this.job=job;
		this.salary=salary;
	}
	
	public String toString(){
		String data="����� �̸�: "+"name"+
					", ����� �μ�: "+dept+
					", ����� ����: "+job+
					", �޿�: "+salary+"��";
		return data;
	}
}
