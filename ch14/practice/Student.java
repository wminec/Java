package ch14.practice;

public class Student {
	String name;
	int grade;
	String subject;
	int score;
	
	public Student(String name, int grade, String subject, int score){
		this.name=name;
		this.grade=grade;
		this.subject=subject;
		this.score=score;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public void setGrade(int grade){
		this.grade=grade;
	}
	public int getGrade(){
		return grade;
	}
	public void setSubject(String subject){
		this.subject=subject;
	}
	public String getSubject(){
		return subject;
	}
	public void setScore(){
		this.score=score;
	}
	public int getScore(){
		return score;
	}
}
