package sP.week5_3;
abstract class Book{
	protected String number;
	protected String title;
	protected String author;
	//������ȣ, ����, ���� ���� ����
	public Book(){
		
	}//����Ʈ ������
	public Book(String n,String t,String a){
		number=n;
		title=t;
		author=a;
	}//�Ű������� 3���� ������
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
	//������ ������
	public boolean equals(Object other){
		if(other instanceof Book)
			return number.equals(( (Book) other).number);
		//�޴� �Ű������� Book������ üũ�ؼ� Book�̸� ������ȣ�� ������ Ȯ���Ѵ�
		else
			return false;
	}//equals �޼ҵ� ������
	abstract int getLateFees();//��ü�Ḧ ����ϴ� �߻� �޼���
	@Override
	public String toString() {
		return "Book [number=" + number + ", title=" + title + ", author=" + author + "]";
	}//���� ���
}

class Novel extends Book{
	//�߻� Ŭ���� Book�� ��ӹ޴� Ŭ����
	private int lateDay;
	//��ü�� ���� ����
	public Novel(){
		
	}//����Ʈ ������
	public Novel(int l){
		lateDay=l;
	}//�Ű������� 1���� ������
	public int getLateDay() {
		return lateDay;
	}
	public void setLateDay(int l) {
		lateDay = l;
	}
	//������ ������
	public int getLateFees(){
		return 300/lateDay;
	}//��ü�� ����ϴ� �޼���
	@Override
	public String toString() {
		return "Novel [lateDay=" + lateDay + "]";
	}//���� ���
}
class Poet extends Book{
	//�߻� Ŭ���� Book�� ��ӹ޴� Ŭ����
	private int lateDay;
	//��ü�� ���� ����
	public Poet(){
		
	}//����Ʈ ������
	public Poet(int l){
		lateDay=l;
	}//�Ű����� 1���� ������
	
	public int getLateDay() {
		return lateDay;
	}
	public void setLateDay(int l) {
		lateDay = l;
	}
	//������ ������
	public int getLateFees(){
		return 200/lateDay;
	}//��ü�� ����ϴ� �޼���
	@Override
	public String toString() {
		return "Poet [lateDay=" + lateDay + "]";
	}//���� ���
}
class ScienceFiction extends Book{
	//�߻� Ŭ���� Book�� ��ӹ޴� Ŭ����
	private int lateDay;
	//��ü�� ���� ����
	public ScienceFiction(){
		
	}//����Ʈ ������
	public ScienceFiction(int l){
		lateDay=l;
	}//�Ű������� 1���� ������
	
	public int getLateDay() {
		return lateDay;
	}
	public void setLateDay(int l) {
		lateDay = l;
	}
	//������ ������
	public int getLateFees(){
		return 600/lateDay;
	}//��ü�� ����ϴ� �޼���
	@Override
	public String toString() {
		return "ScienceFiction [lateDay=" + lateDay + "]";
	}//���� ���
}
public class BookTest {

	public static void main(String[] args) {
		Book b1 = new Novel(2);
		Book b2 = new Poet(3);
		Book b3 = new ScienceFiction(5);
		Book b4 = new Novel(5);
		//�� Ŭ������ ����Ű�� Book��ü
		b1.setNumber("2222");
		b2.setNumber("3232");
		b3.setNumber("3123");
		b4.setNumber("2222");
		//������ȣ ����
		System.out.println(b1.equals(b4));
		System.out.println(b1.equals(b2));
		//b1�� b4,b2�� ���� å���� Ȯ��
		System.out.println(b1.getLateFees());
		System.out.println(b2.getLateFees());
		System.out.println(b3.getLateFees());
		//b1,b2,b3�� ��ü�� ���
	}
}