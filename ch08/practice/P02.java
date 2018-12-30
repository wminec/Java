package ch08.practice;

public class P02 {

	public static void main(String[] args) {
		String origin="사과,바나나,귤-스마트폰,TV,노트북";
		String[] data=origin.split("-");
		
		System.out.println("과일 : "+data[0].replace(',', '/'));
		System.out.println("제품 : "+data[1].replace(',', '*'));
	}

}
