package ch04.example;

public class Loopmoon {

	public static void main(String[] args) {
		int a=0;
		int sum=0;
		
		while(a<5){
			sum+=a;
			System.out.println("sum= "+sum);
			a++;
		}
		a=0;
		sum=0;
		do{
			sum+=a;
			System.out.println("sum= "+sum);
			a++;
		}while(a<5);
		
		sum=0;
		for(int i=0; i<5; i++){
			sum+=i;
			System.out.println("гую╨ "+sum);
		}
	}

}
