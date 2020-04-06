import java.util.Scanner;

public class optionStatement {
	public static void main(String[] args) {
		//定义获取系统输入类的对象
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		switch (n) {
		case 1:{
			System.out.println("1");
			break;
		}
		default:{
			break;
		}
		}
	}
}
