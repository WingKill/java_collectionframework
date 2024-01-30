import java.util.LinkedList;
import java.util.Queue;

public class TestMain13 {
	public static void main(String[] args) {
		Queue<String> que = new LinkedList<>();
		que.offer("Box");
		que.offer("Toy");
		que.offer("Robot");
		
		System.out.println("다음은 "+ que.peek());
		
		System.out.println(que.poll());
		System.out.println(que.poll());
		
		System.out.println("다음은 " + que.peek());
		
		System.out.println(que.poll());
	}
}
