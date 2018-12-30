package ch04.practice;

public class P1 {

	public static void main(String[] args) {
		int startNum=5;
		int row_len=5;
		for(int i=0; i<row_len; i++){
			for(int j=0; j<startNum; j++){
				System.out.print("*");
			}
			System.out.println();
		}//first for end
		System.out.println();
		
		for(int i=0; i<row_len; i++){
			for(int j=0; j<startNum-i; j++){
				if(i==3)
					continue;
				System.out.print("*");
			}
			if(i!=3)
				System.out.println();
		}//second for end
		System.out.println();
		
		row_len=10;
		startNum=7;
		for(int i=0; i<row_len-1; i++){
			if(i<row_len/2){
				for(int j=0; j<startNum-i; j++){
					System.out.print("*");	
				}
			}else{
				for(int j=0; j<startNum-row_len+i+2; j++){
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

}
