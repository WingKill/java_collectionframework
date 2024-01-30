import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestMain6 {

	public static void main(String[] args) {
		// Scanner 클래스로 -1이 입력될 때까지 양의 정수를 입력받아 List에 저장하고 List를 검색하여 가장 큰 수를 출력하는 프로그램을 작성하라.
//			정수(-1이 입력될 때까지)>> 10 6 22 6 88 77 -1
//			가장 큰 수는 88
		Scanner sc = new Scanner(System.in);
		System.out.println("정수(-1이 입력될 때까지)>>");
		List<Integer> intList = new ArrayList<>();
		while(true) {
			try {
				int num = sc.nextInt();
				if(num <= -1)
					break;
				intList.add(num);
			} catch (Exception e) {
				System.out.println("게임을 다시 시작하십시오.");
				return;
			}			
		}
		int maxNum = 0;
		for(Integer i : intList) {
			if(maxNum < i)
				maxNum = i;
		}
		System.out.println("최대값 : " + maxNum);
		sc.close();
	}
}

