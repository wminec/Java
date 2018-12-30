package sP.week2;

public class PrimeNumber {

	public static void main(String[] args) {
		
		int check=0;	//체크용 변수 선언
		System.out.println("2~100 사이의 소수는");
		for(int i=2; i<=100; i++){
			for(int j=2; j<i; j++){
				if(i%j==0){	
					//i를 2부터 j까지 나누어 보았을때 나누어 지는것이 있는지 체크
					check++;	//체크변수가 0이 아니게 된다.
					break;
				}
			}
			if(check==0)	//체크변수가 0이면 출력
				System.out.print(i+" " );
			check=0;	//체크변수 초기화
		}
	}
}
