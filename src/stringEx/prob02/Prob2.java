package stringEx.prob02;

import java.util.Scanner;

public class Prob2 {
 
	public static void main(String[] args) {
		String inputStr;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("문자열을 입력하세요. : ");
		inputStr = keyboard.nextLine();
		
		//프로그램을 구현하세요.
		StringBuilder sb = new StringBuilder(inputStr);
		sb.reverse();
		System.out.println(sb.toString().toUpperCase());
	}
}
