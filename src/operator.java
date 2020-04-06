
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
	}
}
