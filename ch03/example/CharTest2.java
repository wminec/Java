package ch03.example;

public class CharTest2 {

	public static void main(String[] args) {
		char ch1='h'; //�ƽ�Ű�ڵ尪:104
		char ch2='e'; //101
		char ch3='l'; //108
		char ch4='l'; //108
		char ch5='o'; //111
		
		System.out.println(ch1+ch2+ch3+ch4+ch5);
//		System.out.println((char)ch1+(char)ch2+(char)ch3+(char)ch4+(char)ch5); ���� ���� ���� ���´�.
		System.out.println((ch1)+""+(ch2)+""+ch3+""+ch4+""+ch5);
//		System.out.println((ch1)+""+(ch2)+ch3+ch4+ch5); ����� hello
		//ch�� ������ +""+�� ù���� ���ó�� ���� �ʱ� ���ؼ�. �ƽ�Ű�ڵ尪 + ����.
		System.out.println((char)(ch1-32)+""+
							(char)(ch2-32)+""+
							(char)(ch3-32)+""+
							(char)(ch4-32)+""+
							(char)(ch5-32));
		
/*		System.out.println((ch1-32)+" "+
				(ch2-32)+" "+
				(ch3-32)+" "+
				(ch4-32)+" "+
				(ch5-32)); ����� 72 69 76 76 79 
*/
	}

}
