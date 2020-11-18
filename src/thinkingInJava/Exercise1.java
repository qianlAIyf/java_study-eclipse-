package thinkingInJava;

import java.util.Random;

/**
 * 
 * @author 陈乾
 *
 */
public class Exercise1 {
	int a, c = 1;
	char b;
	
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Exercise1 exercise1 = new Exercise1();
		
		Random random = new Random(47);
		exercise1.a = random.nextInt();
		System.out.println(exercise1.a);
		System.out.println(exercise1.b);
		
		System.out.println(exercise1.a * -exercise1.c);
	}
}
