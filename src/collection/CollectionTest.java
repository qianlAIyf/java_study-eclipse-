package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection<String> lCollection = new ArrayList<>();
		lCollection.add("a");
		lCollection.add("b");
		
		Iterator<String> iterator = lCollection.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
