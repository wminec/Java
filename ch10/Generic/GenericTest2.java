package ch10.Generic;
import java.util.*;
public class GenericTest2 {

	public static void main(String[] args) {
		
		ArrayList list=new ArrayList();
		list.add(new MyStudent("ȫ�浿"));
		System.out.println((Integer)list.get(0)); //ArrayList�� ����� �����͸� �������鼭 �ٸ� Ÿ������ type casting�ϰ� �ִ�.
	}

}
