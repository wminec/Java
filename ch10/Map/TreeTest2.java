package ch10.Map;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;
public class TreeTest2 {

	public static void main(String[] args) {
		TreeMap tm=new TreeMap();
		tm.put("ȫ�浿", "�����");
		tm.put("������", "�뱸��");
		tm.put("���缮", "�λ��");
		tm.put("�ڸ��", "�����");
		tm.put("������", "���ֽ�");
		tm.put("������", "�λ��");
		tm.put("������", "����");
		
		Set set=tm.keySet();
		
		Iterator ite=set.iterator();
		while(ite.hasNext()){
			String key=(String)ite.next();
			String value=(String)tm.get(key);
			
			System.out.println("key="+key+", value="+value);
		}
		System.out.println(tm);
	}

}
