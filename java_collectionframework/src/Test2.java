import java.util.HashSet;


public class Test2 {
	public static void main(String[] args) {	
        HashSet<Num> set = new HashSet<>();
        set.add(new Num(7799));
        set.add(new Num(9955));
        set.add(new Num(7799));
        
        System.out.println("인스턴스 수: " + set.size());
        for(Num n : set)
            System.out.print(n.toString() + '\t');
        System.out.println();
	}
}
/*
====출력
인스턴스 수: 2
7799 9955
*/

class Num{
	private int num;
	public Num(int num) {
		this.num = num;
	}
	
	// toString()을 통한 출력값을 설정
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.valueOf(num);
	}
	
	// 같은 값을 가진 인스턴스는 동일 인스턴스로 취급하도록 hashCode() 설정 
	@Override
	public int hashCode() { 
		return num%2;
	}
	
	// 같은 값을 가진 인스턴스는 동일 인스턴스로 취급하도록 equals() 설정
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Num) {
			Num num = (Num) obj;
			if(num.num == this.num)
				return true;
		}
		return false;
	}
}