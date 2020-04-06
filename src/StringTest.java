import java.util.Locale;
import java.util.StringTokenizer;

public class StringTest {
	/**
	 * @param args
	 */
	public static void main(String [] args) {
		String string = "hello,world! I wanna be better tommorrow! Come on!!!";
		String string2 = "com.th.ttt";
		
		System.out.println("delete: " + string.substring(0,5) + " " + string.substring(6));	//delete character(s) from string
		
		System.out.println("replace: " + string.replace('h', 'H'));//replace character(s)
		
		System.out.println("reverse: " + new StringBuffer(string).reverse().toString()); //reverse the string
		
		//substring search, return position of the first letter in substring
		Integer integer = string.indexOf(",");
		if(integer != -1) {
			System.out.println("index: " + integer);
		}else {
			System.out.println("not found!");
		}
		
		//split
		String [] strings = string2.split("\\.");
		System.out.print("split: ");
		for (String xString : strings) {
			System.out.print(xString + " ");
		}
		System.out.println();
		
		//StringTokenizer
		StringTokenizer stringTokenizer = new StringTokenizer(string);//default tokenizer is " "
		System.out.print("tokenizer(default): ");
		while(stringTokenizer.hasMoreElements()) {
			System.out.print(stringTokenizer.nextElement());
		}
		System.out.println();
		System.out.print("tokenizer(','): ");
		StringTokenizer stringTokenizer2 = new StringTokenizer(string,",");
		while(stringTokenizer2.hasMoreElements()) {
			System.out.print(stringTokenizer2.nextElement() + " ");
		}
		System.out.println();
		
		//upperCase or lowerCase
		System.out.println("upperCase: " + string.toUpperCase());
		
		//regionMatch
		System.out.println("regionMatch: " + string.regionMatches(0, string2, 0, 2));
		
		//format
		System.out.print("format: ");
		System.out.format("%f%n", (double)Math.PI);
		System.out.format(Locale.CHINA, "%-10.4f\n",(double)Math.PI);
	}
}
