import java.util.HashSet;
import java.util.Set;

class Person{
	private String name;
	private int age;
	
	public Person(String name,int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public int hashCode() {
		if(age < 25)
			return 1;
		else 
			return 2;
	}
	
	@Override
	public boolean equals(Object obj) {
//		if(name.equals(((Person)obj).name) && age == ((Person)obj).age){
//			return true;
//		}
//		else
//			return false;
		if (obj instanceof Person) {
			Person person = (Person) obj;
			if(name.equals(obj) && age == person.age)
				return true;
		}
		
		return false;
	}
	
	@Override
	public String toString() {
		// LEE(10세)
		return name + "(" +String.valueOf(age)+"세)";
	}
}

public class TestMain10 {
	public static void main(String[] args) {
		Set<Person> hSet = new HashSet<Person>();

		hSet.add(new Person("LEE", 10));
		hSet.add(new Person("LEE", 10));
		hSet.add(new Person("PARK", 35));
		hSet.add(new Person("PARK", 35));

		System.out.println("저장된 데이터 수: " + hSet.size());
		System.out.println(hSet);
		/*
		 * 저장된 데이터 수: 2 [LEE(10세), PARK(35세)]
		 */

	}
}
