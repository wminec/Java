package ch11.practice;

public class P04_Restaurant {

	public static void main(String[] args) {
		P04_Food food=new P04_Food();
		
		P04_Waitor waitor=new P04_Waitor("������",food);
		P04_Chef chef=new P04_Chef("�ֹ���",food);
		
		waitor.start();
		try{
			waitor.sleep(1);
		}catch(Exception e){
			e.printStackTrace();
		}
		
		chef.start();
	}
}
