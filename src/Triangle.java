/**
 * 
 * @author 陈乾
 *
 */
public class Triangle {
	/**
	 * 
	 * @param args
	 */
	public static void main(String args[]) {
		
		//实心菱形
//		
//	    *
//	   ***
//	  *****
//	 *******
//	  *****
//	   ***
//	    *
//		int m = 4;
//		//输出上三角
//		for(int i = 1; i <= m; i ++) {
//			for(int j = 0; j < ((2 * m) - 1) / 2 + 1 - i ; j ++) {
//				System.out.print(" ");
//			}
//			for(int k = 0; k < (2 * i) - 1; k ++) {
//				System.out.print("*");
//			}
//			System.out.print("\n");
//		}
//		//输出下三角
//		for(int i = 1; i <= m; i ++) {
//			for(int j = 0; j < i; j ++) {
//				System.out.print(" ");
//			}
//			for(int k = (m - i) * 2 - 1; k > 0; k --) {
//				System.out.print("*");
//			}
//			System.out.print("\n");
//		}


		//空心菱形
//		    *
//		   * *
//		  *   *
//		 *     *
//		  *   *
//		   * *
//		    *
		int m = 4;
		//输出上三角
		for(int i = 1; i <= m; i ++) {
			for(int j = 0; j < ((2 * m) + 1) / 2 - i; j ++) {
				System.out.print(" ");
			}
			System.out.print("*");
 			for(int j = 0; j < 2 * (i - 1) - 1; j ++) {
				System.out.print(" ");
			}
			if(i != 1)
				System.out.println("*");
			else System.out.println();
		}
		//输出下三角
		for(int i = 1; i <= m - 1; i ++) {
			for(int j = 0; j < i; j ++) {
				System.out.print(" ");
			}
			System.out.print("*");
			for(int k = 1; k < 2 * (m - i) - 2; k ++ ) {
				System.out.print(" ");
			}
			if(i != m - 1)
				System.out.println("*");
			else System.out.println();
		}
	}
}
