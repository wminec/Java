package sP.week3;

class Average{
	public int getAverage(int a, int b){//�Ķ���Ͱ� 2���� ��� ���ϴ� �޼ҵ� 
		return (a+b)/2;
	}
	public int getAverage(int a, int b, int c){//�Ķ���Ͱ� 3���� ��� ���ϴ� �޼ҵ�
		return (a+b+c)/3;
	}
}
public class AverageTest {

	public static void main(String[] args) {
		Average a = new Average();//��ü ����
		
		System.out.println(a.getAverage(4, 2)); //�Ķ���͸� 2���� ����
		System.out.println(a.getAverage(4, 2,6));//�Ķ���͸� 3���� ����
	}
}
