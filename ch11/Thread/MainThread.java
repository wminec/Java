package ch11.Thread;

public class MainThread {

	public static void main(String[] args) {
		System.out.println("���� ����ǰ� �ִ� ������ �̸�: >>"+Thread.currentThread().getName());
		System.out.println("�������� �ּҿ켱���� ��: >>"+Thread.MIN_PRIORITY);
		System.out.println("�������� �߰��켱���� ��: >>"+Thread.NORM_PRIORITY);
		System.out.println("�������� �ְ�켱������: >>"+Thread.MAX_PRIORITY);
		System.out.println("���� ����ǰ� �ִ� �������� �켱����: >>"+Thread.currentThread().getPriority());
	}

}
