package ch10.Map;

public class MyStudent {
	private String name;
	private int grade;
	
	public MyStudent(){
		this("�̼���",2);
	}
	
	public MyStudent(String name,int grade){
		this.name=name;
		this.grade=grade;
	}
	
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}
	public int getGrade(){
		return grade;
	}
	public void setGrade(int grade){
		this.grade=grade;
	}
	public String toString(){
		return "�л� �̸��� " +name+", �г���"+grade+"�г��Դϴ�.";
	}
}
