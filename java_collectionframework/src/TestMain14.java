import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class TestMain14 {
	public static void main(String[] args) {
		Deque<String> deq = new ArrayDeque<String>();
		
		deq.offerFirst("1. Box");
		deq.offerFirst("2. Toy");
		deq.offerFirst("3. Robot");
		
		System.out.println(deq.pollFirst());
		System.out.println(deq.pollFirst());
		System.out.println(deq.pollFirst());
	}
}
