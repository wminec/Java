package ch07.example;

public class University extends Student{
	private int courses;
	
	public University(String name, int grade,int courses,String teacher){
		//super();
		System.out.println("University ������ ȣ��");
		super.name=name;
		super.grade=grade;
		super.teacher=teacher;
		this.courses=courses;
	}
	
	public University(){
		this("�̼���",2,20,"ȫ�浿");
	}
	
	public int getCourses(){
		return courses;
	}
	public String getStudInfo(){
		System.out.println("University Ŭ������ getStudInfo �޼��� ȣ��");
		return "�̸���>> "+name+", �г���>> "+grade+", ��û ������>> "+courses;
	}
	public String getTeacher(){
		return "���Ӽ�����: "+super.teacher;
	}
}
