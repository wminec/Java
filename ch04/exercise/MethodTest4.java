package ch04.exercise;

public class MethodTest4 {
	public void summarize(int max){
		int num=1;
		int sum=0;
		
		while(true){
			sum+=num;
			
			if(sum>=max)
				break;
			num+=2;
			
		}
		System.out.println(max+"���� ���ʷ� ũ�� �Ǵ� Ȧ���� "+num+", ");
		System.out.println(num+"������ ���� "+sum);
	}

	public static void main(String[] args) {
		int limit1=1000;
		int limit2=10000;
		
		MethodTest4 t=new MethodTest4();
		t.summarize(limit1);
		t.summarize(limit2);
		

	}

}
