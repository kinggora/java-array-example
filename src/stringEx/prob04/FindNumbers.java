package stringEx.prob04;

public class FindNumbers {
	
	public static void main(String[] args) {
		FindNumbers fn = new FindNumbers();
		
		long number = 228754462;
		System.out.println( "입력 숫자 = " + number );
		System.out.println("2 횟수 => " + fn.countNumber(number, 2));//3을 리턴
		System.out.println("4 횟수 => " + fn.countNumber(number, 4));//2를 리턴
	}

	private int countNumber(long number, int i) {
		long temp = number;
		int count = 0;
		while(temp > 0) {
			if(temp % 10 == i) {
				count++;
			}
			temp /= 10;
		}
		return count;
	}
}
