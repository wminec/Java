package ch03.example;

public class CharTest2 {

	public static void main(String[] args) {
		char ch1='h'; //아스키코드값:104
		char ch2='e'; //101
		char ch3='l'; //108
		char ch4='l'; //108
		char ch5='o'; //111
		
		System.out.println(ch1+ch2+ch3+ch4+ch5);
//		System.out.println((char)ch1+(char)ch2+(char)ch3+(char)ch4+(char)ch5); 위와 같은 값이 나온다.
		System.out.println((ch1)+""+(ch2)+""+ch3+""+ch4+""+ch5);
//		System.out.println((ch1)+""+(ch2)+ch3+ch4+ch5); 결과값 hello
		//ch들 사이의 +""+는 첫번재 결과처럼 나지 않기 위해서. 아스키코드값 + 문자.
		System.out.println((char)(ch1-32)+""+
							(char)(ch2-32)+""+
							(char)(ch3-32)+""+
							(char)(ch4-32)+""+
							(char)(ch5-32));
		
/*		System.out.println((ch1-32)+" "+
				(ch2-32)+" "+
				(ch3-32)+" "+
				(ch4-32)+" "+
				(ch5-32)); 결과값 72 69 76 76 79 
*/
	}

}
