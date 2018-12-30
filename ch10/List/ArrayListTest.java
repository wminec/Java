package ch10.List;

import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		List list=new ArrayList();
		
		list.add("Hello");
		list.add(new Integer(178));
		list.add(new MyStudent());
		list.add(new Float(4.56F));
		list.add("Hello");
		list.add(new Integer(178));
		
		/*for(int i=0; i<list.size();i++){
			System.out.println(list.get(i));
		}*/
		
		Iterator elements = list.iterator();
		while(elements.hasNext()){
			System.out.println(elements.next());
		}
	}

}
