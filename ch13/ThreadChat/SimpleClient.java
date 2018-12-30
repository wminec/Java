package ch13.ThreadChat;
import java.io.*;
import java.net.*;
public class SimpleClient {

	public static void main(String[] args) {
		OutputStream os;
		BufferedReader br_in;
		BufferedWriter bw=null;
		PrintWriter pw=null;
		String outMessage=null;
		
		try{
			Socket s1=new Socket("127.0.0.1",5434);
			os=s1.getOutputStream();
			RecvThread rThread=new RecvThread(s1);
			rThread.start();
			
			br_in=new BufferedReader(new InputStreamReader(System.in));
			bw=new BufferedWriter(new OutputStreamWriter(os));
			pw=new PrintWriter(bw,true);
			while(true){
				outMessage=br_in.readLine();
				if(outMessage.equals("exit"))
					break;
				pw.println("client: "+outMessage);
			}
			pw.close();
			s1.close();
			
			if(rThread.isAlive()){
				rThread.interrupt();
				rThread=null;
			}
		}catch(SocketException e){
			System.out.println("������ ���� ������ ���������ϴ�. �����մϴ�...");
			System.exit(0);
		}catch(Exception e){
			e.printStackTrace();
			System.exit(0);
		}
	}

}
