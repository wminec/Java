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
				System.out.println(count+"번째 제품 정보를 입력하시오.");
				System.out.print("제품 코드 : ");
				prodCode=in.readLine();
				
				System.out.print("제품 이름 : ");
				prodName=in.readLine();
				
				System.out.print("제품 색상 : ");
				prodColor=in.readLine();
				
				System.out.print("제품 수량 : ");
				prodQty=in.readLine();
				
				System.out.print("제품 단가 : ");
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
