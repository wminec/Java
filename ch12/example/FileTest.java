package ch12.example;
import java.io.File;
public class FileTest {

	public static void main(String[] args) {
		//C:\Users\Minec\workspace\ch12\src\ch12\example
		File file = new File("src/ch12/example","FileTest.java");
		System.out.println("������ ��δ�? "+file.getPath());
		System.out.println("������ �̸���? "+file.getName());
		System.out.println("������ �������͸���? "+file.getParent());
		System.out.println("������ �����δ�? "+file.getAbsolutePath());
		System.out.println("������ �����γ�? "+file.isAbsolute());
		System.out.println("������ �����ϳ�? "+file.exists());
		System.out.println("�����̳�? "+file.isFile());
		System.out.println("���͸��̳�? "+file.isDirectory());
		System.out.println("������ ���� �� �ֳ�? "+file.canRead());
		System.out.println("������ �� �� �ֳ�? "+file.canWrite());
		System.out.println("������ ����Ʈ ũ���? "+file.length());
		boolean b=new File("src/ch12/example"+File.separator+"hello").mkdir();
		//boolean b=new File("./hello").mkdir();
		//boolean b=new File(".\\hello").mkdir();
		String[] listing = new File("src/ch12/example").list();
		System.out.println("���� ���͸� ������?");
		for(int i=0; i<listing.length; ++i){
			System.out.println(listing[i]);
		}
	}

}
