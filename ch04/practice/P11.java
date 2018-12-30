package ch04.practice;

public class P11 {

	public static void main(String[] args) {
		char[] ch={'h','e','l','l','o'};
		char temp=0;
		//104,101,108,108,111
		/*for(int i=0; i<ch.length;i++)
			System.out.println((int)ch[i]);*/
		for(int i=0; i<ch.length;i++){
			for(int j=i; j<ch.length;j++){
				if(ch[i]>ch[j]){
					temp=ch[i];
					ch[i]=ch[j];
					ch[j]=temp;
				}
			}
		}//오름차순 for end
		for(int i=0; i<ch.length;i++)
			System.out.print(ch[i]);
		System.out.println();
		
		for(int i=0; i<ch.length;i++){
			for(int j=i; j<ch.length;j++){
				if(ch[i]<ch[j]){
					temp=ch[i];
					ch[i]=ch[j];
					ch[j]=temp;
				}
			}
		}//내림차순 for end
		for(int i=0; i<ch.length;i++)
			System.out.print(ch[i]);
		System.out.println();
	}

}
