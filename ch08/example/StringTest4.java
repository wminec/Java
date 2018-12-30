package ch08.example;

public class StringTest4 {

	public static void main(String[] args) {
		String[] str={"hello","love","victory","truth"};
		String temp=null;
		for(int i=0; i<str.length;i++){
			for(int j=i+1;j<str.length;j++){
				if(str[i].compareTo(str[j])>0){ //str[i]값이 str[j]보다 느릴경우
					temp=str[i];
					str[i]=str[j];
					str[j]=temp;
				}
			}
		}
		for(int i=0;i<str.length;i++)
			System.out.println(str[i]);
	}

}
