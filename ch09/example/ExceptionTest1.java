package ch09.example;

public class ExceptionTest1 {

	public static void main(String[] args) {
		try{
			int[] num=new int[2];
			num[0]=1;
			num[1]=2;
			//num[2]=3;
			num[1]=3/0; //Exception Ÿ���� ��� ���ܸ� ���� �� �ִ�.
			System.out.println("Hello");
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("ArrayIndexOutOfBoundsException ó��");
		}catch(Exception e){
			e.printStackTrace();
		}
		System.out.println("World");
	}

}
