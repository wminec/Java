package ch04.practice;

public class Ex13 {
	public static void main(String[] args) {
		//1.���� ���� ����
		int num1=100;
		int num2=505;
		int div=2;
		int count=0;
		int num=0;
		
		//2.��� ����
		while(true){
			//�Ҽ� �Ǻ� �κ�
			for(int i=1; i<=div;i++){
				if(div%i==0){
					count++;
				}
			}
			
			//�Ҽ��� ������ �κ�
			if(count==2){
				num=num1;
				while(num%div==0){
					System.out.println(num1+"�� ���μ�:"+div);
					num/=div;
				}
			}
			
			if( num==1 || div>=num1 )
				break;
			else{
				count=0;
				div++;
			}
		}
	}
}
