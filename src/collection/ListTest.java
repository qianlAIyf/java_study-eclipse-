package collection;

import java.util.ArrayList;
import java.util.List;

public class ListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		
		int i = (int)(Math.random()*(list.size() - 1));
		System.out.println("随机获取数组中的元素：" + list.get(i));
		list.remove(2); 
		System.out.print("删除索引为2的元素后，集合中的元素为：");
		for(int j = 0; j < list.size(); j ++) {
			System.out.print(list.get(j) + " ");
		}
	}

}
