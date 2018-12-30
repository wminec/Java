package ch04.practice;

public class MP6 {
	public void ch(char c){
		System.out.println((char)(c-32));
	}

	public static void main(String[] args) {
		char c=0;
		
		MP6 t = new MP6();
		
		c='a';
		t.ch(c);

	}

}
