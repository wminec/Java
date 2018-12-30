package sP.week5;

class Phone{
	protected String manufacturer;
	protected int price;
	protected String tellType;
	//������, ����, ��� Ÿ�� ���� ����
	public Phone(){
		
	}//����Ʈ ������
	public Phone(String m, int p, String t){
		manufacturer=m;
		price=p;
		tellType=t;
	}//�Ű������� 3���� ������
	
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String m) {
		manufacturer = m;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int p) {
		price = p;
	}
	public String getTellType() {
		return tellType;
	}
	public void setTellType(String t) {
		tellType = t;
	}//������ ������
	@Override
	public String toString() {
		return "Phone [manufacturer=" + manufacturer + ", price=" + price + ", tellType=" + tellType + "]";
	}//���� ���
	
}

class SmartPhone extends Phone{
	String osType;
	String osVersion;
	int memorySize;
	boolean camCheck;
	boolean bluetoothCheck;
	//osŸ�԰� ����, �޸� ������, ī�޶� ������ ������� ���� ����
	public SmartPhone(){
		
	}//����Ʈ ������
	public SmartPhone(String ot,String ov, int m, boolean c, boolean b){
		osType=ot;
		osVersion=ov;
		memorySize=m;
		camCheck=c;
		bluetoothCheck=b;
	}//�Ű������� 5���� ������
	public String getOsType() {
		return osType;
	}
	public void setOsType(String ot) {
		osType = ot;
	}
	public String getOsVersion() {
		return osVersion;
	}
	public void setOsVersion(String ov) {
		osVersion = ov;
	}
	public int getMemorySize() {
		return memorySize;
	}
	public void setMemorySize(int m) {
		memorySize = m;
	}
	public boolean isCamCheck() {
		return camCheck;
	}
	public void setCamCheck(boolean c) {
		camCheck = c;
	}
	public boolean isBluetoothCheck() {
		return bluetoothCheck;
	}
	public void setBluetoothCheck(boolean b) {
		bluetoothCheck = b;
	}//������ ������
	@Override
	public String toString() {
		return "SmartPhone [osType=" + osType + ", osVersion=" + osVersion + ", memorySize=" + memorySize
				+ ", camCheck=" + camCheck + ", bluetoothCheck=" + bluetoothCheck + "]";
	}//���� ���
	
}
public class PhoneTest {

	public static void main(String[] args) {
		Phone p = new Phone("TestM",10000,"TestType");//phone ��ü ����
		SmartPhone s = new SmartPhone("TestOs","TestVersion",1024,false,false);//smartphone��ü ����
		
		System.out.println(p);
		System.out.println(s);
	}
}