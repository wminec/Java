package ch11.practice;

public class P04_Food {
	public  void receiveOrder(String waitor){
		synchronized(this){
			for(int i=0; i<5;i++){
				System.out.println(waitor+ " �� �ֹ��� �޽��ϴ�.");
					
			}
			this.notify();   //��⸦ �ض�
			System.out.println(waitor+ " �� �ֹ��� �ֹ濡 �����մϴ�.");
			System.out.println();
			try{
				this.wait();  //Lock�� �ݳ��� �� ��� ���� �����忡�� ���Ḧ �˸���.				
			}catch(InterruptedException e){	 
				e.printStackTrace();        
			}
		}
	}
	public void makeFood(String chef){
		synchronized(this){
			for(int i=0; i<5;i++){
				System.out.println(chef+ " ������ ����ϴ�.");
					
			}
			this.notify();
			System.out.println(chef + "�� ������ �� ��������ϴ�.");
			System.out.println();
			try{
				this.wait();  //Lock�� �ݳ��� �� ��� ���� �����忡�� ���Ḧ �˸���.				
			}catch(InterruptedException e){	 
				e.printStackTrace();        
			}
	
		}
	}
}
