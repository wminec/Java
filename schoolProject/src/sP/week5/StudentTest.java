package sP.week5;

class Student{
	protected String name;
	protected String studentNumber;
	protected String major;
	protected int year;
	protected double grade;
	//�̸�, �й�, ����, �г�, ���� ���� ����
	public Student(){
		
	}//����Ʈ ������
	public Student(String n, String s,String m,int y, double g){
		name=n;
		studentNumber=s;
		major=m;
		year=y;
		grade=g;
	}//�Ű������� 5���� ������
	public String getName() {
		return name;
	}
	public void setName(String n) {
		name = n;
	}
	public String getStudentNumber() {
		return studentNumber;
	}
	public void setStudentNumber(String s) {
		studentNumber = s;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String m) {
		major = m;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int y) {
		year = y;
	}
	public double getGrade() {
		return grade;
	}
	public void setGrade(double g) {
		grade = g;
	}//������ ������
	@Override
	public String toString() {
		return "Student [name=" + name + ", studentNumber=" + studentNumber + ", major=" + major + ", year=" + year
				+ ", grade=" + grade + "]";
	}//���� ���
}
class UnderGraduate extends Student{
	String club;
	//���Ƹ� ����
	public UnderGraduate(){
		
	}//����Ʈ ������
	public UnderGraduate(String c){
		club=c;
	}//�Ű������� 1���� ������
	
	public String getClub() {
		return club;
	}
	public void setClub(String c) {
		club = c;
	}//������ ������
	@Override
	public String toString() {
		return "UnderGraduate [club=" + club + "]";
	}//���� ���
}
class Graduate extends Student{
	String assistantInstructorType;
	double scholarshipRate;
	//���� Ÿ�԰� ���б� ���� ���� ����
	public Graduate(){
		
	}//����Ʈ ������
	public Graduate(String a, double s){
		assistantInstructorType=a;
		scholarshipRate=s;
	}//�Ű������� 2���� ������
	public String getAssistantInstructorType() {
		return assistantInstructorType;
	}
	public void setAssistantInstructorType(String a) {
		assistantInstructorType = a;
	}
	public double getScholarshipRate() {
		return scholarshipRate;
	}
	public void setScholarshipRate(double s) {
		scholarshipRate = s;
	}//������ ������
	@Override
	public String toString() {
		return "Graduate [assistantInstructorType=" + assistantInstructorType + ", scholarshipRate=" + scholarshipRate
				+ "]";
	}//���� ���
}
public class StudentTest {

	public static void main(String[] args) {
		Student s = new Student("TestName","201094942","TestMajor",2,3.5);
		UnderGraduate u = new UnderGraduate("TestClub");
		Graduate g = new Graduate("��������", 0.1);
		//������ ��ü ����
		System.out.println(s);
		System.out.println(u);
		System.out.println(g);//�� ��ü�� ���� ���
	}
}