package ch10.List;
import java.util.List;
import java.util.ArrayList;

public class ProdTest {
	public void getProdInfo(List list){
		Product prod=null;
		String code=null;
		String name=null;
		String color=null;
		int qty=0;
		
		for(int i=0;i<list.size();i++){
			prod=(Product)list.get(i);
			
			code=prod.getCode();
			name=prod.getName();
			color=prod.getCode();
			qty=prod.getQty();
			
			System.out.println("��ǰ��ȣ = "+code);
			System.out.println("��ǰ�̸� = "+name);
			System.out.println("��ǰ���� = "+color);
			System.out.println("��ǰ���� = "+qty);
			System.out.println();
		}
		
	}
	public static void main(String[] args) {
		ArrayList pList = new ArrayList();
		Product p1=new Product();
		Product p2=new Product("0002","����Ʈ TV","���",200);
		Product p3=new Product("0003","��Ʈ��","����",100);
		
		pList.add(p1);
		pList.add(p2);
		pList.add(p3);
		
		ProdTest p = new ProdTest();
		
		p.getProdInfo(pList);
		
	}

}
