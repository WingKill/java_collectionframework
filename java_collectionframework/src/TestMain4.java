import java.util.ArrayList;
import java.util.Scanner;

public class TestMain4 {

	public static void main(String[] args) {
		/*
		 5명의 사람 이름을 입력 받아서 ArrayList에 저장한 후에 이들 중 '김'씨 성을 가진 사람을 모두 출력하시오.
		 */
		Scanner sc = new Scanner(System.in);
		ArrayList<String> nameList = new ArrayList<String>();
		System.out.println("5명의 이름을 차례대로 입력하세요. ");
		for(int i = 0 ; i < 5 ; i++) {
			String enter = sc.next();
			nameList.add(enter);
		}
		
		for(String name : nameList) {
			if(name.charAt(0) == '김') {
				System.out.println(name);
			}
		}
		sc.close();
	}
}



