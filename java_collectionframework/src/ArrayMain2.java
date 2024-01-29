import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ArrayMain2 {

	public static void main(String[] args) {
		List<Integer> list = new LinkedList<Integer>();
		
		for(int i = 0; i < 10 ; i++) {
			list.add(i+1);
		}
		
		int count = 0;
		for(Integer i : list) {
			count += i;
		}
		System.out.println(count);
		count = 0;
		for (int i = 0; i < list.size(); i++) {
			count += list.get(i);
		}
		System.out.println(count);
		
		// Scanner 클래스로 -1이 입력될 때까지 양의 정수를 입력받아 list를 저장. 
		// list를 검색하여 최대값을 출력하기. 
		
		Scanner sc = new Scanner(System.in);
		List<Integer> list2 = new LinkedList<Integer>();
		while(true) {
			try {
				int enter = sc.nextInt(); 
				if(enter == -1 ) // -1을 입력할 경우
					break;
				list2.add(enter);
			} catch (Exception e) {
				System.out.println("게임을 다시 시작해주세요.");
				list2 = new LinkedList<Integer>(); 
				continue;
			}			
		}
		
		int max = Integer.MIN_VALUE;
//		for(int i = 0; i< list2.size(); i++) {
//			if(max < list2.get(i))
//				max = list2.get(i);
//		}
		
		for(Integer num : list2) {
			max = Integer.max(max, num);
//			if(max < num) {
//				max = num;
//			}
		}
		System.out.println("list2 내 최대값 : "+max);
		sc.close();
	}

}
