package ch04.example;

public class CallByString {
	public void setAddress(String addr){
		addr="��⵵ ������ ��ȱ�";
	}
	
	public static void main(String[] args) {
		String address="����� ������ ������";
		
		CallByString st=new CallByString();
		System.out.println("�޼��� ȣ�� ��");
		System.out.println("address= "+address);
		
		st.setAddress(address);
		
		System.out.println("�޼��� ȣ�� ��");
		System.out.println("address= "+address);

		//�̷��� ����� �����Ƿ� ���ڿ��� ���� �Ϸ��� ������ �����Ͷ� ���� ���� ȣ���� �ؾ� �Ѵ�.
	}

}
