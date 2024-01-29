import java.util.ArrayList;
import java.util.List;

public class ArrayMain {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>(); // 컬렉션 인스턴스를 생성하기.
		
		list.add("Toy");
		list.add("Box");
		list.add("Robot");
		
		
		for(int i = 0; i< list.size(); i++) {
			System.out.print((i+1) +":"+ list.get(i) + "\t");
		}
		System.out.println();
		
		for(String i : list) {
			System.out.print(i + "\t");
		}
		System.out.println();
		
		list.remove(0); 
		// 첫번째 인스턴스 삭제 후 나머지 인스턴스 참조.
		for(int i = 0; i< list.size(); i++) {
			System.out.print((i+1) +":"+ list.get(i) + "\t");
		}
		System.out.println();
		
		for (String string : list) {
			System.out.print(string + "\t");
		}
		System.out.println();
		
		// ArrayList의 작동방식 : 배열 기반.
		// 배열은 참조가 쉽지만, 인덱스 추가나 인덱스 일부 삭제 등이 되지 않는다.
		// 추가나 삭제를 위해서는 새로운 배열을 생성하여 진행해야 한다.
		int[] arr = new int[3];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		
		// LinkedList의 작동 방식을 간단하게 이해해보기.
		MyLinkedList link1 = new  MyLinkedList();
		MyLinkedList link2 = new  MyLinkedList();
		MyLinkedList link3 = new  MyLinkedList();
		
		link1.num = 1;
		link2.num = 2;
		link3.num = 3;
		
		link1.link = link2;
		link2.link = link3;
	}
}


class MyLinkedList{
	int num;
	MyLinkedList link;
	
	
}