package array.prob03;
public class Prob3 {
	public static void main(String[] args) {
		int[] array = {3, 17, 12, 43, 3, 17, 3, 8, 21, 8};
		System.out.println("<< 중복되지 않은 숫자 >>");
		printUniqueNumber(array);
	}

	private static void printUniqueNumber(int[] array) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < array.length; i++) {
			boolean duplicate = false;
			for(int j = 0; j < array.length; j++) {
				if(i == j) {
					continue;
				}
				if(array[i] == array[j]) {
					duplicate = true;
					break;
				}
			}
			if(!duplicate) {
				sb.append(array[i]);
				sb.append(", ");
			}
		}
		int index = sb.lastIndexOf(",");
		if(index != -1) {
			System.out.println(sb.substring(0, index));
		}
	}
}
