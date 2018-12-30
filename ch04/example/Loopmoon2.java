package ch04.example;

public class Loopmoon2 {

	public static void main(String[] args) {
		for(int i=0; i<10; i++){
			if(i==5)	break;
			System.out.println("i= "+i);
		}

		for(int i=0; i<10; i++){
			if(i==5)	continue;	//continue는 continue 다음의 문장을 생략후 처음으로 되돌아감.
			System.out.println("i= "+i);
		}
	}
}
