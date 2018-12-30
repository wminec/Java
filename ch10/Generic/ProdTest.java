package ch10.Generic;
import java.util.List;
import java.util.ArrayList;

public class ProdTest {

	public static void getProdInfo(List<Product> list){
		Product prod=null;
		String code=null;
		String name=null;
		String color=null;
		int qty=0;
		
		for(int i=0; i<list.size();i++){
			prod=list.get(i);
			
			code=prod.getCode();
			name=prod.getName();
			color=prod.getColor();
			qty=prod.getQty();
			
			System.out.println("��ǰ��ȣ = "+code);
			System.out.println("��ǰ�̸� = "+name);
			System.out.println("��ǰ���� = "+color);
			System.out.println("��ǰ���� = "+qty);
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		//ArrayList pList = new ArrayList();
		ArrayList<Product> pList=new ArrayList<Product>();
		Product p1=new Product();
		Product p2=new Product("0002","����Ʈ TV","���",200);
		Product p3=new Product("0003","��Ʈ��","����",100);
		
		pList.add(p1);
		pList.add(p2);
		pList.add(p3);
		
		//pList.add("ȫ�浿");
		//pList.add(new Integer(123));
		getProdInfo(pList);
	}

}
