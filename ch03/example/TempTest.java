package ch03.example;

public class TempTest {

	public static void main(String[] args) {
		int BASE=32;
		float celsius=0f,fahrenheit=0f;
		
		fahrenheit=100;
		
		celsius=(fahrenheit-BASE)*5.0f/9.0f;
		System.out.println("È­¾¾ "+fahrenheit+"µµ¿¡ ´ëÇÑ ¼·¾¾´Â " +celsius+"µµÀÔ´Ï´Ù.");
		
		fahrenheit=celsius*9.0f/5.0f+BASE;
		System.out.println("È­¾¾ "+celsius+"µµ¿¡ ´ëÇÑ ¼·¾¾´Â " +fahrenheit+"µµÀÔ´Ï´Ù.");
	}

}
