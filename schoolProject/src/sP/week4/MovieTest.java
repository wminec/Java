package sP.week4;

class Movie{
	private String movieName;	//��ȭ ���� ����
	private String producer;	//��ȭ ���� ����
	private String production;	//��ȭ ���ۻ� ����
	
	public Movie(String m, String pd1, String pd2){
		movieName=m;
		producer=pd1;
		production=pd2;
	}//�Ű������� 3���޴� ������
	public Movie(){
		movieName=null;
		producer=null;
		production=null;
	}//����Ʈ ������
	
	public String getMovieName(){ return movieName; }
	public void setMovieName(String m){ movieName=m; }
	public String getProducer(){ return producer; }
	public void setProducer(String pd1){ producer=pd1; }
	public String getProduction(){ return production; }
	public void setProduction(String pd2){ production=pd2; }
	//�����ڿ� ������
	public String toString(){
		return "��ȭ ����: "+movieName+", ��ȭ ����: "+producer+", ��ȭ ���ۻ�: "+production;
	}//Ŭ���� ���� ���
}
public class MovieTest {

	public static void main(String[] args) {
		Movie m = new Movie("��ȭ��1","����1","���ۻ�2");//��ü ����
		
		System.out.println(m);//���� ���
	}
}