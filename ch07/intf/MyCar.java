package ch07.intf;

public interface MyCar {
	public static final int SAFE_SPEED=60;
	//public int SAFE_SPEED=60;
	
	public abstract void speedUp();
	public abstract void speedDown();
	public abstract void stop();
	
	/*
	 public void speedUp();
	 public void speedDown();
	 public void stop();
	 */
}
