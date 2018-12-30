package ch12.example;
import java.io.*;
public class FileReaderTest {

	public static void main(String[] args) {
		File file=new File("write.txt");
		FileReader fr = null;
		try{
			fr=new FileReader(file);
			int readChar;
			while((readChar = fr.read())!=-1){
				System.out.println((char)readChar);
			}
		}catch(IOException ie){
			ie.printStackTrace();
		}finally{
			try{
				if(fr!=null) fr.close();
			}catch(IOException ie){
				ie.printStackTrace();
			}
		}
	}

}
