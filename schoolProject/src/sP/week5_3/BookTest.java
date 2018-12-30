package sP.week5_3;
abstract class Book{
	protected String number;
	protected String title;
	protected String author;
	//관리번호, 제목, 저자 변수 선언
	public Book(){
		
	}//디폴트 생성자
	public Book(String n,String t,String a){
		number=n;
		title=t;
		author=a;
	}//매개변수가 3개인 생성자
	public String getNumber() {
		return number;
	}
	public void setNumber(String n) {
		number = n;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String t) {
		title = t;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String a) {
		author = a;
	}
	//접근자 설정자
	public boolean equals(Object other){
		if(other instanceof Book)
			return number.equals(( (Book) other).number);
		//받는 매개변수가 Book인지를 체크해서 Book이면 관리번호가 같은지 확인한다
		else
			return false;
	}//equals 메소드 재정의
	abstract int getLateFees();//연체료를 계산하는 추상 메서드
	@Override
	public String toString() {
		return "Book [number=" + number + ", title=" + title + ", author=" + author + "]";
	}//정보 출력
}

class Novel extends Book{
	//추상 클래스 Book을 상속받는 클래스
	private int lateDay;
	//연체일 변수 선언
	public Novel(){
		
	}//디폴트 생성자
	public Novel(int l){
		lateDay=l;
	}//매개변수가 1개인 생성자
	public int getLateDay() {
		return lateDay;
	}
	public void setLateDay(int l) {
		lateDay = l;
	}
	//접근자 설정자
	public int getLateFees(){
		return 300/lateDay;
	}//연체료 계산하는 메서드
	@Override
	public String toString() {
		return "Novel [lateDay=" + lateDay + "]";
	}//정보 출력
}
class Poet extends Book{
	//추상 클래스 Book을 상속받는 클래스
	private int lateDay;
	//연체일 변수 선언
	public Poet(){
		
	}//디폴트 생성자
	public Poet(int l){
		lateDay=l;
	}//매개변수 1개인 생성자
	
	public int getLateDay() {
		return lateDay;
	}
	public void setLateDay(int l) {
		lateDay = l;
	}
	//설정자 접근자
	public int getLateFees(){
		return 200/lateDay;
	}//연체료 계산하는 메서드
	@Override
	public String toString() {
		return "Poet [lateDay=" + lateDay + "]";
	}//정보 출력
}
class ScienceFiction extends Book{
	//추상 클래스 Book을 상속받는 클래스
	private int lateDay;
	//연체일 변수 선언
	public ScienceFiction(){
		
	}//디폴트 생성자
	public ScienceFiction(int l){
		lateDay=l;
	}//매개변수가 1개인 설정자
	
	public int getLateDay() {
		return lateDay;
	}
	public void setLateDay(int l) {
		lateDay = l;
	}
	//설정자 접근자
	public int getLateFees(){
		return 600/lateDay;
	}//연체료 계산하는 메서드
	@Override
	public String toString() {
		return "ScienceFiction [lateDay=" + lateDay + "]";
	}//정보 출력
}
public class BookTest {

	public static void main(String[] args) {
		Book b1 = new Novel(2);
		Book b2 = new Poet(3);
		Book b3 = new ScienceFiction(5);
		Book b4 = new Novel(5);
		//각 클래스를 가르키는 Book객체
		b1.setNumber("2222");
		b2.setNumber("3232");
		b3.setNumber("3123");
		b4.setNumber("2222");
		//관리번호 설정
		System.out.println(b1.equals(b4));
		System.out.println(b1.equals(b2));
		//b1과 b4,b2가 같은 책인지 확인
		System.out.println(b1.getLateFees());
		System.out.println(b2.getLateFees());
		System.out.println(b3.getLateFees());
		//b1,b2,b3의 연체료 계산
	}
}