package ch04.example;

public class CallByRef {
	public void increase(int[] n){
		for(int i=0; i<n.length;i++){
			n[i]++;
		}
	}

	public static void main(String[] args) {
		int[] ref1={100,800,1000};
		
		CallByRef ref=new CallByRef();
		
		System.out.println("�޼��带 ȣ�� ��");
		for(int i=0; i<ref1.length;i++){
			System.out.println("ref1["+i+"]: "+ref1[i]);
		}
		
		ref.increase(ref1);
		
		System.out.println();
		System.out.println("�޼��� ȣ�� ��");
		for(int i=0; i<ref1.length;i++){
			System.out.println("ref1["+i+"]: "+ref1[i]);
		}

	}

}
