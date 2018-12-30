package ch13.chat;
import java.io.*;
import java.net.*;
public class SimpleServer {

	public static void main(String[] args) {
		InputStream is;
		BufferedReader br_in;
		BufferedReader br_out;
		BufferedWriter bw = null;
		PrintWriter pw = null;
		OutputStream os;
		ServerSocket serverSocket;
		Socket s1 = null;
		String inMessage=null;
		String outMessage=null;
		try{
			serverSocket = new ServerSocket(5434);
			System.out.println("���� ���� ��...");
			s1=serverSocket.accept();
			is=s1.getInputStream();
			os = s1.getOutputStream();
			
			br_out=new BufferedReader(new InputStreamReader(System.in));
			br_in = new BufferedReader(new InputStreamReader(is));
			bw= new BufferedWriter(new OutputStreamWriter(os));
			pw=new PrintWriter(bw,true);
			pw.println("server: ������ ȯ���մϴ�.");
			while(true){
				inMessage=br_in.readLine();
				System.out.println(inMessage);
				
				outMessage=br_out.readLine();
				if(outMessage.equals("exit"))
					break;
				pw.println("server: "+outMessage);
			}
			pw.close();
			s1.close();
		}catch(IOException ie){
			ie.printStackTrace();
		}
	}

}
