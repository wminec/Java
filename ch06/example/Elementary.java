package ch06.example;

public class Elementary extends Student {
	private int courses;
	public Elementary(String _name,int _grade){
		System.out.println("Elementary ������ ȣ��");
		name=_name;
		grade=_grade;
	}
	public Elementary(String _name, int _grade, String _gender, int _age){
		System.out.println("���ڰ� ���� Elementary ������ ȣ��");
		name=_name;
		grade=_grade;
		gender=_gender;
		age=_age;
	}
	public Elementary(String name,int grade,int courses){
		super();
		System.out.println("University ������ ȣ��");
		super.name=name;
		super.grade=grade;//super.grade�� �θ��� ����
		//grade=_grade;
		this.courses=courses;
	}
}
