package ch12.example;
import java.io.*;
public class WriteFile {

	public static void main(String[] args) {
		File file=new File("write.txt");
		try{
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			PrintWriter out = new PrintWriter(new FileWriter(file,true));
			String s;
			System.out.println("Exit : Ctrl + Z");
			while((s=in.readLine())!=null){
				out.println(s);
				//out.print(s);
			}
			in.close();
			out.close();
		}catch(IOException e){
			System.out.println("IOException");
		}
	}

}
