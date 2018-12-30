package ch08.practice;

public class P01 {

	public static void main(String[] args) {
		String s1="12300";
		String s2="11000000001100";
		//num=Integer.parseInt(num2,2);
		//생고생 안하는 방법
		
		int n1= Integer.parseInt(s1);
		System.out.println("binary of s1>>"+Integer.toBinaryString(n1));
		int n2=0;
		int count=s2.length()-1;
		for(int i=0; i<s2.length(); i++){
			if(count!=-1){
				if(s2.charAt(i)=='1'){
					n2+=Math.pow(2, count);
					count--;
				}else{
					count--;
				}
			}else{
				break;
			}
		}//end for문
		System.out.println("decimal of s2>>"+n2);
	}
}
