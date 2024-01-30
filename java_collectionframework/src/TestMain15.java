import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class TestMain15 {
	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();
		map.put(45, "value");
		map.put(37, "James");
		map.put(23, "Martin");
		
		System.out.println("23번: " + map.get(23));
		System.out.println("37번: " + map.get(37));
		System.out.println("45번: " + map.get(45));
		
		Set<Integer> ks = map.keySet();	
		
		for(Integer i : ks)
			System.out.print(i + "\t");
		System.out.println();
		
		for(Integer i : ks)
			System.out.print(map.get(i) + "\t");
		System.out.println();
		
		for(Iterator<Integer> itr = ks.iterator();itr.hasNext();)
			System.out.print(map.get(itr.next()) + "\t");
		System.out.println();
	}
}
