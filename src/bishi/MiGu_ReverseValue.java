package bishi;

import java.util.Scanner;

public class MiGu_ReverseValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()) {
			System.out.print(MiGu_ReverseValue.reverseValue(scanner.next()));
		}
	}
	
	public static long reverseValue(String value) {
		long x = Integer.parseUnsignedInt(value);
		long y = 0;
		for(int i = 0; i < 32; i ++) {
			y += ((x >> i) & 1) * Math.pow(2, 31 -i);
		}
		
		return y;
	}

}
