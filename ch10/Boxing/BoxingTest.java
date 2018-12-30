package ch10.Boxing;
import java.util.ArrayList;
public class BoxingTest {

	public static void main(String[] args) {
		ArrayList<Object> list=new ArrayList<Object>();
		
		Integer data0=new Integer(123);
		list.add(data0);
		Integer data1=(Integer)list.get(0);
		int num=data1.intValue();
		System.out.println("값은 : "+num);
		
		int data2=543;
		list.add(data2);
		int data3=(Integer)list.get(1);
		System.out.println("값은 : "+data3);
	}

}
