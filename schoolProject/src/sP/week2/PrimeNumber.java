package sP.week2;

public class PrimeNumber {

	public static void main(String[] args) {
		
		int check=0;	//üũ�� ���� ����
		System.out.println("2~100 ������ �Ҽ���");
		for(int i=2; i<=100; i++){
			for(int j=2; j<i; j++){
				if(i%j==0){	
					//i�� 2���� j���� ������ �������� ������ ���°��� �ִ��� üũ
					check++;	//üũ������ 0�� �ƴϰ� �ȴ�.
					break;
				}
			}
			if(check==0)	//üũ������ 0�̸� ���
				System.out.print(i+" " );
			check=0;	//üũ���� �ʱ�ȭ
		}
	}
}
