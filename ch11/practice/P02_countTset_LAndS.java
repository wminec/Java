package ch11.practice;

public class P02_countTset_LAndS {

	public static void main(String[] args) {
		P02_Area_LAndS area;
		area=new P02_Area_LAndS();
		
		Thread first = new P02_countThread_LAndS("first",area);
		Thread second = new P02_countThread_LAndS("second",area);
		Thread third = new P02_countThread_LAndS("third",area);
		
			first.start();
			second.start();
			third.start();
	}
}
