package ch10.Map;
import java.util.*;
public class HashTableTest {

	public static void main(String[] args) {
		Map map=new Hashtable();
		
		map.put(1, new Integer(100));
		map.put("second", "Hello World!!");
		map.put("third", new MyStudent());
		map.put("fourth", null); //HashTable은 Key나 Value에 null입력 불가
		
		//Integer i=map.get(1);
		Integer i=(Integer)map.get(1);
		//String str=map.get("second");
		String str=(String)map.get("second");
		
		System.out.println(i);
		System.out.println(str);
		
		MyStudent st=(MyStudent)map.get("third");
		System.out.println(st);
		System.out.println(map.get("third"));
		System.out.println(map.get("fourth"));
	}

}
