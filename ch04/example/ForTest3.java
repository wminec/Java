package ch04.example;

public class ForTest3 {

	public static void main(String[] args) {
		int rowNum=3;
		int starNum=7;
		
		for(int i=0; i<rowNum; i++){
			for(int j=0; j<starNum;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
