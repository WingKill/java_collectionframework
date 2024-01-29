import java.util.ArrayList;

public class TestMain1 {

	public static void main(String[] args) {
		/*- 원 객체 생성
		- ArrayList 에 차례대로 반지름이 1인 원 부터 10인원을 입력.
		- 차례대로 각각의 원 넓이 출력 
		- 10개의 원넓이 합산 하여 출력.*/
		
		ArrayList<Circle> circleList = new ArrayList<>();
		
		for(int i = 1; i <= 10 ; i++) {
			circleList.add(new Circle(i));
		}
		double sum = 0;
		
		for(Circle i : circleList) {
			double area = i.getArea();
			System.out.print(Math.round(area*100)/100.0 + "\t");
			sum += area;
		}
		System.out.println("모든 원의 넓이 : " + Math.round(sum*100)/100.0);
	}
}

class Circle{
	private double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		return radius * radius * Math.PI;
	}
}