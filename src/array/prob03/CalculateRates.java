package array.prob03;
public class CalculateRates {
	public static void main(String[] args) throws Exception {
		CalculateRates calculateRates = new CalculateRates();

		// 6.0%, 2.0%, 12.0%, 49.0%, 31.0%
		calculateRates.calculate(new int[] { 10, 30, 20, 80, 50 });

		// 20.0%, 20.0%, 20.0%, 20.0%, 20.0%
		calculateRates.calculate(new int[] { 50, 50, 50, 50, 50 });

		// 7.0%, 13.0%, 20.0%, 27.0%, 33.0%
		calculateRates.calculate(new int[] { 1, 2, 3, 4, 5 });
	}

	public void calculate(int[] nums) throws Exception {
		double sum = 0.0;
		for(Integer num : nums) {
			sum += num;
		}
		for(Integer num : nums) {
			double ratio = num / sum * 100;
			long round = Math.round(ratio);
			for(int i = 0; i < round; i++) {
				System.out.print("*");
			}
			System.out.println("(" + (double) round + "%)");
		}

	}
}