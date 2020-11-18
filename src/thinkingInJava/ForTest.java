package thinkingInJava;

import java.util.Random;

public class ForTest {
	static Random random = new Random(47);
	public static void compare() {
		int a = random.nextInt();
		int b = random.nextInt();
		System.out.println("a = " + a + ", b = " + b);
		if(a > b) {
			System.out.println("a > b");
		}
		else if(a < b)
			System.out.println("a < b");
		else {
			System.out.println("a = b");
		}
	}
	public static void main(String[] args) {
		for(int i = 0; i < 5; i ++) {
			compare();
		}
	}
}
