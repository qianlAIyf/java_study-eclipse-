package thinkingInJava;

/**
 * @author 陈乾
 *
 */
public class BloodSuckerNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print_BS_Number();
	}
	
	public static void print_BS_Number() {
		/*"吸血鬼"数字：具有偶数个数位的数字a，可以由两个数字相乘得来，且这两个数字各具有a的一半数位，
		 * 另外，这两个数字的各位数均在a中出现，出现的次数一样*/
		
		int []digit1 = new int[4];//记录积的各位数字
		int []digit2 = new int[4];//记录两个因数的数字
		
		int num1, num2;
		
		for(num1 = 10; num1 <= 99; num1 ++)
			for(num2 = 10; num2 <= 99; num2 ++) {
				if(num1 * num2 % 9 != (num1 + num2) % 9)// Pete Hartley's theoretical 
					continue;
				int product = num1 * num2;
				
				digit1[0] = product / 1000;
				digit1[1] = product % 1000 / 100;
				digit1[2] = product % 100 / 10;
				digit1[3] = product % 10;
				
				digit2[0] = num1 / 10;
				digit2[1] = num1 % 10;
				digit2[2] = num2 / 10;
				digit2[3] = num2 % 10;
				
				int count = 0;
				for(int i = 0; i < 4; i ++)
					for(int j = 0; j < 4; j ++) {
						if(digit1[i] == digit2[j]) {
							count ++;
							digit1[i] = -1;
							digit2[j] = -2;
							if(count == 4) {
								System.out.println(product + " = " + num1 + " * " + num2);
							}
						}
					}
			}
	}
}
