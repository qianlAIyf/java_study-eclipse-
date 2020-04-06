
public class StringTest {
	/**
	 * @param args
	 */
	public static void main(String [] args) {
		String string = "hello,world!";
		System.out.println("delete: " + string.substring(0,5) + " " + string.substring(6));	//delete character(s) from string
		
		System.out.println("replace: " + string.replace('h', 'H'));//replace character(s)
		
		System.out.println("reverse: " + new StringBuffer(string).reverse().toString());
		
		//substring search, return position of the first letter in substring
		Integer integer = string.indexOf(",");
		if(integer != -1) {
			System.out.println("index: " + integer);
		}else {
			System.out.println("not found!");
		}
	}
}
