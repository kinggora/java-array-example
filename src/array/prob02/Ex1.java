package array.prob02;

public class Ex1 {
	public static void main(String[] args) {
		int[] arr = {10, 30, 20, 80, 50};
		double sum = 0.0;
		for (Integer num : arr) {
			sum += num;
		}
		for(Integer num : arr) {
			double ratio = num / sum * 100;
			int cnt = (int) ratio;
			for(int i = 0; i < cnt; i++) {
				System.out.print("*");
			}
			System.out.println("(" + ratio + "%)");
		}
	}
}
