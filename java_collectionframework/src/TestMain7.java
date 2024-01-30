import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class TestMain7 {

	public static void main(String[] args) {
//		아래를 순차적으로 돌려서 나오도록 하시오.
		List<String> list = new ArrayList<>(); // 컬렉션 인스턴스 생성

		// 컬렉션 인스턴스에 문자열 인스턴스 저장
		list.add("Toy");
		list.add("Box");
		list.add("Robot");
		
		for(String i : list) {
			System.out.print(i + " ");
		}
		System.out.println();
		for(int i = 0 ; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println();
		//Iterator<String> iter = list.iterator();
		ListIterator<String> iter = list.listIterator();
		while(iter.hasNext()) {
			System.out.print(iter.next() + " ");
		}		
	}
}
