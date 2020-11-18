
public class operator {
	public static void main(String[] args) {
		boolean a1 = true;
		boolean a2 = false;
		
		//与 &&
		boolean c1 = a1 && a2;
		System.out.println("&&:" + c1);
		
		//短路与&
		boolean c2 = a1 & a2;
		System.out.println("&:" + c1);
		
		//算术运算符
		int b = 2;
		int x = b + -1; //b + (-1)效果也一样；
		int y = b * -1;
		System.out.println("b + -1 =" + x);
		System.out.println("b * -1 =" + y);
		
		//科学计数e或E
		float e = (float)1.1e-5;//浮点数默认为double，需要强制转换
		System.out.println(e);
		
		//位运算符
		int bit1 = 0xaaaaaaaa;
		int bit2 = 0x55555555;
		System.out.println(Integer.toBinaryString(bit1));//Integer.toBinaryString()方法返回int类型数据的二进制表示，如果最高位位0，则不显示
		System.out.println(Integer.toBinaryString(bit2));
		System.out.println(Integer.toBinaryString(bit1 & bit2));
		long bit3 = 10241024l;
		System.out.println(Long.toBinaryString(bit3));
		
		int s,w,q;
		s= w = q = 1;
		
	}
}
