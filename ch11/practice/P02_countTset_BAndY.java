package ch11.practice;

public class P02_countTset_BAndY {

	public static void main(String[] args) {
		P02_Area_BAndY area;
		area=new P02_Area_BAndY();
		
		Thread first = new P02_countThread_BAndY("first",area);
		Thread second = new P02_countThread_BAndY("second",area);
		Thread third = new P02_countThread_BAndY("third",area);
		
		try{
			first.start();
			Thread.sleep(100);
			second.start();
			Thread.sleep(100);
			third.start();
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
