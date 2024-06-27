package array.prob03;

public class ArrayUtil {
	public static void main(String[] args){
		ArrayUtil arrayUtil = new ArrayUtil();
		char[] s = {'J', 'a', 'v', 'a', 'P', 'r', 'o', 'g', 'r', 'a', 'm'};
		char[] a = arrayUtil.reverseString(s, 0, 3);
		arrayUtil.printCharArr(a);
		char[] b = arrayUtil.reverseString(s, 4, 7);
		arrayUtil.printCharArr(b);
		char[] c = arrayUtil.reverseString(s, 8, 10);
		arrayUtil.printCharArr(c);
		char[] d = arrayUtil.reverseString(s, 0, 10);
		arrayUtil.printCharArr(d);
	}

	public char[] reverseString(char[] s, int start, int end) {
		char[] result = s.clone();
		while(start < end) {
			char temp = result[start];
			result[start] = result[end];
			result[end] = temp;
			start++;
			end--;
		}
		return result;
	}

	public void printCharArr(char[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
		System.out.println();
	}
}
