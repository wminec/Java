package ch12.ex5;
import java.io.*;
import java.util.*;
public class SerTest {

	public static void main(String[] args) {
		Employee p=new Employee("������","����","11111-222222","123-1234");
		Employee p2=new Employee("������","����","33333-444444","987-6543");
		ArrayList list=new ArrayList();
		list.add(p);
		list.add(p2);
		
		try{
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream (new File("serial.ser")));
			oos.writeObject(list);
		}catch(IOException e){
			e.printStackTrace();
		}
	}

}
