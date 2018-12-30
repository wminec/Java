package ch13.example;
import java.io.*;
import java.net.*;
public class SimpleServer {

	public static void main(String[] args) {
		BufferedWriter bw;
		PrintWriter pw=null;
		OutputStream os;
		ServerSocket serverSocket;
		Socket s1=null;
		InetAddress ipAddrs=null;
		String connectedClient=null;
		String outMessage=null;
		try{
			serverSocket = new ServerSocket(5432);
			System.out.println("���� ���� ��...");
			
			while(true){
				s1=serverSocket.accept();
				os=s1.getOutputStream();
				ipAddrs=s1.getInetAddress();
				
				connectedClient=ipAddrs.toString();
				bw = new BufferedWriter(new OutputStreamWriter(os));
				pw = new PrintWriter(bw,true);
				pw.println(connectedClient+" ���� ������ �����ϼ̽��ϴ�.");
				pw.close();
				s1.close();
			}
		}catch(IOException ie){
			ie.printStackTrace();
		}
	}

}