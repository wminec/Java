package ch07.innerInf;

public class InnerTest3 {

	public static void main(String[] args) {
		MyOuter3.Inner inner = new MyOuter3.Inner("������ ������");
		System.out.println("������>> "+inner.getUserInfo());
	}

}
