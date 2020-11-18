import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

public class ArrayTest {
	public static void main(String[] args) {
		ArrayTest arrayTest = new ArrayTest();
		int [] x = {1,2,3,4,5,6};
//		arrayTest.definition();
//		arrayTest.sort();
//		arrayTest.insert();
//		arrayTest.reverse();
//		arrayTest.combination();
//		arrayTest.ergodic_array();
//		arrayTest.ergodic_map();
		arrayTest.fill();
	}
	public void definition() {
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

	public void sort() {
		int [] a = {-1,2,-9,10,0};
		System.out.print("origin: ");
		for (int i : a) {
			System.out.print(i + ",");
		}
		System.out.println();
		System.out.println("element '10' located in:" + Arrays.binarySearch(a, 10));
		//sort
		Arrays.sort(a);
		System.out.print("sorted: ");
		for (int i : a) {
			System.out.print(i + ",");
		}
		System.out.println();
		System.out.println("element '10' located in:" + Arrays.binarySearch(a, 10));
	}

	public void insert() {
		int [] a = {1, 3, 4};
		int [] b = new int[a.length + 1];  //newly create one array
		System.out.print("origin: ");
		for (int i : a) {
			System.out.print(i + ",");
		}
		System.out.println();
		System.arraycopy(a, 0, b, 0, 1);
		b[1] = 2; //insert '2'
		System.arraycopy(a, 1, b, 2, a.length - 1);
		System.out.print("insert: ");
		for (int i : b) {
			System.out.print(i + ",");
		}
	}

	public void reverse() {
		ArrayList<Integer> arrayList = new ArrayList<>();
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(3);
		arrayList.add(4);
		arrayList.add(5);
		System.out.println("origin: " + arrayList);
		Collections.reverse(arrayList);
		System.out.println("reverse: " + arrayList);
	}

	public void combination() {
		String [] aStrings = {"a", "b", "x"};
		String [] bStrings = {"c", "d", "y"};
		
		List list = new ArrayList(Arrays.asList(aStrings));
		list.addAll(Arrays.asList(bStrings));
		Object [] cObject = list.toArray();
		System.out.println(Arrays.toString(cObject));
	}

	public void ergodic_array() {//loop through
		List<String> list = new ArrayList<String>();
		list.add("abc");
		list.add("ABC");
		list.add("!");
		
		//first method---foreach
		for (String string : list) {
			System.out.println(string);
		}
		
		//second method---for
		String [] aStrings = new String[list.size()];
		list.toArray(aStrings);
		for(int i =0; i < aStrings.length; i ++) {
			System.out.println(aStrings[i]);
		}
		
		//third method---iterator
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

	public void ergodic_map() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("a", "1");
		map.put("b", "2");
		map.put("c", "3");
		
		//first
		System.out.println("通过Map.ketSet遍历key和value：");
		for(String string : map.keySet()) {
			System.out.println("key = " + string + ", value = " + map.get(string));
		}
		System.out.println();
		
		//second
		System.out.println("通过Map.entrySet,使用iterator遍历key和value：");
		Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
		while(iterator.hasNext()) {
			Map.Entry<String, String> entry = iterator.next();
			System.out.println("key = " + entry.getKey() + ", value = " + entry.getValue());
		}
		System.out.println();
		
		//third:推荐，尤其是容量大时
		System.out.println("通过Map.entrySet遍历key和value：");
		for(Map.Entry<String, String> entry : map.entrySet()) {
			System.out.println("key = " + entry.getKey() + ", value = " + entry.getValue());
		}
		System.out.println();
		
		//fourth
		System.out.println("通过Map.values()遍历所有的value，但不能遍历key：");
		for(String value : map.values()) {
			System.out.println("value = " + value);
		}
	}

	public void fill() {
		int [] a = new int[4];
		Arrays.fill(a, 10);
		for(int i = 0; i < a.length; i ++) {
			System.out.println(a[i]);
		}
		
		System.out.println();
		
		Arrays.fill(a, 2, 4, 5);
		for(int i = 0; i < a.length; i ++) {
			System.out.println(a[i]);
		}
	}
}
