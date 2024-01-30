import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

public class TestMain16 {
	public static void main(String[] args) {
//		"그만"이 입력될 때까지 나라 이름과 인구를 입력 받아 저장하고, 
//		다시 나라 이름을 입력받아 인구를 출력하는 프로그램을 작성하라. 
//		- 다음 해시맵을 이용하라.
//		- containsKey 라는 함수를 사용해 보셔도 좋습니다.
//		=================================================================================
//		나라 이름과 인구를 입력하세요.(예: Korea 5000)
//		// 빈칸
//		나라 이름, 인구 >> Korea 5000
//		나라 이름, 인구 >> USA 1000000
//		나라 이름, 인구 >> Swiss 2000
//		나라 이름, 인구 >> France 3000
//		나라 이름, 인구 >> 그만
//		// 빈칸
//		인구 검색 >> France
//		France의 인구는 3000
//		인구 검색 >> 스위스
//		스위스 나라는 없습니다.
//		인구 검색 >> 그만
		
		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> country = new HashMap<>();	
		System.out.println("나라 이름과 인구를 입력하세요.(예: Korea 5000)" + "\n");
		while(true) {
			try {
				System.out.println("나라 이름, 인구 >> ");
				String input = sc.nextLine(); // 입력
				if(input.equals("그만")) { // "그만" 텍스트 입력 시 중지
					System.out.println();
					break;
				}				
				List<String> list = new ArrayList<String>(); // String 값을 받을 리스트
				for(StringTokenizer tokenizer = new StringTokenizer(input, " ");tokenizer.hasMoreTokens();) {
					list.add(tokenizer.nextToken()); // 리스트에 추가
				}				
				String countryName = list.get(0); // HashMap<String, Integer> 중 Key에 해당하는 String
				Integer popul = Integer.valueOf(list.get(1)); // HashMap<String, Integer> 중 Value에 해당하는 Integer
				country.put(countryName, popul); // Mapping
			} catch (Exception e) {
				System.out.println("게임을 다시 실행하세요.");
				return;
			}			
		}
					
		while(true) {
			System.out.println("인구 검색 >> ");
			String input2 = sc.next(); // 입력
			Set<String> countryNames = country.keySet(); // Set 클래스를 이용한 Key 값 세팅
			int count = 1; // 불일치 조건 : 모든 Key값과 일치하지 않는 횟수에 사용할 변수
			for(String s : countryNames) {
				if(input2.equals(s)) { // 일치
					System.out.println(s + "의 인구는 " + country.get(s));
					break;
				}else{// 불일치 or 종료
					if(input2.equals("그만")) { // 종료
						return;
					}else if(count == countryNames.size()) { // 모두 불일치
						System.out.println(input2 + " 나라는 없습니다.");
					}else {// 해당 텍스트 불일치.  
						count++;
					}
				}		
			}	
		}	
	}
}
