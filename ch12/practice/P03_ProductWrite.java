package ch12.practice;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
public class P03_ProductWrite {

	public static void main(String[] args) {
		int count=1;
		String s=null;
		
		String prodCode=null;
		String prodName=null;
		String prodColor=null;
		String prodQty=null;
		String prodPrice=null;
		
		File file = new File("product.txt");
		try{
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			PrintWriter out = new PrintWriter(new FileWriter(file,false));
			do{
				System.out.println(count+"��° ��ǰ ������ �Է��Ͻÿ�.");
				System.out.print("��ǰ �ڵ� : ");
				prodCode=in.readLine();
				
				System.out.print("��ǰ �̸� : ");
				prodName=in.readLine();
				
				System.out.print("��ǰ ���� : ");
				prodColor=in.readLine();
				
				System.out.print("��ǰ ���� : ");
				prodQty=in.readLine();
				
				System.out.print("��ǰ �ܰ� : ");
				prodPrice=in.readLine();
				
				s=prodCode+","+prodName+","+prodColor+","+prodQty+","+prodPrice;
				out.println(s);
				count++;
			}while(count<=3);
			in.close();
			out.close();
		}catch(IOException e){
			System.out.println("IOException");
		}
	}

}
