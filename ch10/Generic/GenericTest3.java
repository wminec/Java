package ch10.Generic;

public class GenericTest3 {

	public static void main(String[] args) {
		GOrigin<String> t=new GOrigin<String>();
		String str="æ»≥Á«œººø‰";
		
		t.set(str);
		t.getData();
		
		GOrigin<Integer> t1 = new GOrigin<Integer>();
		
		int num=1;
		t1.set(num);
		//t1.set(str);
		t1.getData();
		
		GOrigin t3=new GOrigin();
		//GenericOrigin <Object>t3=new GenericOrigin<Object>();
		t3.set(str);
		t3.getData();
		t3.set(num);
		t3.getData();
	}

}
