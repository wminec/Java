package ch06.example;

public class Student extends Person {
	protected String name;
	protected int grade;
	
	public Student(){
		System.out.println("Student �θ� ������ ȣ��");
	}
	
	public String getName(){return name;}
	public int getGrade(){return grade;}
	
	public String getStudInfo(){
		System.out.println("Student Ŭ������ getStudInfo() �޼��� ȣ��");
		return "�̸�: "+name+", �г�: "+grade;
	}
	/*
	public void calcScore(University uni){
		System.out.println("���� ���� ���ϱ�");
	}
	public void calcScore(Elementary ele){
		System.out.println("���� ���� ���ϱ�");
	}*/
	
	public void calcScore(Student s){
		System.out.println("�л� ���� ���� ���ϱ�");
	}
}
