package ch08.example;

public class StringTest5 {

	public static void main(String[] args) {
		String temp="hello";
		int num1=123;
		float f_num=123.456f;
		String str1=temp+num1;
		System.out.println("���ڿ�: "+str1);
		
		String str2=temp+f_num;
		System.out.println("���ڿ�: "+str2);
		
		String str3="Java"+" Progamming";
		String str4="programming"+" Java";
		
		System.out.println(str3);
		System.out.println(str4);
	}

}
