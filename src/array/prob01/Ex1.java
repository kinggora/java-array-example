package array.prob01;


public class Ex1 {

  public static void main(String[] args) {
    Ex1 ex1 = new Ex1();
    int[] ia = new int[]{3,7,1,8,10,2,15,2,10};
    int[] ib = new int[]{1,2,3,4,5};

    ex1.sumOddEven("ia", ia);
    ex1.sumOddEven("ib", ib);
  }


  public void sumOddEven(String arrName, int[] arr) {
    int oddSum = 0;
    int evenSum = 0;
    for(Integer num : arr) {
      if(num % 2 == 0) {
        evenSum += num;
      } else {
        oddSum += num;
      }
    }
    System.out.println("( 배열 " + arrName + " )");
    System.out.println("홀수의 합 : " + oddSum);
    System.out.println("짝수의 합 : " + evenSum);
  }


}
