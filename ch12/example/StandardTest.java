package ch12.example;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class StandardTest {

	public static void main(String[] args) {
		String mesg = null;
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(ir);
		System.out.println("exit: Ctrl+Z");
		try{
			mesg = in.readLine();
			while(mesg!=null){
				System.out.println("ÀÐ±â :"+mesg);
				mesg=in.readLine();
			}
			in.close();
			ir.close();
		}catch(IOException e){
			e.printStackTrace();
		}
	}

}
