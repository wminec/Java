package ch12.example;
import java.io.*;
public class PrintWriterEx1 {

	public static void main(String[] args) {
		FileWriter fw=null;
		BufferedWriter bw = null;
		PrintWriter pw = null;
		
		try{
			fw = new FileWriter("printWriter1.txt");
			bw= new BufferedWriter(fw);
			pw=new PrintWriter(bw,true);
			pw.println("�ȳ��ϼ���.");
			pw.println("�ݰ����ϴ�.");
			pw.println("Hello World");
			pw.println(100);
			pw.println(new Integer(20000));
			
			fw.close();
			bw.close();
			pw.close();
		}catch(IOException ie){
			System.out.println("IOException �߻�");
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
