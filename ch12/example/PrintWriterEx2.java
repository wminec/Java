package ch12.example;

import java.io.*;

public class PrintWriterEx2 {

	public static void main(String[] args) {
		PrintWriter pw = null;
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		
		try{
			fos = new FileOutputStream("printWriter2.txt");
			bos = new BufferedOutputStream(fos);
			pw=new PrintWriter(bos,true);
			pw.println("�ȳ��ϼ���.");
			pw.println("�� �����׿�.");
			pw.println("Hello World");
			pw.println(100.0);
			pw.println(new Boolean(true));
			
			fos.close();
			bos.close();
			pw.close();
		}catch(IOException ie){
			System.out.println("IOException �߻�");
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
