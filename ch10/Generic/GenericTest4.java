package ch10.Generic;

import java.util.*;

public class GenericTest4 {

	public static void main(String[] args) {
		ArrayList<MyStudent> list=new ArrayList<MyStudent>();
		list.add(new MyStudent("�̼���"));
		//list.add(new Integer(123));
		
		MyStudent s= list.get(0);
		//MyStudent s=(MyStudent)list.get(0);
		//MyStudent s= (Integer)list.get(0);
		System.out.println("�л� �̸�:"+s.getName());
	}
}
