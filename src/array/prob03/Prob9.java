package array.prob03;

public class Prob9 {

	public static void main(String[] args) {
		char[][] alphabet = new char[5][5];
		char start='A';

		for(int i = 0; i < alphabet.length; i++) {
			for (int j = 0; j < alphabet[i].length; j++) {
				alphabet[i][j] = start;
				start++;
			}
		}

		System.out.println("			원본 배열");
		System.out.println("==========================");
		printArr(alphabet);

		System.out.println();

		for (int i = 0; i < alphabet.length; i++) {
			alphabet[i][i] = '*';
		}

		System.out.println("			수정된 배열");
		System.out.println("==========================");
		printArr(alphabet);
	}

	public static void printArr(char[][] arr) {
		for(int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]);
				System.out.print("\t\t\t");
			}
			System.out.println();
		}
	}
}
