package ch14.example;

public class ForTest1 {

	public static void main(String[] args) {
		String[] str = {"world","hello","love","victory","truth"};
		
		for(int i=0; i<str.length; i++){
			System.out.println(str[i]);
		}
		
		System.out.println("���� for������ ����ϱ�\n");
		for(String temp: str){
			System.out.println(temp);
		}
	}

}
