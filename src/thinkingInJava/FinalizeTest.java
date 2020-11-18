package thinkingInJava;

public class FinalizeTest {

	protected void finalize() {
		System.out.println("finalize called!");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new FinalizeTest();
		System.gc();
		System.runFinalization();
	}

}
