package ch10.Generic;

public class MyStudent {
	String name;
	
	public MyStudent(String name){
		this.name=name;
	}
	
	public String getName(){
		return name;
	}
	public String toString(){
		return "학생 이름:" +name;
	}
}
