package ch06.example;

public class University extends Student {
	private int courses; //����
	
	public University(String name,int grade,int courses){
		super();
		System.out.println("University ������ ȣ��");
		super.name=name;
		super.grade=grade;//super.grade�� �θ��� ����
		//grade=_grade;
		this.courses=courses;
	}
	
	public University(){
		this("�̼���",2,20);
	}
	
	public int getCourses(){
		return courses;
	}
	
	public String getStudInfo(){
		System.out.println("University Ŭ������ getStudInfo �޼��� ���");
		return "�̸���>> "+name+", �г���>> "+grade+", ��û ������>> "+courses;
	}
}
