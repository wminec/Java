package ch06.example;

public class Student extends Person {
	protected String name;
	protected int grade;
	
	public Student(){
		System.out.println("Student 부모 생성자 호출");
	}
	
	public String getName(){return name;}
	public int getGrade(){return grade;}
	
	public String getStudInfo(){
		System.out.println("Student 클래스의 getStudInfo() 메서드 호출");
		return "이름: "+name+", 학년: "+grade;
	}
	/*
	public void calcScore(University uni){
		System.out.println("시험 점수 구하기");
	}
	public void calcScore(Elementary ele){
		System.out.println("시험 점수 구하기");
	}*/
	
	public void calcScore(Student s){
		System.out.println("학생 시험 점수 구하기");
	}
}
