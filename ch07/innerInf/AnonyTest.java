package ch07.innerInf;

public class AnonyTest {
	public void printB(Anony a){
		a.print();
	}
	public static void main(String[] args) {
		AnonyTest t= new AnonyTest();
		t.printB(new Anony(){
			public void print(){
				System.out.println("�͸� Ŭ���� ��� ���Դϴ�.");
			}
		});
	}

}
