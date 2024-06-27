package array.prob03;

import java.util.Arrays;

public class SortUtil {
	public static void main(String[] args){
		int[] inputNumbers = {7, 5, 2, 19, 34, 51, 32, 11, 67, 21};
		SortUtil sortUtil = new SortUtil();
		int[] sortedNumbers = sortUtil.ascending(inputNumbers);
    for (int num : sortedNumbers) {
      System.out.print(num + " ");
    }
	}
	public int[] ascending(int[] inputNumbers) {
		int[] result = inputNumbers.clone();
    for(int i = 0; i < result.length - 1; i++) {
			int min = i;
			for(int j = i + 1; j < result.length; j++) {
				if(result[min] > result[j]) {
					min = j;
				}
			}
			if(min != i) {
				swap(result, i, min);
			}
		}
		return result;
	}

	private void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
