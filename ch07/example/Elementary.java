package ch07.example;

public class Elementary extends Student{
	public Elementary(String name, int grade, String teacher){
		System.out.println("Elementary 생성자 호출");
		super.name=name;
		super.grade=grade;
		super.teacher=teacher;
	}
	
	public Elementary(String name, int grade){
		System.out.println("Elementary 생성자 호출");
		super.name=name;
		super.grade=grade;
	}
	
	public Elementary(){
		this("이순신",3,"무명씨");
		System.out.println("Elemantary 생성자 호출");
	}
	
	public String getTeacher(){
		return "담임선생님: "+super.teacher;
	}
}
