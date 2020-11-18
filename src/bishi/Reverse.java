package bishi;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,2,5};
		int b[] = {2,6,8,9};
		reverseMergeSortArray(a, b);
	}
	
	public static int [] reverseMergeSortArray(int a[], int b[]) {
		int length_a = a.length;
		int length_b = b.length;
		int []c = new int[length_a + length_b];
		
		int i = a.length -1;
		int j = b.length -1;
		int k = 0;
		int length = a.length < b.length ? a.length : b.length;
		
		for(; k < length; k ++) {
			if(a[i] > b[j]) {
				c[k] = a[i--];
			}else
				c[k] = b[j--];
		}
		if(length_a > length_b)
			for(k = length; k < c.length; k++) {
				c[k] = a[i--];
			}
		else {
			for(k = length ; k < c.length; k++) {
				c[k] = b[j--];
			}
		}
		System.out.println(c);
		return c;
	}
}
