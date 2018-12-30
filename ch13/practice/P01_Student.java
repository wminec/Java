package ch13.practice;
import java.io.Serializable;
public class P01_Student implements Serializable{
	String name;
	int grade;
	String subject;
	int score;
	int subjectNum;
	int sum;
	
	public P01_Student(String name, int grade, String subject, int score){
		this.name=name;
		this.grade =grade;
		this.subject=subject;
		this.score=score;
	}
	public P01_Student(String name, int sum,int subjectNum){
		this.name=name;
		this.sum=sum;
		this.subjectNum=subjectNum;
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
	public void setScore(int score){
		this.score=score;
	}
	public int getScore(){
		return score;
	}
	public void setSubjectNum(int subjectNum){
		this.subjectNum=subjectNum;
	}
	public int getSubjectNum(){
		return subjectNum;
	}
	public void setSum(int sum){
		this.sum=sum;
	}
	public int getSum(){
		return sum;
	}
}
