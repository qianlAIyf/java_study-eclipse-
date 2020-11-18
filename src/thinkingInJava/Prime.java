package thinkingInJava;

import java.util.Scanner;

import static java.lang.Math.*; //java的静态导入，使得本文件可以直接调用导入的静态方法，而不必使用classname.method();
import static thinkingInJava.ClosureMethod.*;

public class Prime {
	//寻找给定整数的素数
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int x = 0;
		if(scanner.hasNext()) {
			 x= scanner.nextInt();
		}
		//call methods
//		method1(x);
		method2(x);
	}
	
	private static void method1(int x) {
		boolean test = true;
		for(int i = 1; i <= x; i ++) {
			for(int j = 2; j < i; j ++) {
				if(i % j == 0)
					test = false;
			}
			if(test)
				System.out.print(i + " ");
		}
	}

	private static void method2(int x) {
		//Eratosthenes
		boolean [] sieve = new boolean[x + 1];
		int limit = (int)floor(sqrt(x));
		
		print(1 + " ");
		if(x > 1)	print(2 + " ");
		
		for(int i = 3; i <= limit; i += 2)
			if(!sieve[i])
				for(int j = 2 * i; j <= x; j += i)
					sieve[j] = true;
			
		for(int k = 3; k <= x; k +=2)
			if(!sieve[k])
				print(k + " ");
	}
}
