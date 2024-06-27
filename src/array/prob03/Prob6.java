package array.prob03;

import java.util.Arrays;

public class Prob6 {

	public static void main(String[] args) {
		Prob6 median = new Prob6();

		int[] values1 = { 10, 4, 53, 63, 17, 37, 52, 16, 33, 65 };
		System.out.println("input : "+Arrays.toString(values1));
		System.out.println("median : "+median.findMedian(values1));
		System.out.println("=================================================");
		
		int[] values2 = { 32, 53, 52, 76, 15, 98, 76, 65, 36, 10 };
		System.out.println("input : "+ Arrays.toString(values2));
		System.out.println("median : "+median.findMedian(values2));
	}

	public int findMedian(int[] values) {
		double avg = 0.0;
		for (Integer value : values) {
			avg += value;
		}
		avg = avg / values.length;
		int median = values[0];
		for (int i = 1; i < values.length; i++) {
			double min = Math.abs(avg - median);
			double temp = Math.abs(avg - values[i]);
			if(min > temp) {
				median = values[i];
			} else if(min == temp) {
				median = Math.min(median, values[i]);
			}
		}
		return median;
	}
}
