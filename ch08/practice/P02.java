package ch08.practice;

public class P02 {

	public static void main(String[] args) {
		String origin="���,�ٳ���,��-����Ʈ��,TV,��Ʈ��";
		String[] data=origin.split("-");
		
		System.out.println("���� : "+data[0].replace(',', '/'));
		System.out.println("��ǰ : "+data[1].replace(',', '*'));
	}

}
