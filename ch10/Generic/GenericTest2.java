package ch10.Generic;
import java.util.*;
public class GenericTest2 {

	public static void main(String[] args) {
		
		ArrayList list=new ArrayList();
		list.add(new MyStudent("홍길동"));
		System.out.println((Integer)list.get(0)); //ArrayList에 저장된 데이터를 가져오면서 다른 타입으로 type casting하고 있다.
	}

}
