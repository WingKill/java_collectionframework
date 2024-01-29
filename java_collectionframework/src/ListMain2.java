import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListMain2 {

	public static void main(String[] args) {
		List<Integer> list = new LinkedList<Integer>();
		list.add(10); // 오토 박싱
		list.add(20);
		list.add(30);
		
		int n = 0;
		for(Iterator<Integer> itr = list.iterator(); itr.hasNext(); ) {
			// 증감 연산자가 없다. 그러므로 처음 변수 선언 및 초기화를 한 후, 나머지 구문을 반복하는 것. 
			n = itr.next(); // 오토 언박싱
			System.out.print(n + "\t");
		}
		System.out.println();				
	}
}
