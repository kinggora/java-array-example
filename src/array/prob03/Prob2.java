package array.prob03;

public class Prob2 {

  public static void main(String[] args) {
    int[] arr = generateRandom(10);
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
    int maxNum = getMaxNum(arr);
    System.out.println(maxNum);
  }

  public static int[] generateRandom(int n) {
    int[] arr = new int[n];
    for(int i = 0; i < n; i++) {
      arr[i] = (int) (Math.random() * 30) + 1;
    }
    return arr;
  }

  public static int getMaxNum(int[] arr) {
    int max = Integer.MIN_VALUE;
    for (int num : arr) {
      max = Math.max(max, num);
    }
    return max;
  }

}
