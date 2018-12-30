package ch11.Thread;

public class Restaurant {

	public static void main(String[] args) {
		Food food=new Food();
		
		Waiter Waiter=new Waiter("웨이터",food);
		Chef Chef=new Chef("주방장",food);
		
		Waiter.start();
		Chef.start();
	}

}
