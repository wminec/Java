package ch04.exercise;

public class MethodTest7 {
	public void calcPrime(int _order){
		int num=2;
		int count=0;
		int order=0;
		
		while(true){
			for(int i=1; i<=num; i++){
				if(num%i==0){
					count++;
				}
			}
			
			if(count==2)
				order++;
			
			if(order==_order)
				break;
			else{
				count=0;
				num++;
			}
		}
		
		System.out.println("�ڿ������� "+order+"��° �Ҽ��� "+num+"�Դϴ�.");
	}

	public static void main(String[] args) {
		int order1=20;
		
		MethodTest7 t=new MethodTest7();
		t.calcPrime(order1);
		
		t.calcPrime(40);
		
		t.calcPrime(100);

	}

}
