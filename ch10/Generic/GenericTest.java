package ch10.Generic;
import java.util.*;
public class GenericTest {

	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		list.add(new MyStudent("�̼���"));
		MyStudent s=(MyStudent)list.get(0);
		
		System.out.println(s.getName());
	}
}
