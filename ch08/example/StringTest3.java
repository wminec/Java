package ch08.example;

public class StringTest3 {

	public static void main(String[] args) {
		String str1="hello";
		String str2="apple";
		if(str1.compareTo("victory")<0) //str1���� �� �����Ƿ� 0���� ���� ���� return
			System.out.println(str1+", "+"victory");
		else
			System.out.println("victory"+", "+str1);
		if(str1.compareTo(str2)<0)
			System.out.println(str1+", "+str2);
		else
			System.out.println(str2+", "+str1);
	}

}
