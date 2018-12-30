package ch13.example;
import java.net.*;
import java.io.*;
public class SerClient {

	public static void main(String[] args) {
		try{
			Socket s1 = new Socket("127.0.0.1",5433);
			
			InputStream is = s1.getInputStream();
			ObjectInputStream dis = new ObjectInputStream(is);
			Employee p = (Employee)dis.readObject();
			System.out.println("�̸�: "+p.getName());
			System.out.println("�ּ�: "+p.getAddr());
			System.out.println("�ֹι�ȣ: "+p.getJumin());
			System.out.println("��ȭ��ȣ: "+p.getPhone());
			
			dis.close();
			s1.close();
		}catch(ConnectException connExc){
			System.err.println("���� ����.");
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
