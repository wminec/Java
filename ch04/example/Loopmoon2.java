package ch04.example;

public class Loopmoon2 {

	public static void main(String[] args) {
		for(int i=0; i<10; i++){
			if(i==5)	break;
			System.out.println("i= "+i);
		}

		for(int i=0; i<10; i++){
			if(i==5)	continue;	//continue�� continue ������ ������ ������ ó������ �ǵ��ư�.
			System.out.println("i= "+i);
		}
	}
}
