package ch10.Generic;
import java.util.Map;
import java.util.HashMap;
public class GHashMapTest {

	public static void main(String[] args) {
		Map<String,MyStudent> map=new HashMap<String,MyStudent>();
		//map.put(1,new Integer(100));
		//map.put("second","Hello World!!");
		map.put("third", new MyStudent("ÀÌ¼ø½Å"));
		MyStudent st=map.get("third");
		System.out.println(st);
		System.out.println(map.get("third"));
	}

}
