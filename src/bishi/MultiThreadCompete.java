package bishi;
/**
 * 预期输出结果是10M，但结果远比其小。修改程序使其达到预期输出。
 */

import java.util.ArrayList;
import java.util.List;

public class MultiThreadCompete extends Thread{
	static final int LOOP = 100000;
	static int counter = 0;
	/*
	 * (non-Javadoc)
	 * @see java.lang.Thread#run()
	 */
	public void run() {
		for(int i = 0; i < LOOP; i ++) {
			counter ++;
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		List<MultiThreadCompete> tlist = new ArrayList<>();
		for(int i = 0; i < 100; i ++) {
			tlist.add(new MultiThreadCompete());
			tlist.get(i).start();
		}
		while(true) {
			if(!tlist.stream().allMatch(MultiThreadCompete::isAlive))
				System.out.println(counter);
				break;
		}
		Thread.sleep(100);
	}

}
