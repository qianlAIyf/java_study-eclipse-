
public class array {
	public static void main(String[] args) {
		//定义
		int a[];
		int []b;
		
		//初始化
		a = new int[]{1, 2, 3};
		b = new int[]{1, 2, 3}; //不能使用b = new []int{1, 2, 3};来初始化
		
		//在定义的时候初始化
		int c[] = new int[] {1, 2, 3};
		
		//遍历数组
		for(int i = 0; i < a.length; i ++) {
			System.out.println(a[i]);
		}
		
		System.out.println("--------");
		//foreach遍历
		for(int j:a) {
			System.out.println(j);
		}
		
		System.out.println("--------");
		//动态定义数组，然后初始化，大小为3
		int d[] = new int[3];	//int型数组元素初始值为0
		char f[] = new char[3];	//char型数组元素初始值为空，即'/uoooo'(null)
		for(int i:d) {
			System.out.println(i);
		}
		System.out.println("--------");
		for(char i:f) {
			System.out.println(i);
		}
	}
}
