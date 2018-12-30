package ch10.Generic;

import java.util.ArrayList;

public class Tests {

	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		list.add(new MyStudent1("ÀÌ¼ø½Å"));
		MyStudent1 s=(MyStudent1)list.get(0);
		
		System.out.println(s.getName());
	}
}

class MyStudent1{
	String name;
	
	public MyStudent1(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
}