package ch04.exercise;

public class Exercise4 {

	public static void main(String[] args) {
		int num=143;
		int count=0;
		
		for(int i=1; i<=num;i++){
			if(num%i==0){
				System.out.println("���: "+i);
				count++;
			}
		}
		System.out.println(num+"�� ����� ����: "+count);
		
		if(count==2)
			System.out.println(num+"�� �Ҽ��Դϴ�.");
		else
			System.out.println(num+"�� �ռ����Դϴ�.");

	}

}
