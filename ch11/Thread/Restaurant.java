package ch11.Thread;

public class Restaurant {

	public static void main(String[] args) {
		Food food=new Food();
		
		Waiter Waiter=new Waiter("������",food);
		Chef Chef=new Chef("�ֹ���",food);
		
		Waiter.start();
		Chef.start();
	}

}
