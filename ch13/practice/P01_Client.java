package ch13.practice;
import java.io.*;
import java.net.*;
import java.util.*;
public class P01_Client {

	public static void main(String[] args) {
		List sList= new ArrayList();
		
		sList.add(new P01_Student("ȫ�浿",3,"����",80));
		sList.add(new P01_Student("�̼���",3,"����",90));
		sList.add(new P01_Student("�Ӳ���",3,"����",78));
		sList.add(new P01_Student("ȫ�浿",3,"����",76));
		sList.add(new P01_Student("�Ӳ���",3,"����",56));
		sList.add(new P01_Student("ȫ�浿",3,"����",70));
		sList.add(new P01_Student("�̼���",3,"����",67));
		sList.add(new P01_Student("�Ӳ���",3,"����",77));
		try{
			Socket s1 = new Socket("127.0.0.1",5433);
			
			InputStream in = s1.getInputStream();
			OutputStream out = s1.getOutputStream();
			ObjectInputStream dis = new ObjectInputStream(in);
			ObjectOutputStream dos = new ObjectOutputStream(out);
			dos.writeObject(sList);
			List rList = new ArrayList();
			rList=(ArrayList)dis.readObject();
			for(int i=0; i<(rList.size()+1)/3; i++){
				P01_Student st = (P01_Student)rList.get(i);
				System.out.println(st.getName()+"�� ����: "+st.getSum()+", ���: "+(st.getSum()/st.getSubjectNum()));
			}
			dos.close();
			dis.close();
			s1.close();
		}catch(ConnectException connExc){
			System.out.println("���� ����.");
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
