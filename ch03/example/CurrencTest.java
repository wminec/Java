package ch03.example;

public class CurrencTest {

	public static void main(String[] args) {
		int won=354000;
		int rate=960;
		float dollar;
		
		dollar=won/rate; //정수만 리턴한다.(소수부는 버림)
		System.out.println(won+"원 에 대한 달러는 :"+dollar+" 달러");
		
		dollar=(float)won/(float)rate;
		System.out.println(won+"원 에 대한 달러는 :"+dollar+" 달러");
		dollar=(float)won/rate;
		System.out.println(won+"원 에 대한 달러는 :"+dollar+" 달러");
		// float/int는 int가 자동으로 float로 변한(float/float)을 된다. 
		
		//won=dollar*rate;
		won=(int)dollar*rate;
		System.out.println(dollar+"달러에 대한 원은 :"+won+"원");
		//여기서 dollar의 값은 368.75 float타입의 숫자이다.
		//위는 달러를 먼저 정수로 바꾼 후 계산한 결과고 밑은 계산 후 정수로 변환 한 값 이다.
		won=(int)(dollar*rate);
		System.out.println(dollar+"달러에 대한 원은 :"+won+"원");
	}
}
