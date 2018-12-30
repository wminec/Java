package ch08.example;

public class MyStudent1 {
	private String name;
	private int grade;
	
	public MyStudent1(String name, int grade){
		this.name=name;
		this.grade=grade;
	}
	
	public String getName(){
		return name;
	}
	
	public int getGrade(){
		return grade;
	}
	
	public String toString(){
		return "이름:"+name+", 학년"+grade;
	}
}
