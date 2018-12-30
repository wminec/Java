package ch04.practice;

public class MP10 {

	public void summarize(int n){
		int temp=0;
		int remainder=0;
		
		for(int i=10; i<=n; i++){
			temp=i;
			while(true){
				remainder=temp%10;
				temp/=10;
				
				if(remainder!=temp%10){
					break;
				}else if(temp>=0 && temp<10){
					System.out.println(i);
				}
				
			}
		}
	}
	public static void main(String[] args) {
		int num1=100;
		int num2=1000;
		
		MP10 ex=new MP10();
		ex.summarize(num1);
		ex.summarize(num2);
	}

}
