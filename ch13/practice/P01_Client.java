package ch13.practice;
import java.io.*;
import java.net.*;
import java.util.*;
public class P01_Client {

	public static void main(String[] args) {
		List sList= new ArrayList();
		
		sList.add(new P01_Student("홍길동",3,"국어",80));
		sList.add(new P01_Student("이순신",3,"국어",90));
		sList.add(new P01_Student("임꺽정",3,"국어",78));
		sList.add(new P01_Student("홍길동",3,"영어",76));
		sList.add(new P01_Student("임꺽정",3,"영어",56));
		sList.add(new P01_Student("홍길동",3,"수학",70));
		sList.add(new P01_Student("이순신",3,"수학",67));
		sList.add(new P01_Student("임꺽정",3,"수학",77));
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
				System.out.println(st.getName()+"의 총점: "+st.getSum()+", 평균: "+(st.getSum()/st.getSubjectNum()));
			}
			dos.close();
			dis.close();
			s1.close();
		}catch(ConnectException connExc){
			System.out.println("연결 실패.");
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
