package ch10.practice;
public class Student {
	private String name;  //�л��̸�
	private int grade;  //�г�
	private String subject;  //���� ����
	private int point;  //���� ����
	
	//������
	public Student(String name, int grade, String subject,int point){
		this.name=name;
		this.grade=grade;
		this.subject=subject;
		this.point=point;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public int getGrade() {
		return grade;
	}


	public void setGrade(int grade) {
		this.grade = grade;
	}


	public String getSubject() {
		return subject;
	}


	public void setSubject(String subject) {
		this.subject = subject;
	}


	public int getPoint() {
		return point;
	}


	public void setPoint(int point) {
		this.point =point;
	}
	
}
