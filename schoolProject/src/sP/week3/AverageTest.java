package sP.week3;

class Average{
	public int getAverage(int a, int b){//파라미터가 2개인 평균 구하는 메소드 
		return (a+b)/2;
	}
	public int getAverage(int a, int b, int c){//파라미터가 3개인 평균 구하는 메소드
		return (a+b+c)/3;
	}
}
public class AverageTest {

	public static void main(String[] args) {
		Average a = new Average();//객체 생성
		
		System.out.println(a.getAverage(4, 2)); //파라미터를 2개로 설정
		System.out.println(a.getAverage(4, 2,6));//파라미터를 3개로 설정
	}
}
