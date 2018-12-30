package ch04.example;

public class Loopmoon4 {

	public static void main(String[] args) {
		for(int i=0; i<5; i++){
			System.out.println("i= "+i);
			for(int j=0; j<5; j++){
				if(j==2)	break;
				System.out.println("j= "+j);
			}
			System.out.println();
		}

	}

}
