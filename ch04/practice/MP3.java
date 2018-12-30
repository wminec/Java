package ch04.practice;

public class MP3 {
	public void gugu(int n){
		for(int i=1; i<=9; i++){
			System.out.print(n+"*"+i+"="+n*i+" ");
		}
	}

	public static void main(String[] args) {
		int n=0;
		
		MP3 c= new MP3();
		
		n=4;
		c.gugu(n);
	}

}
