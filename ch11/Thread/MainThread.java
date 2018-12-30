package ch11.Thread;

public class MainThread {

	public static void main(String[] args) {
		System.out.println("현재 수행되고 있는 스레드 이름: >>"+Thread.currentThread().getName());
		System.out.println("스레드의 최소우선순위 값: >>"+Thread.MIN_PRIORITY);
		System.out.println("스레드의 중간우선순위 값: >>"+Thread.NORM_PRIORITY);
		System.out.println("스레드의 최고우선순위값: >>"+Thread.MAX_PRIORITY);
		System.out.println("현재 수행되고 있는 스레드의 우선순위: >>"+Thread.currentThread().getPriority());
	}

}
