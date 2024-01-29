import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class ListMain3 {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Toy", "Box", "Robot", "Box");
		list = new ArrayList<>(list);
		
		ListIterator<String> litr = list.listIterator(); // 양방향 반복자 획득
		// Iterator : 단방향 반복자. 배열 기반.
		// ListIterator : 양방향 반복자. 배열 기반.

		String str;
		// 
		while (litr.hasNext()) { // 왼쪽에서 오른쪽으로 이동을 위한 반복문
			str = litr.next();
			System.out.print(str + "\t");
			if (str.equals("Toy")) // "Toy" 만나면 "Toy2" 저장
				litr.add("Toy2");
			// Toy	Toy2	Box	Robot	Box
			// 출력이 안되는 이유? 먼저 toy2를 생성하고, 이후 커서를 옮겨 진행하니까.
			// Toy Toy2 생성 후, 모든 데이터들과 커서값도 1씩 늘린다. add()의 역할이 그렇다.
			// 그래서 커서가 가리키는 곳이 index가 2인 곳이 되버려서, Box부터 쭉 출력하는 것.
		}
					
		System.out.println();
		
		while (litr.hasPrevious()) { // 오른쪽에서 왼쪽으로 이동을 위한 반복문
			str = litr.previous();
			System.out.print(str + "\t");
			if (str.equals("Robot")) // "Robot" 만나면 "Robot2" 저장
				litr.add("Robot2");
			// Box Robot Robot2 Box Toy2 Toy
			// 이라고만 생각했는데... add()를 진행하면 먼저 list에 들어가는 데이터들은 
			// Toy	Toy2	Box	Robot2 Robot	Box
			// 가 된다. 커서값도 1씩 다시 오르기 때문에, 
			// Toy	Toy2	Box	Robot	Box
			// 에서 기존에 Box와 Robot을 출력하고,가운데 Box에 있던 커서는
			// 1이 올라감에 따라 새로 생성된 Robot2를 가리키게 된다.
			// Toy	Toy2	Box	Robot2 Robot	Box
		}
		System.out.println();
		
		while (litr.hasNext()) { // 왼쪽에서 오른쪽으로 이동을 위한 반복문
			str = litr.next();
			System.out.print(str + "\t");
		}
	}
}
