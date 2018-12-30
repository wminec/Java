package ch13.practice;
import java.io.*;
import java.net.*;
import java.util.*;
public class P01_Server {
	/*public static void calcGesu(String[] _fruit){
		int len=_fruit.length;
		String[] fruit_Name= new String[len];
		int[] gesu= new int[len];
		String name=null;
		
		for(int i=0; i<len;i++){
			name=_fruit[i];
			
			for(int j=0; j<len; j++){
				if(name.equals(fruit_Name[j])){
					gesu[j]++;
					break;
				}else if(fruit_Name[j]==null){
					fruit_Name[j]=name;
					gesu[j]++;
					break;
				}
			}
		}
		System.out.println("과일별 개수");
		System.out.println("=============");
		for(int i=0;i<len;i++){
			if(fruit_Name[i]!=null){
				System.out.println(fruit_Name[i]+ " : "
						+ ""+gesu[i]+"개");
			}
		}
	}*/

	public static void main(String[] args) {
		ServerSocket s = null;
		int sum=0;
		
		try{
			s=new ServerSocket(5433);
		}catch(IOException e){
		}
		
		while(true){
			try{
				System.out.println("서버 실행중 !!!");
				Socket s1=s.accept();
				
				OutputStream out = s1.getOutputStream();
				InputStream in = s1.getInputStream();
				ObjectOutputStream dos = new ObjectOutputStream(out);
				ObjectInputStream dis = new ObjectInputStream(in);
				List sList= new ArrayList();
				sList = (ArrayList)dis.readObject();
				int[] scoreArray = new int[sList.size()];
				String[] nameArray = new String[sList.size()];
				int[] subjectArray = new int[sList.size()];
				for(int i=0; i<sList.size(); i++){
					P01_Student st = (P01_Student)sList.get(i);
					/*System.out.println(st.getName());
					System.out.println(st.getGrade());
					System.out.println(st.getSubject());
					System.out.println(st.getScore());*/
					for(int j=0; j<sList.size(); j++){
						if(st.getName().equals(nameArray[j])){
							scoreArray[j]+=st.getScore();
							subjectArray[j]++;
							break;
						}else if(nameArray[j]==null){
							nameArray[j]=st.getName();
							scoreArray[j]+=st.getScore();
							subjectArray[j]++;
							break;
						}
					}
				}
				List rList = new ArrayList();
				for(int i=0; i<nameArray.length; i++){
					rList.add(new P01_Student(nameArray[i],scoreArray[i],subjectArray[i]));
					
				}
				dos.writeObject(rList);
				dis.close();
				dos.close();
				s1.close();
			}catch(IOException e){
				e.printStackTrace();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}

}
