package ch08.example;

public class StringFormatTest {

	public static void main(String[] args) {
		String sValue="이순신";
		int nValue=543;
		long lValue=543L;
		float fValue=6.5E5f;
		double dValue=7.654321E10d;
		
		System.out.println(String.format("%s 입니다.", sValue));
		
		System.out.println(String.format("%d", nValue));
		System.out.println(String.format("%5d", nValue));
		System.out.println(String.format("%05d", nValue));
		
		System.out.println(String.format("%d", lValue));
		System.out.println(String.format("%5d", lValue));
		System.out.println(String.format("%05d", lValue));
		
		System.out.println(String.format("%f", fValue));
		System.out.println(String.format("%5f", fValue));
		System.out.println(String.format("%05.05f", fValue));
		
		System.out.println(String.format("%f", dValue));
		System.out.println(String.format("%5.5f", dValue));
		System.out.println(String.format("%05.05f", dValue));
	}

}
