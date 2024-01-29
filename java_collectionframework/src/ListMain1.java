import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListMain1 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Toy");
		list.add("Box");
		list.add("Robot");
		
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()) { // 리턴할 객체가 있는지 없는지 확인
			System.out.println(itr.next());
			// 커서가 가리키고 있는 객체를 리턴
		}
		
	}
}
