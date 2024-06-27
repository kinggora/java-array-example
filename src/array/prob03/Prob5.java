package array.prob03;
public class Prob5 {

	public static void main(String[] args) {
		int[] values = {57, 3, 43, 5, 39, 23, 55, 2};

		int maxValue = getValue(values, true);
		int minValue = getValue(values, false);

		System.out.println("최대값 = " + maxValue);
		System.out.println("최소값 = " + minValue);

	}

	public static int getValue(int[] values, boolean isMax) {
		int result = 0;
		if(isMax) {
			int max = Integer.MIN_VALUE;
			for(Integer value: values) {
				if(max < value) {
					max = value;
				}
			}
			result = max;
		} else {
			int min = Integer.MAX_VALUE;
			for (Integer value : values) {
				if(min > value) {
					min = value;
				}
			}
			result = min;
		}
		return result;
	}

}
