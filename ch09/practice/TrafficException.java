package ch09.practice;

public class TrafficException extends Exception{
	String violationMessage;
	
	public TrafficException(String violationMessage){
		this.violationMessage=violationMessage;
	}
	
	public String getViolationMessage(){
		return "���� ����: "+violationMessage;
	}
}
