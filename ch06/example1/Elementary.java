package ch06.example1;

public class Elementary extends Student{
	public Elementary(String name, int grade){
		System.out.println("Elementary ������ ȣ��");
		this.name=name;
		this.grade=grade;
	}
	public Elementary(String name, int grade,String gender,int age){
		System.out.println("���ڰ� 4���� Elementary ������ ȣ��");
		this.name=name;
		this.grade=grade;
		this.gender=gender;
		this.age=age;
	}
}
