package ch09.example;

public class ExceptionTest2 {

	public static void main(String[] args) {
		try{
			int[] num=new int[2];
			num[0]=1;
			num[1]=2;
			num[2]=3;
			System.out.println("Hello ");
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("ArrayIndexOutOfBoundsException ���� �߻�");
		}finally{
			System.out.println("���� �߻� ������ �����ϰ� �ݵ�� �����Ѵ�.");
		}
		System.out.println("World");
	}

}