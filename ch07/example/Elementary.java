package ch07.example;

public class Elementary extends Student{
	public Elementary(String name, int grade, String teacher){
		System.out.println("Elementary ������ ȣ��");
		super.name=name;
		super.grade=grade;
		super.teacher=teacher;
	}
	
	public Elementary(String name, int grade){
		System.out.println("Elementary ������ ȣ��");
		super.name=name;
		super.grade=grade;
	}
	
	public Elementary(){
		this("�̼���",3,"����");
		System.out.println("Elemantary ������ ȣ��");
	}
	
	public String getTeacher(){
		return "���Ӽ�����: "+super.teacher;
	}
}
