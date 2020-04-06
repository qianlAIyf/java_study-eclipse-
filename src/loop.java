
public class loop {
	public static void main(String[] args) {
		int n = 1;
		//do ... while 
//		do {
//			System.out.print(n + " ");
//			n ++;
//		}while(n < 10);
//		System.out.print("\n");
//		//for
//		for(int i = 1; i < 10; i ++) {
//			System.out.print(i + " ");
//		}
		
		//打印出水仙花数：三位数，各位的立方和等于其本身
//		daffodil();
		
		//打印九九乘法表
//		multiply9_9();
		
		//break、continue
		pauseLoop();
	}
	private static void daffodil() {
		for(int i = 100; i <= 999; i ++) {
			int baiwei = i / 100;
			int shiwei = (i - baiwei * 100) / 10;
			int gewei = i - baiwei * 100 - shiwei * 10;
			if(baiwei * baiwei * baiwei + shiwei * shiwei * shiwei + gewei * gewei * gewei == i) {
				System.out.println(i);
			}
		}
	}
	
	private static void multiply9_9(){
		for(int i = 1; i <= 9; i ++) {
			for(int j = 1; j <= i; j ++) {
				System.out.print(i + "*" + j + "=" + i * j + "  ");
			}
			System.out.println();
		}
	}
	
	private static void pauseLoop() {
//		outer:	//跳出循环到此处
		for(int i = 1; i <= 10; i ++) {
			for(int j = 1; j <= 10; j ++) {
//				if(i == 1) break;	//跳出当前循环
//				if(i == 1) break outer;
//				if(i == 1) continue;	//跳出本次循环
//				if(i == 1) return;	//直接返回方法调用处
				System.out.print("i=" + i + " j=" + j);
			}
			System.out.println();
		}
	}
}
