package ch11.Thread;

public class Food {
	public synchronized void receiveOrder(String Waiter){
		for(int i=0; i<5; i++){
			System.out.println(Waiter+" �� �ֹ��� �޽��ϴ�");
		}
		System.out.println(Waiter+" �� �ֹ��� �ֹ濡 �����մϴ�.");
		System.out.println();
	}
	
	public synchronized void makeFood(String Chef){
		for(int i=0; i<5; i++){
			System.out.println(Chef+" ������ ����ϴ�.");
		}
		
		System.out.println(Chef+ "�� ������ �� ��������ϴ�.");
		System.out.println();
	}
}
