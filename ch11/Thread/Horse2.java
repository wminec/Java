package ch11.Thread;

public class Horse2 implements Runnable{
	private int horse_num;
	
	public Horse2(int horse_num){
		this.horse_num=horse_num;
	}
	
	public void run(){
		for(int i=1; i<=10; i++){
			System.out.println(horse_num+"¹ø ¸»ÀÌ "+100*i+"¹ÌÅÍ µµÂø");
			if(horse_num==8 && i==5){
				System.out.println("8¸» yield()...");
				Thread.yield();
				try{
					Thread.sleep(200);
				}catch(InterruptedException e){
					e.printStackTrace();
				}
			}
		}
		System.out.println(horse_num+"¹ø ¸»ÀÌ "+"°á½Â¼± µµÂø");
	}
}
