package stringEx.prob04;

import java.util.StringTokenizer;

public class Prob4 {
	public static void main(String[] args) {
		Prob4 p = new Prob4();
		String addr = "서울시,강남구,봉은사로,SSGJavaBackend";
		String[] addrArr = p.split(addr, ',');
		System.out.println("배열 크기 : " + addrArr.length);
		for(int i=0; i<addrArr.length; i++){
			System.out.print(addrArr[i] + " ");
		}		
	}

	public String[] split(String str, char separator){
		StringTokenizer st = new StringTokenizer(str, String.valueOf(separator));
		int length = st.countTokens();
		String[] result = new String[length];
		for (int i = 0; i < length; i++) {
			result[i] = st.nextToken();
		}
		return result;
	}
}



















