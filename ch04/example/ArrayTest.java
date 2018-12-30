package ch04.example;

public class ArrayTest {

	public static void main(String[] args) {
		int[] num;	//배열 선언.
		
		num=new int[2];	//new를 이용해서 배열 생성.
		num[0]=1;
		num[1]=2;	//배열 초기화.
		//num[2]=3;
		//num[1]=5.6f;
		System.out.println("num 배열의 개수 : "+num.length);
		
		for(int i=0; i<num.length;i++){
			System.out.println("num: "+num[i]);
		}

	}

}
