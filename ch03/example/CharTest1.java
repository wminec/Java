package ch03.example;

public class CharTest1 {

	public static void main(String[] args) {
		char ch='a';	//���� �ϳ��� �� ���� ''�� �̿�.
		int num=97;
		
		System.out.println("ch�� ��:" +ch+", �ƽ�Ű�ڵ�:"+(int)ch);
		System.out.println("num�� ��:"+num+", ����:"+(char)num);
		
		System.out.println("ch+1�� �� :"+(ch+1)+", ����."+(char)(ch+1));
		System.out.println("num+1�� ��:"+(num+1)+", ����."+(char)(num+1));
	}
}
