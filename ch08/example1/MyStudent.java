package ch08.example1;

public class MyStudent {
	String name;
	int kor;
	int eng;
	int total;
	
	public MyStudent(){
		
	}
	public String toString(){
		String info=name+"�� ��������>>"
				+ " ����:"+kor
				+ " ����:"+eng
				+ " ����:"+total;
		
		return info;
	}
}