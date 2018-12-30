package sP.week5;

class Phone{
	protected String manufacturer;
	protected int price;
	protected String tellType;
	//제조사, 가격, 통신 타입 변수 선언
	public Phone(){
		
	}//디폴트 생성자
	public Phone(String m, int p, String t){
		manufacturer=m;
		price=p;
		tellType=t;
	}//매개변수가 3개인 생성자
	
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
	}//설정자 접근자
	@Override
	public String toString() {
		return "Phone [manufacturer=" + manufacturer + ", price=" + price + ", tellType=" + tellType + "]";
	}//정보 출력
	
}

class SmartPhone extends Phone{
	String osType;
	String osVersion;
	int memorySize;
	boolean camCheck;
	boolean bluetoothCheck;
	//os타입과 버전, 메모리 사이즈, 카메라 장착과 블루투스 지원 여부
	public SmartPhone(){
		
	}//디폴트 생성자
	public SmartPhone(String ot,String ov, int m, boolean c, boolean b){
		osType=ot;
		osVersion=ov;
		memorySize=m;
		camCheck=c;
		bluetoothCheck=b;
	}//매개변수가 5개인 생성자
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
	}//접근자 설정자
	@Override
	public String toString() {
		return "SmartPhone [osType=" + osType + ", osVersion=" + osVersion + ", memorySize=" + memorySize
				+ ", camCheck=" + camCheck + ", bluetoothCheck=" + bluetoothCheck + "]";
	}//정보 출력
	
}
public class PhoneTest {

	public static void main(String[] args) {
		Phone p = new Phone("TestM",10000,"TestType");//phone 객체 생성
		SmartPhone s = new SmartPhone("TestOs","TestVersion",1024,false,false);//smartphone객체 생성
		
		System.out.println(p);
		System.out.println(s);
	}
}