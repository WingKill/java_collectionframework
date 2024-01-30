import java.util.HashSet;
import java.util.Set;

class INum{
	private int num;
	public INum(int num) {
		this.num = num;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.valueOf(num);
	}
	
	@Override
	public int hashCode() {
		// 해시 코드가 같으면 같은 분류군에 속한다.
		return num % 3;   
	}
	
	@Override
	public boolean equals(Object obj) {
		// 값이 같으면 true, 다르면 false
		if(num == ((INum)obj).num)
			return true;
		else
			return false;
	}
}

public class TestMain9 {
	public static void main(String[] args) {
//		Set<Integer> lotto = new HashSet<Integer>();
//		while(lotto.size()<6) {// 중복 로직을 구현할 필요가 없음. set이 알아서 하기 때문에.
//			int randomNum = (int)(Math.random()*45 + 1);
//			lotto.add(randomNum);
//		}		
//		System.out.println(lotto);	
		Set<INum> nums = new HashSet<INum>();		
		INum num1 = new INum(1);
		INum num4 = new INum(5);
		INum num2 = new INum(4);
		INum num5 = new INum(8);
		INum num3 = new INum(7);
		
		nums.add(num1);
		nums.add(num2);
		nums.add(num3);
		nums.add(num4);
		nums.add(num5);
		
		System.out.println(nums);
		// [1, 1, 1]
		
	}
}
