package ch07.example;

public abstract class Student {
	String name;
	int grade;
	String teacher;
	
	
	public Student(){
		System.out.println("Student ������ ȣ��");
	}
	
	public String getName(){
		return name;
	}
	
	public int getGrade(){
		return grade;
	}
	
	public String getStudInfo(){
		System.out.println("Student Ŭ������ getStdInfo() �޼��� ȣ��");
		return "�̸��� : "+name+", �г��� "+grade;
	}
	public abstract String getTeacher();
}
