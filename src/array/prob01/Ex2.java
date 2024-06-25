package array.prob01;

import java.util.Random;

public class Ex2 {

  public static void main(String[] args) {
    int[] arr = new int[5];
    Random rand = new Random();
    // 1 ~ 100 범위의 난수를 생성하여 배열 항목 초기화
    for (int i = 0; i < arr.length; i++) {
      arr[i] = rand.nextInt(100) + 1; // 1 ~ 100
    }
    // 배열 항목 출력
    for (Integer i : arr) {
      System.out.print(i + " ");
    }
  }
}
