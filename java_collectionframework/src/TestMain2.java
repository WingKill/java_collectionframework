import java.util.ArrayList;
import java.util.Scanner;

public class TestMain2 {

	public static void main(String[] args) {
		/*
		 * 5명의 별명(String)을 입력 받아 ArrayList에 저장하고 이들 중 별명의 길이가 제일 긴 별명을 출력하시오. (단, 각 별명의
		 * 길이는 모두 다르게 입력한다.)
		 */
		Scanner sc = new Scanner(System.in);
		ArrayList<String> strList = new ArrayList<String>();
		
		for(int i = 0 ; i < 5 ; i++) {
			String enter = sc.next();
			strList.add(enter);
		}
		String maxStr = null;
		int max = -1;
		
		for(String i : strList) {
			if(max < i.length()) {
				max = i.length();
				maxStr = i; 
			}
		}
		System.out.println("가장 긴 문자열 : "+maxStr);
		sc.close();
	}
}

