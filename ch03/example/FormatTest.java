package ch03.example;

public class FormatTest {

	public static void main(String[] args) {
		String sValue =" 이순신";
		int nValue = 543;
		long lValue=543l;
		float fValue=6.5E5f;
		double dValue=7.654321e10d;
		
		System.out.printf("%s 입니다.\n\n",sValue);
		
		System.out.printf("%d\n",nValue);
		System.out.printf("%5d\n",nValue);
		System.out.printf("%05d\n\n",nValue);
		
		System.out.printf("%d\n",lValue);
		System.out.printf("%5d\n",lValue);
		System.out.printf("%05d\n",lValue);
		System.out.printf("%f\n",fValue);
		System.out.printf("%5.5f\n",fValue);
		System.out.printf("%05.05f\n\n",fValue);
		
		System.out.printf("%f\n",dValue);
		System.out.printf("%5.4f\n",dValue);
		System.out.printf("%05.02f\n",dValue);
	}

}
