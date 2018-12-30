package ch08.practice;

public class P03 {
	public boolean B(String s){
		boolean Bool=true;
		for(int i=0; i<s.length()/2;i++){
			if(s.charAt(i)!=s.charAt(s.length()-i-1)){
				Bool=false;
				break;
			}
		}
		return Bool;
	}

	public static void main(String[] args) {
		String[] s={"level","hello"};
		P03 bool =new P03();
		
		for(int i=0; i<s.length; i++){
			if(bool.B(s[i])==true){
				System.out.println(s[i]+"는 회문입니다.");
			}else{
				System.out.println(s[i]+"는 회문이 아닙니다.");
			}
		}		
	}
}
