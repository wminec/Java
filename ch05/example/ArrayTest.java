package ch05.example;

public class ArrayTest {

	public static void main(String[] args) {
		int[] Array={11,21,23,45,43};
		
		ArrayUtil ar=new ArrayUtil();
		
		ar.summarize(Array);
		ar.order(Array);
		for(int i=0; i<Array.length;i++)
			System.out.print(Array[i]+" ");
		//정렬이 되어있구나....

	}

}
