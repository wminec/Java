package ch04.example;

public class ArrayTest {

	public static void main(String[] args) {
		int[] num;	//�迭 ����.
		
		num=new int[2];	//new�� �̿��ؼ� �迭 ����.
		num[0]=1;
		num[1]=2;	//�迭 �ʱ�ȭ.
		//num[2]=3;
		//num[1]=5.6f;
		System.out.println("num �迭�� ���� : "+num.length);
		
		for(int i=0; i<num.length;i++){
			System.out.println("num: "+num[i]);
		}

	}

}
