package array.prob03;
public class Prob1 {

	public static void main(String[] args) {
		
		int[] ia = new int[]{3,7,1,8,10,2,15,2,10}; 
		int[] ib = new int[]{1,2,3,4,5};
		
		Prob1 p = new Prob1();
		System.out.println("( 배열 ia )");
		p.calc(ia);
		System.out.println("( 배열ib )");
		p.calc(ib);
	}
	
	public void calc(int[] ix){
		int oddSum = 0;
		int evenSum = 0;
		for(Integer num : ix) {
			if(num % 2 == 0) {
				evenSum += num;
			} else {
				oddSum += num;
			}
		}
		System.out.println("홀수의 합 : " + oddSum);
		System.out.println("짝수의 합 : " + evenSum);
		
	}

}
