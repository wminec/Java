package ch08.example;

public class ObjectArray {
	public static void main(String[] args){
		String code=null;
		String name=null;
		String color=null;
		int qty=0;
		
		Object object[]=new Object[5];
		
		Product prod0=new Product();
		Product prod1=new Product("0002","����Ʈ TV","���",200);
		Product prod2=new Product("0003","��Ʈ��","����",100);
		
		object[0]="ȫ�浿";
		object[1]=prod0;
		object[2]=prod1;
		object[3]=prod2;
		object[4]=new Integer(123);
		
		System.out.println("Object �迭�� ������ ��ǰ ���� ���");
		System.out.println();
		
		for(int i=0; i<object.length;i++){
			if(object[i] instanceof Product){
				Product prod=(Product)object[i];
				code=prod.getCode();
				name=prod.getName();
				color=prod.getColor();
				qty=prod.getQty();
				
				System.out.println("��ǰ��ȣ = "+code);
				System.out.println("��ǰ�̸� = "+name);
				System.out.println("��ǰ���� = "+color);
				System.out.println("��ǰ���� = "+qty);
			}else{
				System.out.println(object[i]);
			}
			System.out.println();
		}//end for��
	}
}
