package ch03.example;

public class LogicalTest {

	public static void main(String[] args) {
		int a=0;
		int b=10;
		int c=0;
		
		System.out.println((a!=0)&&((c=b)>20));
		System.out.println("c= "+c);
		System.out.println((a!=0)&((c=b)>20));
		System.out.println("c= "+c+"\n");
		//&&는 좌측 조건의 값이 false이므로 우측 연산은 하지 않으나, &는 좌측 연산이 false여도 우측 연산 실행.
		
		c=0;
		System.out.println((a==0)||((c=b)>20));
		System.out.println("c= "+c);
		System.out.println((a==0)|((c=b)>20));
		System.out.println("c= "+c+"\n");
		//||는 좌측 조건의 값이 true이므로 우측 연산은 실행할 필요없이 true이므로 우측연산 실행 x, |는 좌측 조건의 값이 true라도 우측 연산 실행.
		
		int var1=1;
		int result=0;
		
		result=(var1!=1)?0:1;	//"?"앞의 값이 true이면 "?"다음 값을 되돌려 주고, false이면 ":" 오른쪽 값을 되돌려 준다.
		System.out.println("result= "+result+"\n");
		
		String address="부산시 사하구";
		if(address instanceof String)
			System.out.println("변수 address은 String 타입입니다.");
		//instanceof는 주로 참조형 변수의 타입을 비교하기 위해 사용된다. 자세히는 6장에서 배운다.
	}

}
