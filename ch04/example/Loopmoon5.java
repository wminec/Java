package ch04.example;

public class Loopmoon5 {

	public static void main(String[] args) {
		label1:
			for(int i=0; i<5; i++){
				for(int j=0; j<5; j++){
					if(j==2)	break label1;
					System.out.println("j= "+j);
				}
				System.out.println();
			}

	}

}
