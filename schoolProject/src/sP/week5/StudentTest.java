package sP.week5;

class Student{
	protected String name;
	protected String studentNumber;
	protected String major;
	protected int year;
	protected double grade;
	//이름, 학번, 전공, 학년, 학점 변수 선언
	public Student(){
		
	}//디폴트 생성자
	public Student(String n, String s,String m,int y, double g){
		name=n;
		studentNumber=s;
		major=m;
		year=y;
		grade=g;
	}//매개변수가 5개인 생성자
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
	}//접근자 설정자
	@Override
	public String toString() {
		return "Student [name=" + name + ", studentNumber=" + studentNumber + ", major=" + major + ", year=" + year
				+ ", grade=" + grade + "]";
	}//정보 출력
}
class UnderGraduate extends Student{
	String club;
	//동아리 변수
	public UnderGraduate(){
		
	}//디폴트 생성자
	public UnderGraduate(String c){
		club=c;
	}//매개변수가 1개인 생성자
	
	public String getClub() {
		return club;
	}
	public void setClub(String c) {
		club = c;
	}//접근자 생성자
	@Override
	public String toString() {
		return "UnderGraduate [club=" + club + "]";
	}//정보 출력
}
class Graduate extends Student{
	String assistantInstructorType;
	double scholarshipRate;
	//조교 타입과 장학금 비율 변수 선언
	public Graduate(){
		
	}//디폴트 생성자
	public Graduate(String a, double s){
		assistantInstructorType=a;
		scholarshipRate=s;
	}//매개변수가 2개인 생성자
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
	}//접근자 설정자
	@Override
	public String toString() {
		return "Graduate [assistantInstructorType=" + assistantInstructorType + ", scholarshipRate=" + scholarshipRate
				+ "]";
	}//정보 출력
}
public class StudentTest {

	public static void main(String[] args) {
		Student s = new Student("TestName","201094942","TestMajor",2,3.5);
		UnderGraduate u = new UnderGraduate("TestClub");
		Graduate g = new Graduate("교육조교", 0.1);
		//각각의 객체 생성
		System.out.println(s);
		System.out.println(u);
		System.out.println(g);//각 객체의 정보 출력
	}
}